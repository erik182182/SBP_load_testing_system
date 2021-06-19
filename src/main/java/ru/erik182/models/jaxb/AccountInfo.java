
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Account information.
 * 
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccountType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}FPSAccountType" />
 *       &lt;attribute name="AccountValue" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max20TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfo", namespace = "urn:cbr-ru:ed701:v2.0")
public class AccountInfo {

    @XmlAttribute(name = "AccountType", required = true)
    protected FPSAccountType accountType;
    @XmlAttribute(name = "AccountValue", required = true)
    protected String accountValue;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link FPSAccountType }
     *     
     */
    public FPSAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPSAccountType }
     *     
     */
    public void setAccountType(FPSAccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountValue() {
        return accountValue;
    }

    /**
     * Sets the value of the accountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountValue(String value) {
        this.accountValue = value;
    }

}
