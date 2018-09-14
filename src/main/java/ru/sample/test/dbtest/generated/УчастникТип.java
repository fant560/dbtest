
package ru.sample.test.dbtest.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об участнике факта хозяйственной жизни
 * 
 * <p>Java class for УчастникТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="УчастникТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ИдСв">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="СвИП" type="{}СвИПТип"/>
 *                   &lt;element name="СвЮЛУч">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="НаимОрг" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="КПП" type="{}КППТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвИнНеУч">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="НаимОрг" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ИныеСвед">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Адрес" type="{}АдресТип" minOccurs="0"/>
 *         &lt;element name="Контакт" type="{}КонтактТип" minOccurs="0"/>
 *         &lt;element name="БанкРекв" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвБанк" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="НаимБанк">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="БИК" type="{}БИКТип" />
 *                           &lt;attribute name="КорСчет">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="20"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="НомерСчета">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="20"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ОКПО">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СтруктПодр">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ИнфДляУчаст">
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
@XmlType(name = "\u0423\u0447\u0430\u0441\u0442\u043d\u0438\u043a\u0422\u0438\u043f", propOrder = {
    "\u0438\u0434\u0421\u0432",
    "\u0430\u0434\u0440\u0435\u0441",
    "\u043a\u043e\u043d\u0442\u0430\u043a\u0442",
    "\u0431\u0430\u043d\u043a\u0420\u0435\u043a\u0432"
})
public class УчастникТип {

    @XmlElement(name = "\u0418\u0434\u0421\u0432", required = true)
    protected УчастникТип.ИдСв идСв;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441")
    protected АдресТип адрес;
    @XmlElement(name = "\u041a\u043e\u043d\u0442\u0430\u043a\u0442")
    protected КонтактТип контакт;
    @XmlElement(name = "\u0411\u0430\u043d\u043a\u0420\u0435\u043a\u0432")
    protected УчастникТип.БанкРекв банкРекв;
    @XmlAttribute(name = "\u041e\u041a\u041f\u041e")
    protected String окпо;
    @XmlAttribute(name = "\u0421\u0442\u0440\u0443\u043a\u0442\u041f\u043e\u0434\u0440")
    protected String структПодр;
    @XmlAttribute(name = "\u0418\u043d\u0444\u0414\u043b\u044f\u0423\u0447\u0430\u0441\u0442")
    protected String инфДляУчаст;

    /**
     * Gets the value of the идСв property.
     * 
     * @return
     *     possible object is
     *     {@link УчастникТип.ИдСв }
     *     
     */
    public УчастникТип.ИдСв getИдСв() {
        return идСв;
    }

    /**
     * Sets the value of the идСв property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчастникТип.ИдСв }
     *     
     */
    public void setИдСв(УчастникТип.ИдСв value) {
        this.идСв = value;
    }

    /**
     * Gets the value of the адрес property.
     * 
     * @return
     *     possible object is
     *     {@link АдресТип }
     *     
     */
    public АдресТип getАдрес() {
        return адрес;
    }

    /**
     * Sets the value of the адрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдресТип }
     *     
     */
    public void setАдрес(АдресТип value) {
        this.адрес = value;
    }

    /**
     * Gets the value of the контакт property.
     * 
     * @return
     *     possible object is
     *     {@link КонтактТип }
     *     
     */
    public КонтактТип getКонтакт() {
        return контакт;
    }

    /**
     * Sets the value of the контакт property.
     * 
     * @param value
     *     allowed object is
     *     {@link КонтактТип }
     *     
     */
    public void setКонтакт(КонтактТип value) {
        this.контакт = value;
    }

    /**
     * Gets the value of the банкРекв property.
     * 
     * @return
     *     possible object is
     *     {@link УчастникТип.БанкРекв }
     *     
     */
    public УчастникТип.БанкРекв getБанкРекв() {
        return банкРекв;
    }

    /**
     * Sets the value of the банкРекв property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчастникТип.БанкРекв }
     *     
     */
    public void setБанкРекв(УчастникТип.БанкРекв value) {
        this.банкРекв = value;
    }

    /**
     * Gets the value of the окпо property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКПО() {
        return окпо;
    }

    /**
     * Sets the value of the окпо property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКПО(String value) {
        this.окпо = value;
    }

    /**
     * Gets the value of the структПодр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСтруктПодр() {
        return структПодр;
    }

    /**
     * Sets the value of the структПодр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСтруктПодр(String value) {
        this.структПодр = value;
    }

    /**
     * Gets the value of the инфДляУчаст property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИнфДляУчаст() {
        return инфДляУчаст;
    }

    /**
     * Sets the value of the инфДляУчаст property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИнфДляУчаст(String value) {
        this.инфДляУчаст = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="СвБанк" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="НаимБанк">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="1000"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="БИК" type="{}БИКТип" />
     *                 &lt;attribute name="КорСчет">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="20"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="НомерСчета">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="20"/>
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
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u0411\u0430\u043d\u043a"
    })
    public static class БанкРекв {

        @XmlElement(name = "\u0421\u0432\u0411\u0430\u043d\u043a")
        protected УчастникТип.БанкРекв.СвБанк свБанк;
        @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0447\u0435\u0442\u0430")
        protected String номерСчета;

        /**
         * Gets the value of the свБанк property.
         * 
         * @return
         *     possible object is
         *     {@link УчастникТип.БанкРекв.СвБанк }
         *     
         */
        public УчастникТип.БанкРекв.СвБанк getСвБанк() {
            return свБанк;
        }

