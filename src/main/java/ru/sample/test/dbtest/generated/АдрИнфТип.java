
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об адресе, в том числе об адресе за пределами территории Российской Федерации
 * 
 * <p>Java class for АдрИнфТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрИнфТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодСтр" use="required" type="{}ОКСМТип" />
 *       &lt;attribute name="АдрТекст" use="required">
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
@XmlType(name = "\u0410\u0434\u0440\u0418\u043d\u0444\u0422\u0438\u043f")
public class АдрИнфТип {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0440", required = true)
    protected String кодСтр;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0422\u0435\u043a\u0441\u0442", required = true)
    protected String адрТекст;

    /**
     * Gets the value of the кодСтр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСтр() {
        return кодСтр;
    }

    /**
     * Sets the value of the кодСтр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСтр(String value) {
        this.кодСтр = value;
    }

    /**
     * Gets the value of the адрТекст property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрТекст() {
        return адрТекст;
    }

    /**
     * Sets the value of the адрТекст property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрТекст(String value) {
        this.адрТекст = value;
    }

}
