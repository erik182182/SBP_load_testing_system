
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RstrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RstrType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="NORS"/>
 *     &lt;enumeration value="URRS"/>
 *     &lt;enumeration value="LWRS"/>
 *     &lt;enumeration value="LMRS"/>
 *     &lt;enumeration value="CLRS"/>
 *     &lt;enumeration value="FPRS"/>
 *     &lt;enumeration value="MRTR"/>
 *     &lt;enumeration value="SDRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RstrType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum RstrType {

    NORS,
    URRS,
    LWRS,
    LMRS,
    CLRS,
    FPRS,
    MRTR,
    SDRS;

    public String value() {
        return name();
    }

    public static RstrType fromValue(String v) {
        return valueOf(v);
    }

}
