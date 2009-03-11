<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:nex="http://www.nexml.org/1.0" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
    xmlns:cdao="http://www.evolutionaryontology.org/cdao.owl#"
    xmlns:dc="http://purl.org/dc/elements/1.1/"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <xsl:output method="xml" indent="yes"/>
    <!--
    Stylesheet demonstrating the computation of the ancestor set
    for a node.
    -->
    <xsl:template name="label">
        <dc:label>
            <xsl:value-of select="@label"/>
        </dc:label>
    </xsl:template>

 

    <xsl:template name="processancestor">
	    <xsl:param name="cnodeid" />
	    <xsl:variable name="treeid" select="../@id"/>
	    <!--<xsl:variable name="cnode" select="../node[@id = n3]"/>-->
	    <xsl:choose>
		    <xsl:when test="../*[ name()='node' and @id = $cnodeid and @root = 'true' ]">
		    </xsl:when>
		    <xsl:when test="../*[ name()='node' and @id = $cnodeid ]">
                            <xsl:variable name="edge" select="../*[name() = 'edge' and @target = $cnodeid]"/>
			    <cdao:has_Ancestor rdf:resource="#{../@id}_{$edge/@source}"/>
			    
			    <xsl:call-template name="processancestor">	    
				       <xsl:with-param name="cnodeid" select="$edge/@source"/>
			       </xsl:call-template>
		    </xsl:when>
		    <xsl:otherwise>
			    
		    </xsl:otherwise>
	    </xsl:choose> 
    </xsl:template>
    <xsl:template match="nex:node">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- node id is concat of tree id and node id -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Node"/>
            <cdao:belongs_to_Tree rdf:resource="#{../@id}"/>
            <xsl:if test="@otu">
                <cdao:represents_TU rdf:resource="#{@otu}"/>
            </xsl:if>
	    <!-- link to OTU here? -->	
	    <xsl:call-template name="processancestor">
		    <xsl:with-param name="cnodeid" select="./@id"/>
	    </xsl:call-template>
	    

        </rdf:Description>
    </xsl:template>
    <xsl:template match="nex:edge">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- edge id is concat of tree id and edge id -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
	</xsl:attribute>
        
	<xsl:choose>
		<xsl:when test="../nex:node/@root = 'true'">
			<rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#DirectedEdge" />
                        <cdao:has_Parent_Node rdf:resource="#{../@id}_{@source}"/>
			<cdao:has_Child_Node rdf:resource="#{../@id}_{@target}"/>
			
		 </xsl:when>
		 <xsl:otherwise>
			 <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Edge" />
			 <cdao:has_Node rdf:resource="#{../@id}_{@source}"/>
                         <cdao:has_Node rdf:resource="#{../@id}_{@target}"/>
		 </xsl:otherwise>
           </xsl:choose>
            
           
            
            <cdao:belongs_to_Tree rdf:resource="#{../@id}"/>
            <xsl:if test="@length">
                <cdao:has_Annotation>
                    <rdf:Description>
                        <rdf:type
                            rdf:resource="http://www.evolutionaryontology.org/cdao.owl#EdgeLength"/>
                        <xsl:choose>
                            <!-- this is not pretty because we don't know the ns prefix used in the xsi attribute -->
                            <xsl:when test="contains(../@xsi:type, 'FloatTree')">
                                <cdao:has_Float_Value
                                    rdf:datatype="http://www.w3.org/1999/02/22-rdf-syntax-ns#float">
                                    <xsl:value-of select="@length"/>
                                </cdao:has_Float_Value>
                            </xsl:when>
                            <xsl:when test="contains(../@xsi:type, 'IntTree')">
                                <cdao:has_Int_Value
                                    rdf:datatype="http://www.w3.org/1999/02/22-rdf-syntax-ns#integer">
                                    <xsl:value-of select="@length"/>
                                </cdao:has_Int_Value>
                            </xsl:when>
                            <xsl:otherwise>
                                <cdao:has_Value>
                                    <xsl:value-of select="@length"/>
                                </cdao:has_Value>
                            </xsl:otherwise>
                        </xsl:choose>
                    </rdf:Description>
                </cdao:has_Annotation>
            </xsl:if>
        </rdf:Description>
     </xsl:template>
     <xsl:template match="/">
	     <rdf:RDF>
		     <xsl:apply-templates/>
	     </rdf:RDF>
     </xsl:template>
</xsl:stylesheet>
