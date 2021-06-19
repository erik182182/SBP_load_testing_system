
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about person - Payer.
 * 
 * <p>Java class for PayerPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType"/>
 *         &lt;element name="PersonIdentification" type="{urn:cbr-ru:ed701:v2.0}PersonIdentification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerPersonInfo", namespace = "urn:cbr-ru:ed701:v2.0", propOrder = {
    "personName",
    "personIdentification"
})
public class PayerPersonInfo {

    @XmlElement(name = "PersonName", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected String personName;
    @XmlElement(name = "PersonIdentification", namespace = "urn:cbr-ru:ed701:v2.0")
    protected PersonIdentification personIdentification;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the personIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification }
     *     
     */
    public PersonIdentification getPersonIdentification() {
        return personIdentification;
    }

    /**
     * Sets the value of the personIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification }
     *     
     */
    public void setPersonIdentification(PersonIdentification value) {
        this.personIdentification = value;
    }

}
