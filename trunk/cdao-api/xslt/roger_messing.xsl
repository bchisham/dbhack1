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
                <!-- id of the OTU is the concat of the otus @id and the otu @id because there could be multi otus blocks -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#TU"/>
        </rdf:Description>
    </xsl:template>

    <xsl:template match="nex:tree">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- the id of the tree has to include the id of the trees block it lives in as there may be multiple blocks -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <xsl:choose>
                <xsl:when test="nex:node/@root = 'true'">
                    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#RootedTree"/>
                    <cdao:has_Root rdf:resource="{@id}_{node[@root = 'true']/@id}"/>
                    <!-- FIXME don't think this works with new IDs -->
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#UnrootedTree"/>
                </xsl:otherwise>
            </xsl:choose>
        </rdf:Description>
    </xsl:template>

    <xsl:template match="nex:network">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- the id of the network has to include the id of the trees block it lives in as there may be multiple blocks -->
                <xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Network"/>
        </rdf:Description>
    </xsl:template>

    <xsl:template match="nex:node">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <!-- node id is concat of trees id, tree id and node id -->
                <xsl:value-of select="../../@id"/>_<xsl:value-of select="../@id"/>_<xsl:value-of
                    select="@id"/>
            </xsl:attribute>
            <xsl:if test="@label">
                <xsl:call-template name="label"/>
            </xsl:if>
            <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Node"/>
            <cdao:belongs_to_Tree rdf:resource="#{../../@id}_{../@id}"/>
            <xsl:if test="@otu">
                <cdao:represents_TU rdf:resource="#{../../@otus}_{@otu}"/>
            </xsl:if>
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
                <!-- edge id is concat of trees id, tree id and edge id -->
                <xsl:value-of select="../../@id"/>_<xsl:value-of select="../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>

            <xsl:choose>
                <xsl:when test="../node/@root = 'true'">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#DirectedEdge"/>
                    <cdao:has_Parent_Node rdf:resource="#{../../@id}_{../@id}_{@source}"/>
                    <cdao:has_Child_Node rdf:resource="#{../../@id}_{../@id}_{@target}"/>
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Edge"/>
                    <cdao:has_Node rdf:resource="#{../../@id}_{../@id}_{@source}"/>
                    <cdao:has_Node rdf:resource="#{../../@id}_{../@id}_{@target}"/>
                </xsl:otherwise>
            </xsl:choose>

            <cdao:belongs_to_Tree rdf:resource="#{../@id}_{../@id}"/>
            <xsl:if test="@length">
                <cdao:has_Annotation>
                    <rdf:Description>
                        <rdf:type
                            rdf:resource="http://www.evolutionaryontology.org/cdao.owl#EdgeLength"/>
                        <xsl:choose>
                            <xsl:when
                                test="concat(namespace::*[.='http://www.nexml.org/1.0' and name(.)], ':FloatTree')">
                                <cdao:has_Float_Value
                                    rdf:datatype="http://www.w3.org/1999/02/22-rdf-syntax-ns#float">
                                    <xsl:value-of select="@length"/>
                                </cdao:has_Float_Value>
                            </xsl:when>
                            <xsl:when
                                test="concat(namespace::*[.='http://www.nexml.org/1.0' and name(.)], ':IntTree')">
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

    <xsl:template match="char">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">
                <xsl:value-of select="../../@id"/>_<xsl:value-of select="@id"/>
            </xsl:attribute>
            <xsl:choose>
                <xsl:when test="contains(../../@xsi:type, 'ContinuousCells')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#ContinuousCharacter"
                    />
                </xsl:when>
                <xsl:when test="contains(../../@xsi:type , 'StandardCells')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#StandardCharacter"
                    />
                </xsl:when>
                <xsl:when test="contains(../../@xsi:type , 'DnaSeqs')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#NucleotideResidueCharacter"
                    />
                </xsl:when>
                <xsl:when test="contains(../../@xsi:type , 'RnaSeqs')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#RNAResidueCharacter"
                    />
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type rdf:resource="http://www.evolutionaryontology.org/cdao.owl#Character"
                    />
                </xsl:otherwise>
            </xsl:choose>
        </rdf:Description>
    </xsl:template>
    <!-- Process dna states -->

    <xsl:template name="dnastates"> </xsl:template>

    <!-- Process continuous states-->

    <xsl:template name="continuouscharacters"> </xsl:template>

    <!-- Process state definitions-->

    <xsl:template match="nex:states">
        <rdf:Description> </rdf:Description>
    </xsl:template>

    <xsl:template name="processcell">
        <rdf:Description>
            <xsl:attribute name="rdf:ID"><xsl:value-of select="../../../@id"/>_<xsl:value-of
                    select="../@id"/>_<xsl:value-of select="@char"/></xsl:attribute>
            <xsl:choose>
                <xsl:when test="contains(../../../@xsi:type, 'ContinuousCells')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#ContinuousStateDatum"
                    />
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'StandardCells')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#StandardStateDatum"
                    />
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'DnaSeqs')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#NucleotideStateDatum"
                    />
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'RnaSeqs')">
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#RNAResidueStateDatum"
                    />
                </xsl:when>
                <xsl:otherwise>
                    <rdf:type
                        rdf:resource="http://www.evolutionaryontology.org/cdao.owl#CharacterStateDatum"
                    />
                </xsl:otherwise>
            </xsl:choose>
            <cdao:belongs_to_TU>
                <xsl:attribute name="rdf:about">#<xsl:value-of select="../../../@otus"
                        />_<xsl:value-of select="../@otu"/></xsl:attribute>
            </cdao:belongs_to_TU>
            <cdao:belongs_to_Character>
                <xsl:attribute name="rdf:about">#<xsl:value-of select="../../../@id"/>_<xsl:value-of
                        select="@char"/></xsl:attribute>
            </cdao:belongs_to_Character>
            <xsl:choose>
                <xsl:when test="contains(../../../@xsi:type, 'ContinuousCells')">
                    <cdao:has_Continuous_State>
                        <cdao:Continuous>
                            <cdao:has_Value>
                                <xsl:value-of select="@state"/>
                            </cdao:has_Value>
                        </cdao:Continuous>
                    </cdao:has_Continuous_State>
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'StandardCells')">
                    <cdao:has_Standard_State>
                        <xsl:attribute name="rdf:about">#<xsl:value-of
                                select="../../../format/states/@id"/>_<xsl:value-of select="@state"
                            /></xsl:attribute>
                    </cdao:has_Standard_State>
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'DnaSeqs')">
                    <cdao:has_Nucleotide_State>
                        <xsl:attribute name="rdf:about">#<xsl:value-of
                                select="../../../format/states/@id"/>_<xsl:value-of select="@state"
                            /></xsl:attribute>
                    </cdao:has_Nucleotide_State>
                </xsl:when>
                <xsl:when test="contains(../../../@xsi:type, 'RnaSeqs')">
                    <cdao:has_RNA_State>
                        <xsl:attribute name="rdf:about">#<xsl:value-of
                                select="../../../format/states/@id"/>_<xsl:value-of select="@state"
                            /></xsl:attribute>
                    </cdao:has_RNA_State>
                </xsl:when>
                <xsl:otherwise>
                    <cdao:has_State>
                        <xsl:attribute name="rdf:about">#<xsl:value-of
                                select="../../../format/states/@id"/>_<xsl:value-of select="@state"
                            /></xsl:attribute>
                    </cdao:has_State>
                </xsl:otherwise>
            </xsl:choose>
        </rdf:Description>
    </xsl:template>

    <xsl:template name="processrow">
        <xsl:for-each select="cell">
            <xsl:call-template name="processcell"/>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="matrix">
        <rdf:Description>
            <xsl:attribute name="rdf:ID">matrix_<xsl:value-of select="../@id"/></xsl:attribute>
            <rdf:type
                rdf:resource="http://www.evolutionaryontology.org/cdao.owl#CharacterStateDataMatrix"/>
            <xsl:for-each select="row">
                <xsl:call-template name="processrow"/>
            </xsl:for-each>
        </rdf:Description>
    </xsl:template>

    <xsl:template match="*" priority="-1"/>

</xsl:stylesheet>
