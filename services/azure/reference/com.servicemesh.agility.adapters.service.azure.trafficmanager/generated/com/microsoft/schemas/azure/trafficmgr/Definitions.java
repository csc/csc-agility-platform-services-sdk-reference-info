//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.19 at 08:17:35 AM CDT 
//


package com.microsoft.schemas.azure.trafficmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Definitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definition" type="{http://schemas.microsoft.com/windowsazure}Definition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definitions", propOrder = {
    "definition"
})
@XmlRootElement(name = "Definitions")
public class Definitions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Definition", required = true)
    protected Definition definition;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setDefinition(Definition value) {
        this.definition = value;
    }

}
