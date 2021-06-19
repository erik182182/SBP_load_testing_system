
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Organisation Identification.
 * 
 * <p>Java class for OrganisationIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OrganisationIdentificatorType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OrganisationIdentificatorType" />
 *       &lt;attribute name="IdentificatorValue" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max12TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification", namespace = "urn:cbr-ru:ed701:v2.0")
public class OrganisationIdentification {

    @XmlAttribute(name = "OrganisationIdentificatorType", required = true)
    protected OrganisationIdentificatorType organisationIdentificatorType;
    @XmlAttribute(name = "IdentificatorValue", required = true)
    protected String identificatorValue;

    /**
     * Gets the value of the organisationIdentificatorType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificatorType }
     *     
     */
    public OrganisationIdentificatorType getOrganisationIdentificatorType() {
        return organisationIdentificatorType;
    }

    /**
     * Sets the value of the organisationIdentificatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificatorType }
     *     
     */
    public void setOrganisationIdentificatorType(OrganisationIdentificatorType value) {
        this.organisationIdentificatorType = value;
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
