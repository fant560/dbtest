
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Текстовая информация
 * 
 * <p>Java class for ТекстИнфТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ТекстИнфТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Идентиф" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Значен" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="2000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0422\u0435\u043a\u0441\u0442\u0418\u043d\u0444\u0422\u0438\u043f")
public class ТекстИнфТип {

    @XmlAttribute(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444", required = true)
    protected String идентиф;
    @XmlAttribute(name = "\u0417\u043d\u0430\u0447\u0435\u043d", required = true)
    protected String значен;

    /**
     * Gets the value of the идентиф property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдентиф() {
        return идентиф;
    }

    /**
     * Sets the value of the идентиф property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдентиф(String value) {
        this.идентиф = value;
    }

    /**
     * Gets the value of the значен property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЗначен() {
        return значен;
    }

    /**
     * Sets the value of the значен property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЗначен(String value) {
        this.значен = value;
    }

}
