#! /usr/bin/env python

import re
import sys
import os
from xml.sax.saxutils import quoteattr
from xml.etree import ElementTree
from dendropy import datasets

TREE_COUNTER = 0

def protect_attr(x):
    if x:
        x = quoteattr(x)
        if x.startswith('"') or x.startswith("'"):
            return x[1:-1]
        else:
            return x
    else:
        return x

class Author(object):
    def __init__(self):
        self.author_id = None
        self.first_name = None
        self.last_name = None
        self.email = None

class Matrix(object):
    def __init__(self):
        self.matrix_id = None
        self.matrix_name = None
        self.data_type = None
        self.nchar = None
                        
class Analysis(object):
    def __init__(self):
        self.analysis_id = None
        self.analysis_name = None
        self.software = None
        self.algorithm = None
        self.input_matrices = []
        self.output_trees = []
        
class AnalysisOutputTree(object):
    def __init__(self):
        self.tree_id = None
        self.tree_label = None
        self.tree_title = None

class TreeBaseRecord(object):
    """A single record from the TreeBase dump"""
    
    study_id_pattern = re.compile("^\s*study_id = '(.*)'$")
    citation_pattern = re.compile("^\s*citation = '(.*)'$")
    abstract_pattern = re.compile("^\s*abstract = '(.*)'$")
    
    def __init__(self, src_lines):
        """
        Given `src_lines`, a list of lines of a single record, this
        will instantiate and populate an object corresponding 
        to the data.
        """
        self.study_id = None
        self.citation = None
        self.abstract = None
        self.authors = []
        self.study_matrices = {}
        self.history_date = None
        self.history_time = None
        self.history_person = None
        self.history_event = None
        self.analyses = []
        
        self.parse_src_lines(src_lines)
        
    def process_entry(self, s):
        parts = s.split("=", 1)
        assert len(parts) == 2, '"%s" decomposes to %d parts' % (s, len(parts))
        key = parts[0].strip()
        val = parts[1].strip()
        if val[0] == "'":
            val = val[1:]
        if val[-1] == "'":
            val = val[:-1]
        return key, val                    
        
    def process_author(self, src_lines):
        sys.stderr.write("-- (processing author)\n")
        a = Author()
        for line in src_lines:
            if '=' not in line:
                continue
            key, val = self.process_entry(line)
            if key == 'author_id':
                a.author_id = val
            elif key == 'first_name':
                a.first_name = val
            elif key == 'last_name':
                a.last_name = val
            elif key == 'email':
                a.email = val
        self.authors.append(a)                
        
    def process_history(self, src_lines):
        sys.stderr.write("-- (processing history)\n")        
        for line in src_lines:
            if '=' not in line:
                continue
            key, val = self.process_entry(line)                
            if key == 'date':
                self.history_date = val
            elif key == 'time':
                self.history_time = val
            elif key == 'person':
                self.history_person = val
            elif key == 'event':
                self.history_event = val                        
        
    def process_study_matrix(self, src_lines):
        sys.stderr.write("-- (processing matrix)\n")
        m = Matrix()
        for line in src_lines:
            if '=' not in line:
                continue
            key, val = self.process_entry(line)
            if key == 'matrix_id':
                m.matrix_id = val
            elif key == 'matrix_name':
                m.matrix_name = val
            elif key == 'data_type':
                m.data_type = val
            elif key == 'nchar':
                m.nchar = val
        self.study_matrices[m.matrix_id] = m
        
    def process_analysis(self, src_lines):
        sys.stderr.write("-- (processing analysis)\n")
        a = Analysis()
        for line in src_lines:
            if line.startswith("		>"):
                break
            if '=' not in line:
                continue
            key, val = self.process_entry(line)
            if key == 'analysis_id':
                a.analysis_id = val
            elif a == 'analysis_name':
                self.analysis_name = val
            elif key == 'software':
                a.software = val
            elif key == 'algorithm':
                a.algorithm = val
        sublines = []
        process_func = None
        for line in src_lines:
            if line.startswith("		>"):
                if process_func is not None and len(src_lines) > 0:                    
                    process_func(sublines, a)
                    sublines = []
                if line.startswith("		>INPUT_MATRIX"):
                    process_func = self.process_analysis_input_matrix
                elif line.startswith("		>OUTPUT_TREE"):
                    process_func = self.process_analysis_output_tree
                else:
                    raise Exception("Unrecognized field '%s'" % line)
            else:
                sublines.append(line)
        if process_func is not None and len(src_lines) > 0:
            process_func(src_lines, a)
        self.analyses.append(a)            
        
    def process_analysis_input_matrix(self, src_lines, analysis):
        sys.stderr.write("-- (processing analysis input matrices)\n")
        matrix_id = None
        for line in src_lines:
            if '=' not in line:
                continue
            key, val = self.process_entry(line)                
            if key == 'matrix_id': 
                matrix_id = val
                break
        try:                
            analysis.input_matrices.append(self.study_matrices[matrix_id])                
        except:
            sys.stderr.write("*** Matrix %s not found")
        
    def process_analysis_output_tree(self, src_lines, analysis):
        sys.stderr.write("-- (processing analysis output tree)\n")
        t = AnalysisOutputTree()
        for line in src_lines:
            if '=' not in line:
                continue
            key, val = self.process_entry(line)                
            if key == 'tree_id': 
                t.tree_id = val
            elif key == 'tree_label':
                t.tree_label = val
            elif key == 'tree_title':
                t.tree_title = val
            elif key == 'tree_type':
                t.tree_type = val
        analysis.output_trees.append(t)        

    def parse_src_lines(self, src_lines):    
        self.study_id = protect_attr(TreeBaseRecord.study_id_pattern.match(src_lines[0]).group(1))
        self.citation = protect_attr(TreeBaseRecord.citation_pattern.match(src_lines[1]).group(1))
        self.abstract = protect_attr(TreeBaseRecord.abstract_pattern.match(src_lines[2]).group(1))
        sublines = []
        process_func = None
        for line in src_lines[3:]:
            if line.startswith("	>"):
                if process_func is not None and len(src_lines) > 0:                    
                    process_func(src_lines)
                    src_lines = []
                if line.startswith("	>AUTHOR"):
                    process_func = self.process_author
                elif line.startswith("	>HISTORY"):
                    process_func = self.process_history
                elif line.startswith("	>MATRIX"):
                    process_func = self.process_study_matrix
                elif line.startswith("	>ANALYSIS"):
                    process_func = self.process_analysis
                else:
                    raise Exception("Unrecognized field '%s'" % line)
            else:
                src_lines.append(line)
        if process_func is not None and len(src_lines) > 0:
            process_func(src_lines)                                                                                                                                                    
        