        /**
         * Sets the value of the свБанк property.
         * 
         * @param value
         *     allowed object is
         *     {@link УчастникТип.БанкРекв.СвБанк }
         *     
         */
        public void setСвБанк(УчастникТип.БанкРекв.СвБанк value) {
            this.свБанк = value;
        }

        /**
         * Gets the value of the номерСчета property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНомерСчета() {
            return номерСчета;
        }

        /**
         * Sets the value of the номерСчета property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНомерСчета(String value) {
            this.номерСчета = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="НаимБанк">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="БИК" type="{}БИКТип" />
         *       &lt;attribute name="КорСчет">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="20"/>
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
        @XmlType(name = "")
        public static class СвБанк {

            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0411\u0430\u043d\u043a")
            protected String наимБанк;
            @XmlAttribute(name = "\u0411\u0418\u041a")
            protected String бик;
            @XmlAttribute(name = "\u041a\u043e\u0440\u0421\u0447\u0435\u0442")
            protected String корСчет;

            /**
             * Gets the value of the наимБанк property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимБанк() {
                return наимБанк;
            }

            /**
             * Sets the value of the наимБанк property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимБанк(String value) {
                this.наимБанк = value;
            }

            /**
             * Gets the value of the бик property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getБИК() {
                return бик;
            }

            /**
             * Sets the value of the бик property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setБИК(String value) {
                this.бик = value;
            }

            /**
             * Gets the value of the корСчет property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКорСчет() {
                return корСчет;
            }

            /**
             * Sets the value of the корСчет property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКорСчет(String value) {
                this.корСчет = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="СвИП" type="{}СвИПТип"/>
     *         &lt;element name="СвЮЛУч">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="НаимОрг" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="1000"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
     *                 &lt;attribute name="КПП" type="{}КППТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвИнНеУч">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="НаимОрг" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="1000"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ИныеСвед">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="255"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u0418\u041f",
        "\u0441\u0432\u042e\u041b\u0423\u0447",
        "\u0441\u0432\u0418\u043d\u041d\u0435\u0423\u0447"
    })
    public static class ИдСв {

        @XmlElement(name = "\u0421\u0432\u0418\u041f")
        protected СвИПТип свИП;
        @XmlElement(name = "\u0421\u0432\u042e\u041b\u0423\u0447")
        protected УчастникТип.ИдСв.СвЮЛУч свЮЛУч;
        @XmlElement(name = "\u0421\u0432\u0418\u043d\u041d\u0435\u0423\u0447")
        protected УчастникТип.ИдСв.СвИнНеУч свИнНеУч;

        /**
         * Gets the value of the свИП property.
         * 
         * @return
         *     possible object is
         *     {@link СвИПТип }
         *     
         */
        public СвИПТип getСвИП() {
            return свИП;
        }

        /**
         * Sets the value of the свИП property.
         * 
         * @param value
         *     allowed object is
         *     {@link СвИПТип }
         *     
         */
        public void setСвИП(СвИПТип value) {
            this.свИП = value;
        }

        /**
         * Gets the value of the свЮЛУч property.
         * 
         * @return
         *     possible object is
         *     {@link УчастникТип.ИдСв.СвЮЛУч }
         *     
         */
        public УчастникТип.ИдСв.СвЮЛУч getСвЮЛУч() {
            return свЮЛУч;
        }

        /**
         * Sets the value of the свЮЛУч property.
         * 
         * @param value
         *     allowed object is
         *     {@link УчастникТип.ИдСв.СвЮЛУч }
         *     
         */
        public void setСвЮЛУч(УчастникТип.ИдСв.СвЮЛУч value) {
            this.свЮЛУч = value;
        }

        /**
         * Gets the value of the свИнНеУч property.
         * 
         * @return
         *     possible object is
         *     {@link УчастникТип.ИдСв.СвИнНеУч }
         *     
         */
        public УчастникТип.ИдСв.СвИнНеУч getСвИнНеУч() {
            return свИнНеУч;
        }

        /**
         * Sets the value of the свИнНеУч property.
         * 
         * @param value
         *     allowed object is
         *     {@link УчастникТип.ИдСв.СвИнНеУч }
         *     
         */
        public void setСвИнНеУч(УчастникТип.ИдСв.СвИнНеУч value) {
            this.свИнНеУч = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="НаимОрг" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
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
        @XmlType(name = "")
        public static class СвИнНеУч {

            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", required = true)
            protected String наимОрг;
            @XmlAttribute(name = "\u0418\u043d\u044b\u0435\u0421\u0432\u0435\u0434")
            protected String иныеСвед;

            /**
             * Gets the value of the наимОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимОрг() {
                return наимОрг;
            }

            /**
             * Sets the value of the наимОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимОрг(String value) {
                this.наимОрг = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="НаимОрг" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
         *       &lt;attribute name="КПП" type="{}КППТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвЮЛУч {

            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", required = true)
            protected String наимОрг;
            @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
            protected String иннюл;
            @XmlAttribute(name = "\u041a\u041f\u041f")
            protected String кпп;

            /**
             * Gets the value of the наимОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимОрг() {
                return наимОрг;
            }

            /**
             * Sets the value of the наимОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимОрг(String value) {
                this.наимОрг = value;
            }

            /**
             * Gets the value of the иннюл property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИННЮЛ() {
                return иннюл;
            }

            /**
             * Sets the value of the иннюл property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИННЮЛ(String value) {
                this.иннюл = value;
            }

            /**
             * Gets the value of the кпп property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКПП() {
                return кпп;
            }

            /**
             * Sets the value of the кпп property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКПП(String value) {
                this.кпп = value;
            }

        }

    }

}
