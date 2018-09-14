
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об индивидуальном предпринимателе
 * 
 * <p>Java class for СвИПТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвИПТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ФИО" type="{}ФИОТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ИННФЛ" use="required" type="{}ИННФЛТип" />
 *       &lt;attribute name="СвГосРегИП">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ИныеСвед">
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
@XmlType(name = "\u0421\u0432\u0418\u041f\u0422\u0438\u043f", propOrder = {
    "\u0444\u0438\u043e"
})
public class СвИПТип {

    @XmlElement(name = "\u0424\u0418\u041e", required = true)
    protected ФИОТип фио;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b", required = true)
    protected String иннфл;
    @XmlAttribute(name = "\u0421\u0432\u0413\u043e\u0441\u0420\u0435\u0433\u0418\u041f")
    protected String свГосРегИП;
    @XmlAttribute(name = "\u0418\u043d\u044b\u0435\u0421\u0432\u0435\u0434")
    protected String иныеСвед;

    /**
     * Gets the value of the фио property.
     * 
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *     
     */
    public ФИОТип getФИО() {
        return фио;
    }

    /**
     * Sets the value of the фио property.
     * 
     * @param value
     *     allowed object is
     *     {@link ФИОТип }
     *     
     */
    public void setФИО(ФИОТип value) {
        this.фио = value;
    }

    /**
     * Gets the value of the иннфл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИННФЛ() {
        return иннфл;
    }

    /**
     * Sets the value of the иннфл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИННФЛ(String value) {
        this.иннфл = value;
    }

    /**
     * Gets the value of the свГосРегИП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСвГосРегИП() {
        return свГосРегИП;
    }

    /**
     * Sets the value of the свГосРегИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСвГосРегИП(String value) {
        this.свГосРегИП = value;
    }

    /**
     * Gets the value of the иныеСвед property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИныеСвед() {
        return иныеСвед;
    }

    /**
     * Sets the value of the иныеСвед property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИныеСвед(String value) {
        this.иныеСвед = value;
    }

}