def process_src_lines(src_lines):
    global TREE_COUNTER
    tbase = TreeBaseRecord(src_lines)
    for analysis in tbase.analyses:
        tfilepath = os.path.join('data/trees', analysis.analysis_id + ".tre")
        tfile = open(tfilepath, "ru")
        src = datasets.Dataset()
        try:
            src.read(tfile, "nexus")
        except:
            sys.stderr.write("*** ERROR PARSING TREEFILE: %s\n\n" % tfile.name)
            continue
        trees = src.trees_blocks[0]
        assert len(trees) == len(analysis.output_trees)
        for tree_idx, tree in enumerate(trees):
#     <nex:external property="cdao:has_publication" xmlns="dbhack1/phylr">
#         <study id="S318">
#             <author>
#                 <firstname>A</firstname>
#                 <lastname>Aaaaa</lastname>
#                 <email>a@analysis.com</email>
#             </author>
#             <author>
#                 <firstname>B</firstname>
#                 <lastname>Bbbbb</lastname>
#                 <email>b@b.com</email>
#             </author> 
#             <citation>
#                 Baum, D. A., R. L. Small, J. F. Wendel. 1998. Biogeography and floral evolution of baobabs (Adansonia, Bombacaceae) as inferred from multiple data sets. Syst. Biol., 47(2):181-207.
#             </citation>
#             <abstract>
#                 Blah blah blah blah blah.
#             </abstract>
#         </study>        
#     </nex:external>        
            dest = datasets.Dataset()
            dest.trees_from_string(tree.compose_newick(), format="newick")
            dest.trees_blocks[0][0].oid = analysis.output_trees[tree_idx].tree_id
            dest.trees_blocks[0][0].label = analysis.output_trees[tree_idx].tree_label
            
            ext_doc = ElementTree.Element("nex:external")
            dest.extensions.append(ext_doc)
