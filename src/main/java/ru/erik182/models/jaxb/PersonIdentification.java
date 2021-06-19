
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Person Identification.
 * 
 * <p>Java class for PersonIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PersonIdentificatorType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PersonIdentificatorType" />
 *       &lt;attribute name="IdentificatorValue" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max12TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification", namespace = "urn:cbr-ru:ed701:v2.0")
public class PersonIdentification {

    @XmlAttribute(name = "PersonIdentificatorType", required = true)
    protected PersonIdentificatorType personIdentificatorType;
    @XmlAttribute(name = "IdentificatorValue", required = true)
    protected String identificatorValue;

    /**
     * Gets the value of the personIdentificatorType property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificatorType }
     *     
     */
    public PersonIdentificatorType getPersonIdentificatorType() {
        return personIdentificatorType;
    }

    /**
     * Sets the value of the personIdentificatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificatorType }
     *     
     */
    public void setPersonIdentificatorType(PersonIdentificatorType value) {
        this.personIdentificatorType = value;
    }

    /**
     * Gets the value of the identificatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificatorValue() {
        return identificatorValue;
    }

    /**
     * Sets the value of the identificatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificatorValue(String value) {
        this.identificatorValue = value;
    }

}
