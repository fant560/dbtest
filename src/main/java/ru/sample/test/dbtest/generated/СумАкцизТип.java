
package ru.sample.test.dbtest.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сумма акциза
 * 
 * <p>Java class for СумАкцизТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СумАкцизТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="СумАкциз">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="19"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="БезАкциз">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;enumeration value="без акциза"/>
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
@XmlType(name = "\u0421\u0443\u043c\u0410\u043a\u0446\u0438\u0437\u0422\u0438\u043f", propOrder = {
    "\u0441\u0443\u043c\u0410\u043a\u0446\u0438\u0437",
    "\u0431\u0435\u0437\u0410\u043a\u0446\u0438\u0437"
})
public class СумАкцизТип {

    @XmlElement(name = "\u0421\u0443\u043c\u0410\u043a\u0446\u0438\u0437")
    protected BigDecimal сумАкциз;
    @XmlElement(name = "\u0411\u0435\u0437\u0410\u043a\u0446\u0438\u0437")
    protected String безАкциз;

    /**
     * Gets the value of the сумАкциз property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСумАкциз() {
        return сумАкциз;
    }

    /**
     * Sets the value of the сумАкциз property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСумАкциз(BigDecimal value) {
        this.сумАкциз = value;
    }

    /**
     * Gets the value of the безАкциз property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getБезАкциз() {
        return безАкциз;
    }

    /**
     * Sets the value of the безАкциз property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setБезАкциз(String value) {
        this.безАкциз = value;
    }

}