#             ext_doc.attrib["property"] = "cdao:has_publication"
            ext_doc.attrib["xmlns"] = "dbhack1/phylr"
            
            ext_doc_study = ElementTree.Element("study")
            ext_doc.append(ext_doc_study)
            if tbase.study_id:
                ext_doc_study.attrib["id"] = tbase.study_id
            if tbase.citation:  
                ext_doc_study_citation = ElementTree.Element("citation")
                ext_doc_study.append(ext_doc_study_citation)
                ext_doc_study_citation.text = tbase.citation
            if tbase.abstract:                
                ext_doc_study_abstract = ElementTree.Element("abstract")
                ext_doc_study.append(ext_doc_study_abstract)
                ext_doc_study_abstract.text = tbase.abstract
            for author in tbase.authors:
                ext_doc_study_author = ElementTree.Element("author")
                ext_doc_study.append(ext_doc_study_author)
                if author.first_name:
                    ext_doc_study_author.attrib["firstname"] = author.first_name
                if author.last_name:
                    ext_doc_study_author.attrib["lastname"] = author.last_name
                if author.email:
                    ext_doc_study_author.attrib["email"] = author.email
            
#             <nex:external property="cdao:has_data"  xmlns="dbhack1/phylr">
#                 <analysis id="S318A123" name="crazy" software="mrbayes" algorithm="bayesian">
#                     <inputmatrix id="M383">
#                         <datatype>morphological<datatype>
#                         <nchar>33</nchar>
#                     </inputmatrix>
#                     <inputmatrix id="M384">
#                         <datatype>dna<datatype>
#                         <nchar>33</nchar>
#                     </inputmatrix>
#                 </analysis>
#             </nex:external>            
            ext_tree = ElementTree.Element("nex:external")
            dest.trees_blocks[0][0].extensions.append(ext_tree)
#             ext_tree.attrib["property"] = "cdao:has_data"
            ext_tree.attrib["xmlns"] = "dbhack1/phylr"
            ext_tree_analysis = ElementTree.Element("analysis")
            ext_tree.append(ext_tree_analysis)
            if analysis.analysis_id:
                ext_tree_analysis.attrib["id"] = analysis.analysis_id
            if analysis.analysis_name:                
                ext_tree_analysis.attrib["name"] = analysis.analysis_name
            if analysis.software:                
                ext_tree_analysis.attrib["software"] = analysis.software
            if analysis.algorithm:                
                ext_tree_analysis.attrib["algorithm"] = analysis.algorithm
            for matrix in analysis.input_matrices:
                ext_tree_analysis_matrix = ElementTree.Element("inputmatrix")
                ext_tree_analysis.append(ext_tree_analysis_matrix)
                if matrix.matrix_name:
                    ext_tree_analysis_matrix.attrib["name"] = matrix.matrix_name
                if matrix.data_type:
                    ext_tree_analysis_matrix.attrib["datatype"] = matrix.data_type
                if matrix.nchar:
                    ext_tree_analysis_matrix.attrib["nchar"] = matrix.nchar
                      
            TREE_COUNTER += 1
            ofpath = os.path.join("results", ("Tree%06d.nexml" % TREE_COUNTER))
            dest.write(open(ofpath, "w"), format="nexml")
            verify = datasets.Dataset()
#             verify.read(open(ofpath, "r"), "nexml")
            try:
                verify.read(open(ofpath, "r"), "nexml")
            except Exception, e:
                chklog.write(ofpath + "\n")
                
    # read all trees associated with this record into a single dataset
    # annotate trees
    # for each tree -> write to nexml
    

master_src = "data/treebase-src-dump-2009-01.txt"
# master_src = "data/test-src.txt"

def run():
    rec_count = 0
    src_lines = []
    rec_start_line = 1
        
    for line_idx, line in enumerate(open(master_src, "r")):
        line = line.replace("\n", "")
        if not line:
            continue
        if line.startswith(">STUDY"):       
            if len(src_lines) > 0:
                rec_count += 1
                sys.stderr.write("Processing record %d (lines %d to %d)\n" % (rec_count, rec_start_line, line_idx-1))
                rec_start_line = line_idx
                process_src_lines(src_lines)                        
                src_lines = [] 
        else:
            src_lines.append(line)
            
    if src_lines:
        rec_count += 1
        sys.stderr.write("Processing record %d (lines %d to %d)\n" % (rec_count, rec_start_line, line_idx-1))
        rec_start_line = line_idx
        process_src_lines(src_lines)                        
        src_lines = [] 
        
    sys.stderr.write("###\n%d records processed\n" % rec_count)

chklog = open("/Users/jeet/Desktop/to_remove.txt", "w")
run()
