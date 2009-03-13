#! /usr/bin/env python
#! /usr/bin/env python

import sys
import os
import subprocess
from optparse import OptionGroup
from optparse import OptionParser
from dendropy import datasets
from dendropy import splits
from dendropy import treedists
from biosql import BioSql

_prog_usage = '%prog -d <engine://user:password@host:port/database> <BIODATABASE> <NAME>'
_prog_version = 'BioSql-Get-Tree Version 1.0'
_prog_description = 'retrieves a tree by name'
_prog_author = 'Jeet Sukumaran and Mark T. Holder'
TEST_BIODB = "dbhack-test"

def main():
    """
    Main CLI handler.
    """
    
    parser = OptionParser(usage=_prog_usage, 
        add_help_option=True, 
        version=_prog_version, 
        description=_prog_description)    
       
    parser.add_option('-d', '--database',
        action='store',
        dest='db_uri',
        type='string', # also 'float', 'string' etc.
        default=None,
        metavar='URI',
        help='[MANDATORY] database URI (e.g. "postgres://scott:tiger@localhost/demodb")')
        
    parser.add_option('-q', '--quiet',
        action='store_true',
        dest='quiet',
        default=False,
        help='suppress progress messages')  
        
    parser.add_option('-e', '--echo',
        action='store_true',
        dest='echo',
        default=False,
        help='echo database communications')
        
    (opts, args) = parser.parse_args()

    if opts.db_uri is None:
        sys.stderr.write('Database URI needs to be specified ("-d" flag; see "--help").\n')
        sys.exit(1)
        
    if len(args) == 0:
        sys.stderr.write("Tree file(s) not specified.\n")
        sys.exit(1)        
    
    src_fpaths = []
    for a in args:
        f = os.path.expandvars(os.path.expanduser(a))
#         src_fpaths.append(f)
        if not os.path.exists(f):
            sys.stderr.write('File not found: "%s"\n' % f)
            sys.exit(1)
        elif not os.path.isfile(f):
            sys.stderr.write('Directory specified instead of file: "%s"\n' % f)
            sys.exit(1)
        else:
            src_fpaths.append(f)
            
    for f in src_fpaths:
    
        ## initial read ##
        if not opts.quiet:
            sys.stderr.write("Pre-import parse ...\n")
        ds1 = datasets.Dataset()
        ds1.read(open(f, "rU"), "nexml")
        tree_list = []
        for trees_block in ds1.trees_blocks:
            for tree in trees_block:
                tree_list.append(tree)
    
        ## import ##
        cmd = ["python", "biosql-insert.py", 
                '-d %s' % opts.db_uri, 
                '-b %s' % TEST_BIODB]
        if opts.quiet:
            cmd.append("-q")
        if opts.echo:
            cmd.append("-e")
        cmd.append(f)
        cmd = " ".join(cmd)
        if not opts.quiet:
            sys.stderr.write("Executing import: %s\n" % cmd)
        input_p = subprocess.Popen([cmd],
                                shell=True,
                                stdout=subprocess.PIPE,
                                stderr=subprocess.PIPE)                               
        stdout, stderr = input_p.communicate()
        if input_p.returncode:
            sys.stderr.write('*** IMPORT ERROR ***\n')
            sys.stderr.write(stderr)
            sys.exit(1)
            
        names = stdout.split("\n")
        for idx, name in enumerate(names):
            if name:
                tree_list[idx].name = name
            
        for idx, model_tree in enumerate(tree_list):   
            ## export ##
            cmd = ["python", "biosql-gettree.py", 
                    '-d %s' % opts.db_uri, 
                    '-b %s' % TEST_BIODB]
            if opts.quiet:
                cmd.append("-q")
            if opts.echo:
                cmd.append("-e")
            cmd.append(tree.name)
            cmd = " ".join(cmd)
            if not opts.quiet:
                sys.stderr.write("Executing export: %s\n" % cmd)
            export_p = subprocess.Popen([cmd],
                                    shell=True,
                                    stdout=subprocess.PIPE,
                                    stderr=subprocess.PIPE)        
            stdout, stderr = export_p.communicate()
            if export_p.returncode:
                sys.stderr.write('*** EXPORT ERROR ***\n')
                sys.stderr.write(stderr)
                sys.exit(1)
                
            ds2 = datasets.Dataset()
            result_tree = ds2.trees_from_string(stdout, "nexml")[0]
            
            ## compare ##
            if not opts.quiet:
                sys.stderr.write("Comparing splits ...\n")
            taxa_block = model_tree.taxa_block
            result_tree.normalize_taxa(taxa_block)
            assert model_tree.taxa_block is result_tree.taxa_block
            splits.encode_splits(model_tree)
            splits.encode_splits(result_tree)
            sd = treedists.symmetric_difference(model_tree, result_tree)
            if not opts.quiet:
                sys.stderr.write("Symmetric distance = %d\n" % sd)
            rfd = treedists.robinson_foulds_distance(model_tree, result_tree)
            if not opts.quiet:
                sys.stderr.write("Weighted Robinson-Fould's distance = %d\n" % rfd)            
            if abs(rfd) < 0.0001:
                sys.stdout.write("%s (%d/%d): SUCCESS\n" % (f, idx+1, len(tree_list)))
            else:
                sys.stdout.write("%s (%d/%d): FAIL\n" % (f, idx+1, len(tree_list)))
                            
        
if __name__ == "__main__":
    main()
    