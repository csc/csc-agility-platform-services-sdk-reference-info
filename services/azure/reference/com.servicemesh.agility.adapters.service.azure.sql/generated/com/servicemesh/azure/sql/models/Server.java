//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.20 at 02:31:34 PM CDT 
//


package com.servicemesh.azure.sql.models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Server complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Server">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/sqlazure/2010/12/}SqlModelCommon">
 *       &lt;sequence>
 *         &lt;element name="AdministratorLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdministratorLoginPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullyQualifiedDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoPairedRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Server", propOrder = {
    "administratorLogin",
    "administratorLoginPassword",
    "location",
    "fullyQualifiedDomainName",
    "geoPairedRegion",
    "version"
})
@XmlRootElement(name = "Server")
public class Server
    extends SqlModelCommon
    implements Serializable
{

    private final static long serialVersionUID = 20150116L;
    @XmlElement(name = "AdministratorLogin", required = true)
    protected String administratorLogin;
    @XmlElement(name = "AdministratorLoginPassword")
    protected String administratorLoginPassword;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "FullyQualifiedDomainName")
    protected String fullyQualifiedDomainName;
    @XmlElement(name = "GeoPairedRegion")
    protected String geoPairedRegion;
    @XmlElement(name = "Version")
    protected String version;

    /**
     * Gets the value of the administratorLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministratorLogin() {
        return administratorLogin;
    }

    /**
     * Sets the value of the administratorLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministratorLogin(String value) {
        this.administratorLogin = value;
    }

    /**
     * Gets the value of the administratorLoginPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministratorLoginPassword() {
        return administratorLoginPassword;
    }

    /**
     * Sets the value of the administratorLoginPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministratorLoginPassword(String value) {
        this.administratorLoginPassword = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the fullyQualifiedDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedDomainName() {
        return fullyQualifiedDomainName;
    }

    /**
     * Sets the value of the fullyQualifiedDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedDomainName(String value) {
        this.fullyQualifiedDomainName = value;
    }

    /**
     * Gets the value of the geoPairedRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoPairedRegion() {
        return geoPairedRegion;
    }

    /**
     * Sets the value of the geoPairedRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoPairedRegion(String value) {
        this.geoPairedRegion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
