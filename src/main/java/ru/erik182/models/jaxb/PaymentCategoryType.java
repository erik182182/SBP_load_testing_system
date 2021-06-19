
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCategoryType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum PaymentCategoryType {

    FREE,
    PAID;

    public String value() {
        return name();
    }

    public static PaymentCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
