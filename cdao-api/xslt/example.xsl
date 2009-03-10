<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl= "http://www.w3.org/1999/XSL/Transform"
                xmlns:nex="http://www.nexml.org/1.0"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xmlns:xml="http://www.w3.org/XML/1998/namespace"
		xmlns:cdao="http://www.evolutionaryontology.org/cdao"
		xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns"
		xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema"
		xsi:schemaLocation="http://www.nexml.org/1.0 http://www.nexml.org/nexml/xsd/nexml.xsd"
		xmlns="">
   <!-- Define the output format. -->
   <xsl:output method="xml" encoding="string" omit-xml-declaration="no" indent="yes" />

<!-- 
   Skeleton Example of an XSLT transformation.
   Example includes separate templates for separate constructs.
   Shows application of templates.
   Created: 9 March 2009
   Created by: OWL API Group
  -->
  <!--
  This template is a skeletion example of processing an OTU.

   -->
<xsl:template name="otu">
    <cdao:otu rdf:ID="{@id}"><xsl:text>&#10;</xsl:text>
	    <cdao:represents_Node rdf:about="{@id}" /><xsl:text>&#10;</xsl:text>
    </cdao:otu><xsl:text>&#10;</xsl:text>
</xsl:template>

<!-- This template is a skeletion example of processsing an single node -->
<xsl:template name="node"><xsl:text>&#10;</xsl:text>
	<xsl:param name="tree"/><xsl:text>&#10;</xsl:text>
	<cdao:Node rdf:ID="{@id}" /><xsl:text>&#10;</xsl:text>
</xsl:template>
<xsl:template name="edge">
	<!--<xsl:param name="parent"/>-->
	<cdao:Edge rdf:ID="{@id}"><xsl:text>&#10;</xsl:text>
	       <cdao:has_Annotation>
		<cdao:EdgeLength><xsl:text>&#10;</xsl:text>
			<xsl:choose>
			      <xsl:when test="contains(@xsi:type,FloatTree)">
				      <cdao:has_Float_Value><xsl:value-of select="@length"/></cdao:has_Float_Value><xsl:text>&#10;</xsl:text>
			      </xsl:when>
			      <xsl:when test="contains(@xsi:type,IntTree)">
				      <cdao:has_Int_Value><xsl:value-of select="@length"/></cdao:has_Int_Value>
		              </xsl:when>
			</xsl:choose>
		</cdao:EdgeLength><xsl:text>&#10;</xsl:text>
	       </cdao:has_Annotation>
		<cdao:has_Node rdf:about="{@source}"/><xsl:text>&#10;</xsl:text>
		<cdao:has_Node rdf:about="{@target}"/><xsl:text>&#10;</xsl:text>
	</cdao:Edge>
</xsl:template>
<xsl:template name="rootedge">

</xsl:template>

<xsl:template match="tree">
   <cdao:Tree rdf:ID="{@id}">
     <xsl:for-each select="node"><xsl:text>&#10;</xsl:text>
        <xsl:call-template name="node" /><xsl:text>&#10;</xsl:text>
     </xsl:for-each>
     <!-- <xsl:call-template name="rootedge"/> -->	       
     <xsl:for-each select="edge">
          <xsl:call-template name="edge"><xsl:text>&#10;</xsl:text>
              <xsl:with-param name="parent" select="../@id"/><xsl:text>&#10;</xsl:text>
	  </xsl:call-template>
     </xsl:for-each>
  </cdao:Tree>
</xsl:template>

<xsl:template match="network">
   <cdao:Network rdf:ID="{@id}"><xsl:text>&#10;</xsl:text>
      <xsl:for-each select="edge"><xsl:text>&#10;</xsl:text>
         <xsl:call-template name="edge"><xsl:text>&#10;</xsl:text>
             <xsl:with-param name="parent" select="../@id"/><xsl:text>&#10;</xsl:text>
	 </xsl:call-template>  
      </xsl:for-each>
      <xsl:for-each select="node">
         <xsl:call-template name="node"/>
      </xsl:for-each>
   </cdao:Network>
</xsl:template>

<!--
   Match and process the OTUS
  -->
  <xsl:template match="//otus">
	<xsl:for-each select="otu">
		<xsl:call-template name="otu"/>
    </xsl:for-each>
</xsl:template>
<!-- Match state definitions -->
<xsl:template select="//states">
	<xsl:for-each select="state">
	</xsl:for-each>
</xsl:template>
<!-- Process a row-->
<xsl:template name="row">
	<!-- Choose functions much like a switch statment in other languages -->
	<xsl:choose>
	   <xsl:when test="seq">
	    <xsl:for-each select="seq">
		<xsl:call-template name="seq"/>
	    </xsl:for-each>
        </xsl:when>
	<xsl:when test="cell">
	    <xsl:for-each select="cell">
		<xsl:call-template name="cell"/>
	    </xsl:for-each>
         </xsl:when>
      </xsl:choose>
</xsl:template>
<!-- Process a seq -->
<xsl:template name="seq">
</xsl:template>
<!-- Process a cell -->
<xsl:template name="cell">
</xsl:template>
<!-- Process a matrix -->
<xsl:template select="//matrix">
	<xsl:for-each select="row">
		<xsl:call-template name="row"/>
        </xsl:for-each>
</xsl:template>
<!-- Process a dict element -->
<xsl:template name="dict">
</xsl:template>

<!-- 
   The match="/" template matches the root element. This default template is required it's
   analogous to the funtion "main" in some programming languages.
  -->
  <xsl:template match="/">
   <!-- Tags before and after the template application are echoed verbatim -->
   <rdf:RDF> <!-- other namespace stuff here -->
	   <!-- try to match the templates by  -->
	   <xsl:apply-templates/>
   </rdf:RDF>
</xsl:template>
</xsl:stylesheet>
