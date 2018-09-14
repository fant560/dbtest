
package ru.sample.test.dbtest.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сумма НДС
 * 
 * <p>Java class for СумНДСТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СумНДСТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="СумНал">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="БезНДС">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *               &lt;minLength value="1"/>
 *               &lt;enumeration value="без НДС"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0443\u043c\u041d\u0414\u0421\u0422\u0438\u043f", propOrder = {
    "\u0441\u0443\u043c\u041d\u0430\u043b",
    "\u0431\u0435\u0437\u041d\u0414\u0421"
})
public class СумНДСТип {

    @XmlElement(name = "\u0421\u0443\u043c\u041d\u0430\u043b")
    protected BigDecimal сумНал;
    @XmlElement(name = "\u0411\u0435\u0437\u041d\u0414\u0421")
    protected String безНДС;

    /**
     * Gets the value of the сумНал property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСумНал() {
        return сумНал;
    }

    /**
     * Sets the value of the сумНал property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСумНал(BigDecimal value) {
        this.сумНал = value;
    }

    /**
     * Gets the value of the безНДС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getБезНДС() {
        return безНДС;
    }

    /**
     * Sets the value of the безНДС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setБезНДС(String value) {
        this.безНДС = value;
    }

}
