
package ru.erik182.models.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about organisation - Payer.
 * 
 * <p>Java class for PayerOrganisationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerOrganisationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType"/>
 *         &lt;element name="OrganisationIdentification" type="{urn:cbr-ru:ed701:v2.0}OrganisationIdentification" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerOrganisationInfo", namespace = "urn:cbr-ru:ed701:v2.0", propOrder = {
    "organisationName",
    "organisationIdentification"
})
public class PayerOrganisationInfo {

    @XmlElement(name = "OrganisationName", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected String organisationName;
    @XmlElement(name = "OrganisationIdentification", namespace = "urn:cbr-ru:ed701:v2.0")
    protected List<OrganisationIdentification> organisationIdentification;

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the organisationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationIdentification }
     * 
     * 
     */
    public List<OrganisationIdentification> getOrganisationIdentification() {
        if (organisationIdentification == null) {
            organisationIdentification = new ArrayList<OrganisationIdentification>();
        }
        return this.organisationIdentification;
    }

}
