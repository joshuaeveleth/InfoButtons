/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.18 at 11:24:08 AM MDT 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.HealthCareProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.HealthCareProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{}CD.Lite" minOccurs="0" form="qualified"/>
 *         &lt;element name="healthCarePerson" type="{}REDS_MT010001UV.Person" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.HealthCareProvider", propOrder = {
    "code",
    "healthCarePerson"
})
public class REDSMT010001UVHealthCareProvider {

    protected CDLite code;
    @XmlElementRef(name = "healthCarePerson", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVPerson> healthCarePerson;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CDLite }
     *     
     */
    public CDLite getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDLite }
     *     
     */
    public void setCode(CDLite value) {
        this.code = value;
    }

    /**
     * Gets the value of the healthCarePerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPerson }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVPerson> getHealthCarePerson() {
        return healthCarePerson;
    }

    /**
     * Sets the value of the healthCarePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPerson }{@code >}
     *     
     */
    public void setHealthCarePerson(JAXBElement<REDSMT010001UVPerson> value) {
        this.healthCarePerson = ((JAXBElement<REDSMT010001UVPerson> ) value);
    }

}