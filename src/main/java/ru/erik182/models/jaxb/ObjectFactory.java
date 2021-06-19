
package ru.erik182.models.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.erik182.models.jaxb package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ED701_QNAME = new QName("urn:cbr-ru:ed701:v2.0", "ED701");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.erik182.models.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ED701 }
     * 
     */
    public ED701 createED701() {
        return new ED701();
    }

    /**
     * Create an instance of {@link Payer }
     * 
     */
    public Payer createPayer() {
        return new Payer();
    }

    /**
     * Create an instance of {@link PayeeOrganisationInfo }
     * 
     */
    public PayeeOrganisationInfo createPayeeOrganisationInfo() {
        return new PayeeOrganisationInfo();
    }

    /**
     * Create an instance of {@link EDRefID }
     * 
     */
    public EDRefID createEDRefID() {
        return new EDRefID();
    }

    /**
     * Create an instance of {@link PayerOrganisationInfo }
     * 
     */
    public PayerOrganisationInfo createPayerOrganisationInfo() {
        return new PayerOrganisationInfo();
    }

    /**
     * Create an instance of {@link OrganisationIdentification }
     * 
     */
    public OrganisationIdentification createOrganisationIdentification() {
        return new OrganisationIdentification();
    }

    /**
     * Create an instance of {@link PayerPersonInfo }
     * 
     */
    public PayerPersonInfo createPayerPersonInfo() {
        return new PayerPersonInfo();
    }

    /**
     * Create an instance of {@link PayeePersonInfo }
     * 
     */
    public PayeePersonInfo createPayeePersonInfo() {
        return new PayeePersonInfo();
    }

    /**
     * Create an instance of {@link BankFPSED }
     * 
     */
    public BankFPSED createBankFPSED() {
        return new BankFPSED();
    }

    /**
     * Create an instance of {@link ED701AccDocRefID }
     * 
     */
    public ED701AccDocRefID createED701AccDocRefID() {
        return new ED701AccDocRefID();
    }

    /**
     * Create an instance of {@link PersonIdentification }
     * 
     */
    public PersonIdentification createPersonIdentification() {
        return new PersonIdentification();
    }

    /**
     * Create an instance of {@link Payee }
     * 
     */
    public Payee createPayee() {
        return new Payee();
    }

    /**
     * Create an instance of {@link ESWithMandatoryEDReceiver }
     * 
     */
    public ESWithMandatoryEDReceiver createESWithMandatoryEDReceiver() {
        return new ESWithMandatoryEDReceiver();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link ED }
     * 
     */
    public ED createED() {
        return new ED();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ED701 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cbr-ru:ed701:v2.0", name = "ED701")
    public JAXBElement<ED701> createED701(ED701 value) {
        return new JAXBElement<ED701>(_ED701_QNAME, ED701 .class, null, value);
    }

}
