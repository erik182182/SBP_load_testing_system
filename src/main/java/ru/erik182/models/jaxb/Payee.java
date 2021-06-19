
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about Payee.
 * 
 * <p>Java class for Payee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OrganisationInfo" type="{urn:cbr-ru:ed701:v2.0}PayeeOrganisationInfo"/>
 *           &lt;element name="PersonInfo" type="{urn:cbr-ru:ed701:v2.0}PayeePersonInfo"/>
 *         &lt;/choice>
 *         &lt;element name="AccountInfo" type="{urn:cbr-ru:ed701:v2.0}AccountInfo"/>
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
@XmlType(name = "Payee", namespace = "urn:cbr-ru:ed701:v2.0", propOrder = {
    "organisationInfo",
    "personInfo",
    "accountInfo",
    "bank"
})
public class Payee {

    @XmlElement(name = "OrganisationInfo", namespace = "urn:cbr-ru:ed701:v2.0")
    protected PayeeOrganisationInfo organisationInfo;
    @XmlElement(name = "PersonInfo", namespace = "urn:cbr-ru:ed701:v2.0")
    protected PayeePersonInfo personInfo;
    @XmlElement(name = "AccountInfo", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected AccountInfo accountInfo;
    @XmlElement(name = "Bank", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected BankFPSED bank;

    /**
     * Gets the value of the organisationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeOrganisationInfo }
     *     
     */
    public PayeeOrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    /**
     * Sets the value of the organisationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeOrganisationInfo }
     *     
     */
    public void setOrganisationInfo(PayeeOrganisationInfo value) {
        this.organisationInfo = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayeePersonInfo }
     *     
     */
    public PayeePersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeePersonInfo }
     *     
     */
    public void setPersonInfo(PayeePersonInfo value) {
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
