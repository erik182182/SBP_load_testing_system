
package ru.erik182.models.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoutType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="LAYA"/>
 *     &lt;enumeration value="LAYB"/>
 *     &lt;enumeration value="ANYY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LayoutType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum LayoutType {

    LAYA,
    LAYB,
    ANYY;

    public String value() {
        return name();
    }

    public static LayoutType fromValue(String v) {
        return valueOf(v);
    }

}
