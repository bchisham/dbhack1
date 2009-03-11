<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:nex="http://www.nexml.org/1.0" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
    xmlns:cdao="http://www.evolutionaryontology.org/cdao.owl#"
    xmlns:dc="http://purl.org/dc/elements/1.1/"
    xmlns:owl="http://www.w3.org/2002/07/owl#"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template name="makestate">
	    <xsl:param name="classname"/>
	    <xsl:param name="individualid"/>
	    <xsl:param name="symbol"/>
	    <rdf:Description>
		    <xsl:attribute name="rdf:about"><xsl:value-of select="$classname"/>_<xsl:value-of select="$individualid"/></xsl:attribute>
		    <rdf:type>
			    <xsl:attribute name="rdf:resource">#<xsl:value-of select="$classname"/></xsl:attribute>
		    </rdf:type>
		    <rdfs:label><xsl:value-of select="$symbol"/></rdfs:label>
	    </rdf:Description>
	    
    </xsl:template>

    <xsl:template name="makepolymorhicstateset">
 	    <xsl:param name="classname"/>
	    <xsl:param name="individualid"/>
	    <xsl:param name="symbol"/>

	    <rdf:Description>
		    <xsl:attribute name="rdf:about">#<xsl:value-of select="$classname"/>_<xsl:value-of select="$individualid"/></xsl:attribute>
		    <rdf:type>
			    <xsl:attribute name="rdf:resource">#<xsl:value-of select="$classname"/></xsl:attribute>
		    </rdf:type>
		    <rdfs:label><xsl:value-of select="$symbol"/></rdfs:label>
		    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#PolymorphicStateDomain"/>
		    <xsl:for-each select="member">
			    <cdao:has>
				    <xsl:attribute name="rdf:resource">#<xsl:value-of select="$classname"/>_<xsl:value-of select="@state"/></xsl:attribute>
			    </cdao:has>
		    </xsl:for-each>
	    </rdf:Description>


    </xsl:template>
    <xsl:template name="makeuncertainstateset">
	<xsl:param name="classname"/>
	    <xsl:param name="individualid"/>
	    <xsl:param name="symbol"/>

	    <rdf:Description>
		    <xsl:attribute name="rdf:about">#<xsl:value-of select="$classname"/>_<xsl:value-of select="$individualid"/></xsl:attribute>
		    <rdf:type>
			    <xsl:attribute name="rdf:resource">#<xsl:value-of select="$classname"/></xsl:attribute>
		    </rdf:type>
		    <rdfs:label><xsl:value-of select="$symbol"/></rdfs:label>
		    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#UncertainStateDomain"/>
		    <xsl:for-each select="member">
			    <cdao:has>
				    <xsl:attribute name="rdf:resource">#<xsl:value-of select="$classname"/>_<xsl:value-of select="@state"/></xsl:attribute>
			    </cdao:has>
		    </xsl:for-each>
	    </rdf:Description>
    </xsl:template>
    <xsl:template match="states">
	    <xsl:variable name="otus" select="../../@otus"/>
	    <xsl:variable name="statesid" select="@id" />
	    <xsl:variable name="classname" select="concat($otus, concat('_', $statesid))"/>
	    <owl:Class>
		    <xsl:attribute name="rdf:about">#<xsl:value-of select="$classname"/></xsl:attribute>
		    <rdfs:subClassOf rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Standard"/>
	    </owl:Class>
	    <xsl:for-each select="state">
		    <xsl:call-template name="makestate">
			    <xsl:with-param name="classname" select="$classname"/>
			    <xsl:with-param name="individualid" select="./@id"/>
			    <xsl:with-param name="symbol" select="./@symbol"/>
		    </xsl:call-template>
	    </xsl:for-each>
	    <xsl:for-each select="polymorphic_state_set">
		    <xsl:call-template name="makepolymorhicstateset">
 		            <xsl:with-param name="classname" select="$classname"/>
			    <xsl:with-param name="individualid" select="./@id"/>
			    <xsl:with-param name="symbol" select="./@symbol"/>
		    </xsl:call-template>
	    </xsl:for-each>
	    <xsl:for-each select="uncertain_state_set">
		    <xsl:call-template name="makeuncertainstateset">
 		            <xsl:with-param name="classname" select="$classname"/>
			    <xsl:with-param name="individualid" select="./@id"/>
			    <xsl:with-param name="symbol" select="./@symbol"/>
		    </xsl:call-template>
	    </xsl:for-each>
    </xsl:template>
    <xsl:template match="matrix">
    </xsl:template>
    <xsl:template match="dict"/>
	    
    <xsl:template match="/">
	    <rdf:RDF>
		    <xsl:apply-templates/>
	    </rdf:RDF>
    </xsl:template>


</xsl:stylesheet>
