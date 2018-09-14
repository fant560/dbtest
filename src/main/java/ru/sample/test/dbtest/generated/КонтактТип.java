
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Контактные данные
 * 
 * <p>Java class for КонтактТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="КонтактТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Тлф">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ЭлПочта">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
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
@XmlType(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442\u0422\u0438\u043f")
public class КонтактТип {

    @XmlAttribute(name = "\u0422\u043b\u0444")
    protected String тлф;
    @XmlAttribute(name = "\u042d\u043b\u041f\u043e\u0447\u0442\u0430")
    protected String элПочта;

    /**
     * Gets the value of the тлф property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getТлф() {
        return тлф;
    }

    /**
     * Sets the value of the тлф property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setТлф(String value) {
        this.тлф = value;
    }

    /**
     * Gets the value of the элПочта property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЭлПочта() {
        return элПочта;
    }

    /**
     * Sets the value of the элПочта property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЭлПочта(String value) {
        this.элПочта = value;
    }

}
