<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="article">
        <table border="1" width="100%">
            <tr bgcolor="#eee">
                <th>Ид</th>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчетсво</th>
                <th>Специализация</th>
            </tr>
            <xsl:for-each select="doc">
                <tr>
                    <td>
                        <xsl:value-of select="id"/>
                    </td>
                    <td>
                        <xsl:value-of select="title"/>
                    </td>
                    <td>
                        <xsl:value-of select="description"/>
                    </td>
                    <td>
                        <xsl:value-of select="subject"/>
                    </td>
                    <td>
                        <xsl:value-of select="created"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>