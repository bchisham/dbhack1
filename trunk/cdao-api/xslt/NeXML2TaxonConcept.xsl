<?xml version="1.0" encoding="UTF-8"?>
<!--
    This is an experimental conversion of NeXML to TDWG TaxonConcept/TaxonName ontology
    - if we use the same id convensions as the CDAO conversion then we should be able
    - to combine the two types of data.
    
    Each node is a subclass of TaxonConcept
    Each OTU is a subclass of the terminal node (and so of taxon concept)
    Each node and OTU has a disjoint with its siblings
    Each OTU has a hasName to a TaxonName containing the label.
    
    Each OTU could have a description derived from the characters - but that is another story...
    
    OTUs may, in reality be specimens in which case the TC subclasses generated for the OTUs 
    only contain a single individual.
    
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
    xmlns:nex="http://www.nexml.org/1.0" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
    xmlns:cdao="http://www.evolutionaryontology.org/cdao.owl#"
    xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:owl="http://www.w3.org/2002/07/owl#"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xml:space="default">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/nex:nexml">
        <rdf:RDF xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
            xmlns:owl="http://www.w3.org/2002/07/owl#">
            
            <xsl:comment>
              =======  All nodes are classes. =======
            </xsl:comment>
            <xsl:apply-templates select="descendant::nex:node"/>
            
            <xsl:comment>
                ======= Edges define subClassing of nodes =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:edge"/>
            
            <xsl:comment>
                ======= OTUs are Classes - possibly with TaxonNames =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:otu"/>
            
            <xsl:comment>
                ======= OTUs are subclasses of terminal nodes (the ones with @otu) =======
            </xsl:comment>
             
            <xsl:apply-templates select="descendant::nex:node[@otu]" mode="joining-otus"/>
            
            <xsl:comment>
                ======= Trees and networks are subclasses of TaxonConcept =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:network"/>
            <xsl:apply-templates select="descendant::nex:tree"/>
            
            <xsl:comment>
                ======= Nodes with @root=true are subClasses of their tree/network =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:node[@root = 'true']" mode="rooting"/>
            
            <xsl:comment>
                ======= Rootedge defines root node which is therefore direct subClass of their tree =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:rootedge" />
            
            <xsl:comment>
                ======= In unrooted trees every node is a direct subclass of the tree =======
            </xsl:comment>
            
            <xsl:apply-templates select="descendant::nex:tree[not (@root = 'true')]" mode="rooting-unrooted"/>
            
        </rdf:RDF>
    </xsl:template>

    <!-- Each node is a TC class -->
    <xsl:template match="nex:node">
        <owl:Class>
            <!-- the rdf:about for this class -->
            <xsl:attribute name="rdf:about">#node_$$$_<xsl:value-of select="../../@id"
                    />_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@id"/>
            </xsl:attribute>

            <!-- label it -->
            <xsl:call-template name="label"/>
        </owl:Class>
    </xsl:template>

    <!-- each edge represents a subclass relationship -->
    <xsl:template match="nex:edge">
        <owl:Class>
            <!-- the rdf:about for the target because it is the subclass -->
            <xsl:attribute name="rdf:about">#node_$$$_<xsl:value-of select="../../@id"
                    />_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@target"/>
            </xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource">#node_$$$_<xsl:value-of select="../../@id"
                        />_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@source"
                    /></xsl:attribute>
            </rdfs:subClassOf>
        </owl:Class>
    </xsl:template>

    <!-- OTUs are classes -->
    <xsl:template match="nex:otu">
        <owl:Class>
            <!-- the rdf:about for this class -->
            <xsl:attribute name="rdf:about">#otu_$$$_<xsl:value-of select="../@id"
                    />_$$$_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <!-- label it -->
            <xsl:call-template name="label"/>

            <!-- FIXME generate taxon Name? -->

        </owl:Class>
    </xsl:template>

    <!-- OTUs are a subclass of the nodes they are attached to-->
    <xsl:template match="nex:node[@otu]" mode="joining-otus">
        <owl:Class>
            <!-- the rdf:about for this class -->
            <xsl:attribute name="rdf:about">#otu_$$$_<xsl:value-of select="../../@otus"
                    />_$$$_<xsl:value-of select="@otu"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource">#node_$$$_<xsl:value-of select="../../@id"
                        />_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@id"/>
                </xsl:attribute>
            </rdfs:subClassOf>
        </owl:Class>
    </xsl:template>

    <!-- The root node is a subclass of TaxonConcept -->
    <xsl:template match="nex:node[@root = 'true']" mode="rooting">
        <owl:Class>
            <!-- the rdf:about for this class -->
            <xsl:attribute name="rdf:about">#node_$$$_<xsl:value-of select="../../@id"
            />_$$$_<xsl:value-of select="../@id"
                    />_$$$_<xsl:value-of select="@id"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource"
                    >#tree_$$$_<xsl:value-of select="../../@id"/>_$$$_<xsl:value-of select="../@id"/></xsl:attribute>
            </rdfs:subClassOf>
        </owl:Class>
    </xsl:template>
    
    <!-- The rootedge must have the root node as a target (may not be set in the node) -->
    <xsl:template match="nex:rootedge">
        <owl:Class>
            <!-- the rdf:about for this class -->
            <xsl:attribute name="rdf:about">#node_$$$_<xsl:value-of select="../../@id"
            />_$$$_<xsl:value-of select="../@id"
            />_$$$_<xsl:value-of select="@target"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource"
                    >#tree_$$$_<xsl:value-of select="../../@id"/>_$$$_<xsl:value-of select="../@id"/></xsl:attribute>
            </rdfs:subClassOf>
        </owl:Class>
    </xsl:template>
    
    <xsl:template match="nex:network">
        <owl:Class>
            <xsl:attribute name="rdf:about">#tree_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@id"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource"
                    >http://rs.tdwg.org/ontology/voc/TaxonConcept#TaxonConcept</xsl:attribute>
            </rdfs:subClassOf>
            <xsl:call-template name="label"/>
        </owl:Class>
        <xsl:comment>
            ============== All nodes in a network are direct subclasses of TaxonConcept ======
        </xsl:comment>
        <xsl:apply-templates select="nex:node" mode="rooting-unrooted" />
    </xsl:template>

    <xsl:template match="nex:tree">
        <owl:Class>
            <xsl:attribute name="rdf:about">#tree_$$$_<xsl:value-of select="../@id"/>_$$$_<xsl:value-of select="@id"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource"
                    >http://rs.tdwg.org/ontology/voc/TaxonConcept#TaxonConcept</xsl:attribute>
            </rdfs:subClassOf>
            <xsl:call-template name="label"/>
        </owl:Class>
    </xsl:template>

    <xsl:template match="nex:tree[not[@root = 'true']]" mode="rooting-unrooted">
        banana
        <xsl:apply-templates select="nex:node" mode="rooting-unrooted" />
    </xsl:template>
    
    <xsl:template match="nex:node" mode="rooting-unrooted">
        <owl:Class>
            <xsl:attribute name="rdf:about">#node_$$$_<xsl:value-of select="../../@id"
            />_$$$_<xsl:value-of select="../@id"
            />_$$$_<xsl:value-of select="@id"/></xsl:attribute>
            <rdfs:subClassOf>
                <xsl:attribute name="rdf:resource"
                    >#tree_$$$_<xsl:value-of select="../../@id"/>_$$$_<xsl:value-of select="../@id"/></xsl:attribute>
            </rdfs:subClassOf>
        </owl:Class>
    </xsl:template>


    <xsl:template name="label">
        <xsl:if test="@label">
            <dc:label>
                <xsl:value-of select="@label"/>
            </dc:label>
        </xsl:if>
    </xsl:template>
    
    

</xsl:stylesheet>
