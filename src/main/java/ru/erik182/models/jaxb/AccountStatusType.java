
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="ACAC"/>
 *     &lt;enumeration value="ACDL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum AccountStatusType {

    ACAC,
    ACDL;

    public String value() {
        return name();
    }

    public static AccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
