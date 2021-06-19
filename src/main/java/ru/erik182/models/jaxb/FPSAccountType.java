
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FPSAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FPSAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BBAN"/>
 *     &lt;enumeration value="EPID"/>
 *     &lt;enumeration value="ORID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FPSAccountType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum FPSAccountType {

    BBAN,
    EPID,
    ORID;

    public String value() {
        return name();
    }

    public static FPSAccountType fromValue(String v) {
        return valueOf(v);
    }

}
