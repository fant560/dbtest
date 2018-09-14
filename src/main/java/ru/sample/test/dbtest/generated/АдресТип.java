
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об адресе
 * 
 * <p>Java class for АдресТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдресТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="АдрРФ" type="{}АдрРФТип"/>
 *         &lt;element name="АдрИнф" type="{}АдрИнфТип"/>
 *         &lt;element name="КодГАР" type="{}string-36"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441\u0422\u0438\u043f", propOrder = {
    "\u0430\u0434\u0440\u0420\u0424",
    "\u0430\u0434\u0440\u0418\u043d\u0444",
    "\u043a\u043e\u0434\u0413\u0410\u0420"
})
public class АдресТип {

    @XmlElement(name = "\u0410\u0434\u0440\u0420\u0424")
    protected АдрРФТип адрРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u0418\u043d\u0444")
    protected АдрИнфТип адрИнф;
    @XmlElement(name = "\u041a\u043e\u0434\u0413\u0410\u0420")
    protected String кодГАР;

    /**
     * Gets the value of the адрРФ property.
     * 
     * @return
     *     possible object is
     *     {@link АдрРФТип }
     *     
     */
    public АдрРФТип getАдрРФ() {
        return адрРФ;
    }

    /**
     * Sets the value of the адрРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрРФТип }
     *     
     */
    public void setАдрРФ(АдрРФТип value) {
        this.адрРФ = value;
    }

    /**
     * Gets the value of the адрИнф property.
     * 
     * @return
     *     possible object is
     *     {@link АдрИнфТип }
     *     
     */
    public АдрИнфТип getАдрИнф() {
        return адрИнф;
    }

    /**
     * Sets the value of the адрИнф property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрИнфТип }
     *     
     */
    public void setАдрИнф(АдрИнфТип value) {
        this.адрИнф = value;
    }

    /**
     * Gets the value of the кодГАР property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодГАР() {
        return кодГАР;
    }

    /**
     * Sets the value of the кодГАР property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодГАР(String value) {
        this.кодГАР = value;
    }

}
