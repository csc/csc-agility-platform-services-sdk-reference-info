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
 * <p>Java class for Monitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Monitor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntervalInSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeoutInSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToleratedNumberOfFailures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Protocol" type="{http://schemas.microsoft.com/windowsazure}Protocol"/>
 *         &lt;element name="Port" type="{http://schemas.microsoft.com/windowsazure}Port"/>
 *         &lt;element name="HttpOptions" type="{http://schemas.microsoft.com/windowsazure}HttpOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Monitor", propOrder = {
    "intervalInSeconds",
    "timeoutInSeconds",
    "toleratedNumberOfFailures",
    "protocol",
    "port",
    "httpOptions"
})
@XmlRootElement(name = "Monitor")
public class Monitor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IntervalInSeconds", defaultValue = "30")
    protected int intervalInSeconds;
    @XmlElement(name = "TimeoutInSeconds", defaultValue = "10")
    protected int timeoutInSeconds;
    @XmlElement(name = "ToleratedNumberOfFailures", defaultValue = "3")
    protected int toleratedNumberOfFailures;
    @XmlElement(name = "Protocol", required = true)
    protected Protocol protocol;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "HttpOptions", required = true)
    protected HttpOptions httpOptions;

    /**
     * Gets the value of the intervalInSeconds property.
     * 
     */
    public int getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * Sets the value of the intervalInSeconds property.
     * 
     */
    public void setIntervalInSeconds(int value) {
        this.intervalInSeconds = value;
    }

    /**
     * Gets the value of the timeoutInSeconds property.
     * 
     */
    public int getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * Sets the value of the timeoutInSeconds property.
     * 
     */
    public void setTimeoutInSeconds(int value) {
        this.timeoutInSeconds = value;
    }

    /**
     * Gets the value of the toleratedNumberOfFailures property.
     * 
     */
    public int getToleratedNumberOfFailures() {
        return toleratedNumberOfFailures;
    }

    /**
     * Sets the value of the toleratedNumberOfFailures property.
     * 
     */
    public void setToleratedNumberOfFailures(int value) {
        this.toleratedNumberOfFailures = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link Protocol }
     *     
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocol }
     *     
     */
    public void setProtocol(Protocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the httpOptions property.
     * 
     * @return
     *     possible object is
     *     {@link HttpOptions }
     *     
     */
    public HttpOptions getHttpOptions() {
        return httpOptions;
    }

    /**
     * Sets the value of the httpOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpOptions }
     *     
     */
    public void setHttpOptions(HttpOptions value) {
        this.httpOptions = value;
    }

}
