//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.20 at 02:31:34 PM CDT 
//


package com.servicemesh.azure.sql.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallRuleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirewallRuleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirewallRule" type="{http://schemas.microsoft.com/sqlazure/2010/12/}FirewallRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallRuleList", propOrder = {
    "firewallRules"
})
@XmlRootElement(name = "FirewallRuleList")
public class FirewallRuleList
    implements Serializable
{

    private final static long serialVersionUID = 20150116L;
    @XmlElement(name = "FirewallRule")
    protected List<FirewallRule> firewallRules;

    /**
     * Gets the value of the firewallRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firewallRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirewallRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FirewallRule }
     * 
     * 
     */
    public List<FirewallRule> getFirewallRules() {
        if (firewallRules == null) {
            firewallRules = new ArrayList<FirewallRule>();
        }
        return this.firewallRules;
    }

}
