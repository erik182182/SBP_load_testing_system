
package ru.erik182.models.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Customer Credit Transfer
 * 
 * <p>Java class for ED701 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED701">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed701:v2.0}ESWithMandatoryEDReceiver">
 *       &lt;sequence>
 *         &lt;element name="AccDoc" type="{urn:cbr-ru:ed701:v2.0}ED701AccDocRefID" minOccurs="0"/>
 *         &lt;element name="Payer" type="{urn:cbr-ru:ed701:v2.0}Payer"/>
 *         &lt;element name="Payee" type="{urn:cbr-ru:ed701:v2.0}Payee"/>
 *         &lt;element name="Purpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType" minOccurs="0"/>
 *         &lt;element name="EDRefID" type="{urn:cbr-ru:ed701:v2.0}EDRefID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TransactionID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}UniversalIDType" />
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="TransKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" />
 *       &lt;attribute name="TransDateTime" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateTimeType" />
 *       &lt;attribute name="OperationType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OperationType" />
 *       &lt;attribute name="PaymentID" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" />
 *       &lt;attribute name="PaymentCategory" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaymentCategoryType" />
 *       &lt;attribute name="CodePurpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED701", namespace = "urn:cbr-ru:ed701:v2.0", propOrder = {
    "accDoc",
    "payer",
    "payee",
    "purpose",
    "edRefID"
})
public class ED701
    extends ESWithMandatoryEDReceiver
{

    @XmlElement(name = "AccDoc", namespace = "urn:cbr-ru:ed701:v2.0")
    protected ED701AccDocRefID accDoc;
    @XmlElement(name = "Payer", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected Payer payer;
    @XmlElement(name = "Payee", namespace = "urn:cbr-ru:ed701:v2.0", required = true)
    protected Payee payee;
    @XmlElement(name = "Purpose", namespace = "urn:cbr-ru:ed701:v2.0")
    protected String purpose;
    @XmlElement(name = "EDRefID", namespace = "urn:cbr-ru:ed701:v2.0")
    protected EDRefID edRefID;
    @XmlAttribute(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;
    @XmlAttribute(name = "TransKind", required = true)
    protected String transKind;
    @XmlAttribute(name = "TransDateTime", required = true)
    protected XMLGregorianCalendar transDateTime;
    @XmlAttribute(name = "OperationType", required = true)
    protected OperationType operationType;
    @XmlAttribute(name = "PaymentID")
    protected String paymentID;
    @XmlAttribute(name = "PaymentCategory")
    protected PaymentCategoryType paymentCategory;
    @XmlAttribute(name = "CodePurpose")
    protected String codePurpose;

    /**
     * Gets the value of the accDoc property.
     * 
     * @return
     *     possible object is
     *     {@link ED701AccDocRefID }
     *     
     */
    public ED701AccDocRefID getAccDoc() {
        return accDoc;
    }

    /**
     * Sets the value of the accDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED701AccDocRefID }
     *     
     */
    public void setAccDoc(ED701AccDocRefID value) {
        this.accDoc = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Payer }
     *     
     */
    public Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payer }
     *     
     */
    public void setPayer(Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPayee(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the edRefID property.
     * 
     * @return
     *     possible object is
     *     {@link EDRefID }
     *     
     */
    public EDRefID getEDRefID() {
        return edRefID;
    }

    /**
     * Sets the value of the edRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDRefID }
     *     
     */
    public void setEDRefID(EDRefID value) {
        this.edRefID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSum(BigInteger value) {
        this.sum = value;
    }

    /**
     * Gets the value of the transKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKind() {
        return transKind;
    }

    /**
     * Sets the value of the transKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransKind(String value) {
        this.transKind = value;
    }

    /**
     * Gets the value of the transDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDateTime() {
        return transDateTime;
    }

    /**
     * Sets the value of the transDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDateTime(XMLGregorianCalendar value) {
        this.transDateTime = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationType(OperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the paymentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategoryType }
     *     
     */
    public PaymentCategoryType getPaymentCategory() {
        return paymentCategory;
    }

    /**
     * Sets the value of the paymentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategoryType }
     *     
     */
    public void setPaymentCategory(PaymentCategoryType value) {
        this.paymentCategory = value;
    }

    /**
     * Gets the value of the codePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePurpose() {
        return codePurpose;
    }

    /**
     * Sets the value of the codePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePurpose(String value) {
        this.codePurpose = value;
    }

}
