
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTextType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="OTAE"/>
 *     &lt;enumeration value="OTAP"/>
 *     &lt;enumeration value="CWAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationTextType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OperationTextType {

    OTAE,
    OTAP,
    CWAC;

    public String value() {
        return name();
    }

    public static OperationTextType fromValue(String v) {
        return valueOf(v);
    }

}
