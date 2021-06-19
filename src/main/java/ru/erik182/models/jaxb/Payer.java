
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about Payer.
 * 
 * <p>Java class for Payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OrganisationInfo" type="{urn:cbr-ru:ed701:v2.0}PayerOrganisationInfo"/>
 *           &lt;element name="PersonInfo" type="{urn:cbr-ru:ed701:v2.0}PayerPersonInfo"/>
 *         &lt;/choice>
 *         &lt;element name="AccountInfo" type="{urn:cbr-ru:ed701:v2.0}AccountInfo"/>
 *         &lt;element name="Address" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max140TextType" minOccurs="0"/>
 *         &lt;element name="Bank" type="{urn:cbr-ru:ed701:v2.0}BankFPSED"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payer", namespace = "urn:cbr-ru:ed701:v2.0", propOrder = {
    "organisationInfo",
    "personInfo",
    "accountInfo",
    "address",
    "bank"
})
public class Payer {

    @XmlElement(name = "OrganisationInfo", namespace = "urn:cbr-ru:ed701:v2.0")
    protected PayerOrganisationInfo organisationInfo;
    @XmlElement(name = "PersonInfo", namespace = "urn:cbr-ru:ed701:v2.0")
    protected PayerPersonInfo personInfo;
    @XmlElement(name = "AccountInfo", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected AccountInfo accountInfo;
    @XmlElement(name = "Address", namespace = "urn:cbr-ru:ed701:v2.0")
    protected String address;
    @XmlElement(name = "Bank", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected BankFPSED bank;

    /**
     * Gets the value of the organisationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayerOrganisationInfo }
     *     
     */
    public PayerOrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    /**
     * Sets the value of the organisationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerOrganisationInfo }
     *     
     */
    public void setOrganisationInfo(PayerOrganisationInfo value) {
        this.organisationInfo = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayerPersonInfo }
     *     
     */
    public PayerPersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerPersonInfo }
     *     
     */
    public void setPersonInfo(PayerPersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankFPSED }
     *     
     */
    public BankFPSED getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankFPSED }
     *     
     */
    public void setBank(BankFPSED value) {
        this.bank = value;
    }

}
