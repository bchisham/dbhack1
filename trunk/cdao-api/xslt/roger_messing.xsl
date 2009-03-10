<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
    xmlns:nex="http://www.nexml.org/1.0" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
    xmlns:cdao="http://www.evolutionaryontology.org/cdao.owl#"
    xmlns:dc="http://purl.org/dc/elements/1.1/"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <xsl:output method="xml"/>

    <xsl:template match="/nex:nexml">
        <rdf:RDF xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
            xmlns:owl="http://www.w3.org/2002/07/owl#">
            <xsl:apply-templates select="descendant::*"/>
        </rdf:RDF>
    </xsl:template>


    <xsl:template match="nex:otu">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <xsl:value-of select="@id"/>
            </xsl:attribute>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#TU"/>
        </rdf:Description>
    </xsl:template>

    <xsl:template match="nex:tree">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <xsl:choose>
                <xsl:when test="nex:node/@root = 'true'">
                    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#RootedTree"
                    />
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#UnrootedTree"/>
                </xsl:otherwise>
            </xsl:choose>
            <!-- link to OTU here? -->
        </rdf:Description>
    </xsl:template>

    <xsl:template match="nex:network">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Network"/>
            <!-- link to OTU here? -->
        </rdf:Description>
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
        </rdf:Description>
    </xsl:template>

    <xsl:template name="label">
        <dc:label>
            <xsl:value-of select="@label"/>
        </dc:label>
    </xsl:template>

    <xsl:template match="nex:edge">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- edge id is concat of tree id and edge id -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:choose>
                <xsl:when test="../nex:node/@root = 'true'">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#DirectedEdge"/>
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Edge"/>
                </xsl:otherwise>
            </xsl:choose>
            <cdao:has_Node rdf:resource="#{../@id}_{@source}"/>
            <cdao:has_Node rdf:resource="#{../@id}_{@target}"/>
            <cdao:belongs_to_Tree rdf:resource="#{../@id}"/>
            <xsl:if test="@length">
                <cdao:has_Annotation>
                    <rdf:Description>
                        <rdf:type
                            rdf:resource="http://www.evolutionaryontology.org/cdao.owl#EdgeLength"/>
                        <xsl:choose>
                            <!-- this is not pretty because we don't know the ns prefix used in the xsi attribute -->
                            <xsl:when test="ends-with(../@xsi:type, ':FloatTree')">
                                <cdao:has_Float_Value
                                    rdf:datatype="http://www.w3.org/1999/02/22-rdf-syntax-ns#float">
                                    <xsl:value-of select="@length"/>
                                </cdao:has_Float_Value>
                            </xsl:when>
                            <xsl:when test="ends-with(../@xsi:type, ':IntTree')">
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

    <xsl:template match="*" priority="-1"/>

</xsl:stylesheet>
