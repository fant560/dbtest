
package ru.sample.test.dbtest.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="СвУчДокОбор">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОЭДОтпр" minOccurs="0">
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
 *                           &lt;attribute name="ИдЭДО" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдОтпр" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="4"/>
 *                       &lt;maxLength value="46"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ИдПол" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="4"/>
 *                       &lt;maxLength value="46"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Документ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвСчФакт">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ИспрСчФ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="НомИспрСчФ" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;totalDigits value="3"/>
 *                                           &lt;minInclusive value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаИспрСчФ" use="required" type="{}ДатаТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвПрод" type="{}УчастникТип"/>
 *                             &lt;element name="ГрузОт" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="ГрузОтпр" type="{}УчастникТип"/>
 *                                       &lt;element name="ОнЖе">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="5"/>
 *                                             &lt;enumeration value="он же"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ГрузПолуч" type="{}УчастникТип" minOccurs="0"/>
 *                             &lt;element name="СвПРД" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="НомерПРД" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="30"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаПРД" use="required" type="{}ДатаТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвПокуп" type="{}УчастникТип"/>
 *                             &lt;element name="ДопСвФХЖ1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ИдГосКон">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимОКВ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="100"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="КурсВал">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="10"/>
 *                                           &lt;fractionDigits value="4"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ИнфПолФХЖ1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ИдФайлИнфПол">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="36"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="НомерСчФ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаСчФ" use="required" type="{}ДатаТип" />
 *                           &lt;attribute name="КодОКВ" use="required" type="{}ОКВТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ТаблСчФакт" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СведТов" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Акциз" type="{}СумАкцизТип"/>
 *                                       &lt;element name="СумНал" type="{}СумНДСТип"/>
 *                                       &lt;element name="СвТД" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="КодПроисх" use="required" type="{}ОКСМТип" />
 *                                               &lt;attribute name="НомерТД" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="29"/>
 *                                                     &lt;minLength value="1"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ИнфПолФХЖ2" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
 *                                       &lt;element name="ДопСведТов" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ПрТовРаб">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="1"/>
 *                                                     &lt;enumeration value="2"/>
 *                                                     &lt;enumeration value="3"/>
 *                                                     &lt;enumeration value="4"/>
 *                                                     &lt;enumeration value="5"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДопПризн">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="4"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КодТов">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НаимЕдИзм">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КрНаимСтрПр">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НадлОтп">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;totalDigits value="26"/>
 *                                                     &lt;fractionDigits value="11"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КорСчДебет">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="9"/>
 *                                                     &lt;pattern value="[0-9]{9}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КорСчКредит">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="9"/>
 *                                                     &lt;pattern value="[0-9]{9}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="НомСтр" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;totalDigits value="6"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимТов" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="1000"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ОКЕИ_Тов" type="{}ОКЕИТип" />
 *                                     &lt;attribute name="КолТов">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="26"/>
 *                                           &lt;fractionDigits value="11"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ЦенаТов">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="26"/>
 *                                           &lt;fractionDigits value="11"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СтТовБезНДС">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="19"/>
 *                                           &lt;fractionDigits value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НалСт" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="7"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;enumeration value="0%"/>
 *                                           &lt;enumeration value="10%"/>
 *                                           &lt;enumeration value="18%"/>
 *                                           &lt;enumeration value="10/110"/>
 *                                           &lt;enumeration value="18/118"/>
 *                                           &lt;enumeration value="без НДС"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СтТовУчНал" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="19"/>
 *                                           &lt;fractionDigits value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ВсегоОпл">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="СумНалВсего" type="{}СумНДСТип"/>
 *                                       &lt;element name="НеттоВс" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;totalDigits value="26"/>
 *                                             &lt;fractionDigits value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="СтТовБезНДСВсего">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="19"/>
 *                                           &lt;fractionDigits value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СтТовУчНалВсего" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;totalDigits value="19"/>
 *                                           &lt;fractionDigits value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвПродПер" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СвПер">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ОснПер" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="НаимОсн" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НомОсн">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаОсн" type="{}ДатаТип" />
 *                                               &lt;attribute name="ДопСвОсн">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="0"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвЛицПер" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="РабОргПрод">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ФИО" type="{}ФИОТип"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Должность" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="128"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="ИныеСвед">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="255"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="ОснПолн">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="120"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ИнЛицо">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element name="ПредОргПер">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ФИО" type="{}ФИОТип"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Должность" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="128"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="ИныеСвед">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="255"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="НаимОргПер" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="128"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="ОснДоверОргПер">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="120"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="ОснПолнПредПер">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="120"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="ФЛПер">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ФИО" type="{}ФИОТип"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="ИныеСвед">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="255"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="ОснДоверФЛ">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="120"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ТранГруз" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ТранНакл" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="НомТранНакл" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="255"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Перевозчик" type="{}УчастникТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="СвТранГруз">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвПерВещи" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ДатаПерВещ" type="{}ДатаТип" />
 *                                               &lt;attribute name="СвПерВещ">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="СодОпер" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ВидОпер">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаПер" type="{}ДатаТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ИнфПолФХЖ3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ИдФайлИнфПол">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="36"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Подписант" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="ФЛ">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ФИО" type="{}ФИОТип"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ГосРегИПВыдДов">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="100"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                                     &lt;attribute name="ИныеСвед">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ИП" type="{}СвИПТип"/>
 *                             &lt;element name="ЮЛ">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ФИО" type="{}ФИОТип"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ГосРегИПВыдДов">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="100"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
 *                                     &lt;attribute name="НаимОрг">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="1000"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Должн" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="128"/>
 *                                           &lt;minLength value="0"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ИныеСвед">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                           &lt;attribute name="ОблПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;enumeration value="0"/>
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                                 &lt;enumeration value="4"/>
 *                                 &lt;enumeration value="5"/>
 *                                 &lt;enumeration value="6"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Статус" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                                 &lt;enumeration value="4"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ОснПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ОснПолнОрг">
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="КНД" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{}КНДТип">
 *                       &lt;enumeration value="1115125"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Функция" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="3"/>
 *                       &lt;maxLength value="6"/>
 *                       &lt;enumeration value="СЧФ"/>
 *                       &lt;enumeration value="СЧФДОП"/>
 *                       &lt;enumeration value="ДОП"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ПоФактХЖ">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимДокОпр">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаИнфПр" use="required" type="{}ДатаТип" />
 *                 &lt;attribute name="ВремИнфПр" use="required" type="{}ВремяТип" />
 *                 &lt;attribute name="НаимЭконСубСост" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ОснДоверОргСост">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="120"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдФайл" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="200"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсФорм" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="5.01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсПрог">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *             &lt;minLength value="1"/>
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
    "\u0441\u0432\u0423\u0447\u0414\u043e\u043a\u041e\u0431\u043e\u0440",
    "\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442"
})
@XmlRootElement(name = "\u0424\u0430\u0439\u043b")
public class Файл {

    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0414\u043e\u043a\u041e\u0431\u043e\u0440", required = true)
    protected Файл.СвУчДокОбор свУчДокОбор;
    @XmlElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442", required = true)
    protected Файл.Документ документ;
    @XmlAttribute(name = "\u0418\u0434\u0424\u0430\u0439\u043b", required = true)
    protected String идФайл;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String версФорм;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u041f\u0440\u043e\u0433")
    protected String версПрог;

    /**
     * Gets the value of the свУчДокОбор property.
     * 
     * @return
     *     possible object is
     *     {@link Файл.СвУчДокОбор }
     *     
     */
    public Файл.СвУчДокОбор getСвУчДокОбор() {
        return свУчДокОбор;
    }

    /**
     * Sets the value of the свУчДокОбор property.
     * 
     * @param value
     *     allowed object is
     *     {@link Файл.СвУчДокОбор }
     *     
     */
    public void setСвУчДокОбор(Файл.СвУчДокОбор value) {
        this.свУчДокОбор = value;
    }

    /**
     * Gets the value of the документ property.
     * 
     * @return
     *     possible object is
     *     {@link Файл.Документ }
     *     
     */
    public Файл.Документ getДокумент() {
        return документ;
    }

    /**
     * Sets the value of the документ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Файл.Документ }
     *     
     */
    public void setДокумент(Файл.Документ value) {
        this.документ = value;
    }

    /**
     * Gets the value of the идФайл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдФайл() {
        return идФайл;
    }

    /**
     * Sets the value of the идФайл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдФайл(String value) {
        this.идФайл = value;
    }

    /**
     * Gets the value of the версФорм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсФорм() {
        return версФорм;
    }

    /**
     * Sets the value of the версФорм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсФорм(String value) {
        this.версФорм = value;
    }

    /**
     * Gets the value of the версПрог property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсПрог() {
        return версПрог;
    }

    /**
     * Sets the value of the версПрог property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсПрог(String value) {
        this.версПрог = value;
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
     *         &lt;element name="СвСчФакт">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ИспрСчФ" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="НомИспрСчФ" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;totalDigits value="3"/>
     *                                 &lt;minInclusive value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ДатаИспрСчФ" use="required" type="{}ДатаТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СвПрод" type="{}УчастникТип"/>
     *                   &lt;element name="ГрузОт" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="ГрузОтпр" type="{}УчастникТип"/>
     *                             &lt;element name="ОнЖе">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="5"/>
     *                                   &lt;enumeration value="он же"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ГрузПолуч" type="{}УчастникТип" minOccurs="0"/>
     *                   &lt;element name="СвПРД" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="НомерПРД" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="30"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ДатаПРД" use="required" type="{}ДатаТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СвПокуп" type="{}УчастникТип"/>
     *                   &lt;element name="ДопСвФХЖ1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ИдГосКон">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="255"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="НаимОКВ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="100"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="КурсВал">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="10"/>
     *                                 &lt;fractionDigits value="4"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ИнфПолФХЖ1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ИдФайлИнфПол">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="36"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="НомерСчФ" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="1000"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ДатаСчФ" use="required" type="{}ДатаТип" />
     *                 &lt;attribute name="КодОКВ" use="required" type="{}ОКВТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ТаблСчФакт" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СведТов" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Акциз" type="{}СумАкцизТип"/>
     *                             &lt;element name="СумНал" type="{}СумНДСТип"/>
     *                             &lt;element name="СвТД" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="КодПроисх" use="required" type="{}ОКСМТип" />
     *                                     &lt;attribute name="НомерТД" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="29"/>
     *                                           &lt;minLength value="1"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ИнфПолФХЖ2" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
     *                             &lt;element name="ДопСведТов" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ПрТовРаб">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="1"/>
     *                                           &lt;enumeration value="2"/>
     *                                           &lt;enumeration value="3"/>
     *                                           &lt;enumeration value="4"/>
     *                                           &lt;enumeration value="5"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДопПризн">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="4"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="КодТов">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НаимЕдИзм">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="КрНаимСтрПр">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НадлОтп">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;totalDigits value="26"/>
     *                                           &lt;fractionDigits value="11"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="КорСчДебет">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="9"/>
     *                                           &lt;pattern value="[0-9]{9}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="КорСчКредит">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="9"/>
     *                                           &lt;pattern value="[0-9]{9}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="НомСтр" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;totalDigits value="6"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="НаимТов" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="1000"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ОКЕИ_Тов" type="{}ОКЕИТип" />
     *                           &lt;attribute name="КолТов">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="26"/>
     *                                 &lt;fractionDigits value="11"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ЦенаТов">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="26"/>
     *                                 &lt;fractionDigits value="11"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="СтТовБезНДС">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="19"/>
     *                                 &lt;fractionDigits value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="НалСт" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="7"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;enumeration value="0%"/>
     *                                 &lt;enumeration value="10%"/>
     *                                 &lt;enumeration value="18%"/>
     *                                 &lt;enumeration value="10/110"/>
     *                                 &lt;enumeration value="18/118"/>
     *                                 &lt;enumeration value="без НДС"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="СтТовУчНал" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="19"/>
     *                                 &lt;fractionDigits value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ВсегоОпл">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="СумНалВсего" type="{}СумНДСТип"/>
     *                             &lt;element name="НеттоВс" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;totalDigits value="26"/>
     *                                   &lt;fractionDigits value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="СтТовБезНДСВсего">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="19"/>
     *                                 &lt;fractionDigits value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="СтТовУчНалВсего" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;totalDigits value="19"/>
     *                                 &lt;fractionDigits value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвПродПер" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СвПер">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ОснПер" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НаимОсн" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НомОсн">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаОсн" type="{}ДатаТип" />
     *                                     &lt;attribute name="ДопСвОсн">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="0"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвЛицПер" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="РабОргПрод">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ФИО" type="{}ФИОТип"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Должность" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="128"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="ИныеСвед">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="255"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="ОснПолн">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="120"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ИнЛицо">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element name="ПредОргПер">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ФИО" type="{}ФИОТип"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Должность" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="128"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="ИныеСвед">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="255"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="НаимОргПер" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="128"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="ОснДоверОргПер">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="120"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="ОснПолнПредПер">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="120"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="ФЛПер">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ФИО" type="{}ФИОТип"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="ИныеСвед">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="255"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="ОснДоверФЛ">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="120"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/choice>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ТранГруз" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ТранНакл" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="НомТранНакл" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="255"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Перевозчик" type="{}УчастникТип" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="СвТранГруз">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвПерВещи" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ДатаПерВещ" type="{}ДатаТип" />
     *                                     &lt;attribute name="СвПерВещ">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="СодОпер" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="255"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ВидОпер">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="255"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ДатаПер" type="{}ДатаТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ИнфПолФХЖ3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ИдФайлИнфПол">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="36"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Подписант" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="ФЛ">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ФИО" type="{}ФИОТип"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ГосРегИПВыдДов">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="100"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
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
     *                   &lt;element name="ИП" type="{}СвИПТип"/>
     *                   &lt;element name="ЮЛ">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ФИО" type="{}ФИОТип"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ГосРегИПВыдДов">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="100"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
     *                           &lt;attribute name="НаимОрг">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="1000"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Должн" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="128"/>
     *                                 &lt;minLength value="0"/>
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
     *                 &lt;attribute name="ОблПолн" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                       &lt;enumeration value="0"/>
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                       &lt;enumeration value="3"/>
     *                       &lt;enumeration value="4"/>
     *                       &lt;enumeration value="5"/>
     *                       &lt;enumeration value="6"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Статус" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                       &lt;enumeration value="3"/>
     *                       &lt;enumeration value="4"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ОснПолн" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="255"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ОснПолнОрг">
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
     *       &lt;/sequence>
     *       &lt;attribute name="КНД" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{}КНДТип">
     *             &lt;enumeration value="1115125"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Функция" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="3"/>
     *             &lt;maxLength value="6"/>
     *             &lt;enumeration value="СЧФ"/>
     *             &lt;enumeration value="СЧФДОП"/>
     *             &lt;enumeration value="ДОП"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ПоФактХЖ">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимДокОпр">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаИнфПр" use="required" type="{}ДатаТип" />
     *       &lt;attribute name="ВремИнфПр" use="required" type="{}ВремяТип" />
     *       &lt;attribute name="НаимЭконСубСост" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ОснДоверОргСост">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="120"/>
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
        "\u0441\u0432\u0421\u0447\u0424\u0430\u043a\u0442",
        "\u0442\u0430\u0431\u043b\u0421\u0447\u0424\u0430\u043a\u0442",
        "\u0441\u0432\u041f\u0440\u043e\u0434\u041f\u0435\u0440",
        "\u043f\u043e\u0434\u043f\u0438\u0441\u0430\u043d\u0442"
    })
    public static class Документ {

        @XmlElement(name = "\u0421\u0432\u0421\u0447\u0424\u0430\u043a\u0442", required = true)
        protected Файл.Документ.СвСчФакт свСчФакт;
        @XmlElement(name = "\u0422\u0430\u0431\u043b\u0421\u0447\u0424\u0430\u043a\u0442")
        protected Файл.Документ.ТаблСчФакт таблСчФакт;
        @XmlElement(name = "\u0421\u0432\u041f\u0440\u043e\u0434\u041f\u0435\u0440")
        protected Файл.Документ.СвПродПер свПродПер;
        @XmlElement(name = "\u041f\u043e\u0434\u043f\u0438\u0441\u0430\u043d\u0442", required = true)
        protected List<Файл.Документ.Подписант> подписант;
        @XmlAttribute(name = "\u041a\u041d\u0414", required = true)
        protected String кнд;
        @XmlAttribute(name = "\u0424\u0443\u043d\u043a\u0446\u0438\u044f", required = true)
        protected String функция;
        @XmlAttribute(name = "\u041f\u043e\u0424\u0430\u043a\u0442\u0425\u0416")
        protected String поФактХЖ;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a\u041e\u043f\u0440")
        protected String наимДокОпр;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0418\u043d\u0444\u041f\u0440", required = true)
        protected String датаИнфПр;
        @XmlAttribute(name = "\u0412\u0440\u0435\u043c\u0418\u043d\u0444\u041f\u0440", required = true)
        protected String времИнфПр;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042d\u043a\u043e\u043d\u0421\u0443\u0431\u0421\u043e\u0441\u0442", required = true)
        protected String наимЭконСубСост;
        @XmlAttribute(name = "\u041e\u0441\u043d\u0414\u043e\u0432\u0435\u0440\u041e\u0440\u0433\u0421\u043e\u0441\u0442")
        protected String оснДоверОргСост;

        /**
         * Gets the value of the свСчФакт property.
         * 
         * @return
         *     possible object is
         *     {@link Файл.Документ.СвСчФакт }
         *     
         */
        public Файл.Документ.СвСчФакт getСвСчФакт() {
            return свСчФакт;
        }

        /**
         * Sets the value of the свСчФакт property.
         * 
         * @param value
         *     allowed object is
         *     {@link Файл.Документ.СвСчФакт }
         *     
         */
        public void setСвСчФакт(Файл.Документ.СвСчФакт value) {
            this.свСчФакт = value;
        }

        /**
         * Gets the value of the таблСчФакт property.
         * 
         * @return
         *     possible object is
         *     {@link Файл.Документ.ТаблСчФакт }
         *     
         */
        public Файл.Документ.ТаблСчФакт getТаблСчФакт() {
            return таблСчФакт;
        }

        /**
         * Sets the value of the таблСчФакт property.
         * 
         * @param value
         *     allowed object is
         *     {@link Файл.Документ.ТаблСчФакт }
         *     
         */
        public void setТаблСчФакт(Файл.Документ.ТаблСчФакт value) {
            this.таблСчФакт = value;
        }

        /**
         * Gets the value of the свПродПер property.
         * 
         * @return
         *     possible object is
         *     {@link Файл.Документ.СвПродПер }
         *     
         */
        public Файл.Документ.СвПродПер getСвПродПер() {
            return свПродПер;
        }

        /**
         * Sets the value of the свПродПер property.
         * 
         * @param value
         *     allowed object is
         *     {@link Файл.Документ.СвПродПер }
         *     
         */
        public void setСвПродПер(Файл.Документ.СвПродПер value) {
            this.свПродПер = value;
        }

        /**
         * Gets the value of the подписант property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the подписант property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getПодписант().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Файл.Документ.Подписант }
         * 
         * 
         */
        public List<Файл.Документ.Подписант> getПодписант() {
            if (подписант == null) {
                подписант = new ArrayList<Файл.Документ.Подписант>();
            }
            return this.подписант;
        }

        /**
         * Gets the value of the кнд property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКНД() {
            return кнд;
        }

        /**
         * Sets the value of the кнд property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКНД(String value) {
            this.кнд = value;
        }

        /**
         * Gets the value of the функция property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getФункция() {
            return функция;
        }

        /**
         * Sets the value of the функция property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setФункция(String value) {
            this.функция = value;
        }

        /**
         * Gets the value of the поФактХЖ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getПоФактХЖ() {
            return поФактХЖ;
        }

        /**
         * Sets the value of the поФактХЖ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setПоФактХЖ(String value) {
            this.поФактХЖ = value;
        }

        /**
         * Gets the value of the наимДокОпр property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимДокОпр() {
            return наимДокОпр;
        }

        /**
         * Sets the value of the наимДокОпр property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимДокОпр(String value) {
            this.наимДокОпр = value;
        }

        /**
         * Gets the value of the датаИнфПр property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getДатаИнфПр() {
            return датаИнфПр;
        }

        /**
         * Sets the value of the датаИнфПр property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setДатаИнфПр(String value) {
            this.датаИнфПр = value;
        }

        /**
         * Gets the value of the времИнфПр property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getВремИнфПр() {
            return времИнфПр;
        }

        /**
         * Sets the value of the времИнфПр property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setВремИнфПр(String value) {
            this.времИнфПр = value;
        }

        /**
         * Gets the value of the наимЭконСубСост property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимЭконСубСост() {
            return наимЭконСубСост;
        }

        /**
         * Sets the value of the наимЭконСубСост property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимЭконСубСост(String value) {
            this.наимЭконСубСост = value;
        }

        /**
         * Gets the value of the оснДоверОргСост property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getОснДоверОргСост() {
            return оснДоверОргСост;
        }

        /**
         * Sets the value of the оснДоверОргСост property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setОснДоверОргСост(String value) {
            this.оснДоверОргСост = value;
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
         *         &lt;element name="ФЛ">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ФИО" type="{}ФИОТип"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ГосРегИПВыдДов">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="100"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
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
         *         &lt;element name="ИП" type="{}СвИПТип"/>
         *         &lt;element name="ЮЛ">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ФИО" type="{}ФИОТип"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ГосРегИПВыдДов">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="100"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
         *                 &lt;attribute name="НаимОрг">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="1000"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Должн" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="128"/>
         *                       &lt;minLength value="0"/>
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
         *       &lt;attribute name="ОблПолн" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *             &lt;enumeration value="0"/>
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *             &lt;enumeration value="3"/>
         *             &lt;enumeration value="4"/>
         *             &lt;enumeration value="5"/>
         *             &lt;enumeration value="6"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Статус" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *             &lt;enumeration value="3"/>
         *             &lt;enumeration value="4"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ОснПолн" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="255"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ОснПолнОрг">
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
        @XmlType(name = "", propOrder = {
            "\u0444\u043b",
            "\u0438\u043f",
            "\u044e\u043b"
        })
        public static class Подписант {

            @XmlElement(name = "\u0424\u041b")
            protected Файл.Документ.Подписант.ФЛ фл;
            @XmlElement(name = "\u0418\u041f")
            protected СвИПТип ип;
            @XmlElement(name = "\u042e\u041b")
            protected Файл.Документ.Подписант.ЮЛ юл;
            @XmlAttribute(name = "\u041e\u0431\u043b\u041f\u043e\u043b\u043d", required = true)
            protected String облПолн;
            @XmlAttribute(name = "\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
            protected String статус;
            @XmlAttribute(name = "\u041e\u0441\u043d\u041f\u043e\u043b\u043d", required = true)
            protected String оснПолн;
            @XmlAttribute(name = "\u041e\u0441\u043d\u041f\u043e\u043b\u043d\u041e\u0440\u0433")
            protected String оснПолнОрг;

            /**
             * Gets the value of the фл property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.Подписант.ФЛ }
             *     
             */
            public Файл.Документ.Подписант.ФЛ getФЛ() {
                return фл;
            }

            /**
             * Sets the value of the фл property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.Подписант.ФЛ }
             *     
             */
            public void setФЛ(Файл.Документ.Подписант.ФЛ value) {
                this.фл = value;
            }

            /**
             * Gets the value of the ип property.
             * 
             * @return
             *     possible object is
             *     {@link СвИПТип }
             *     
             */
            public СвИПТип getИП() {
                return ип;
            }

            /**
             * Sets the value of the ип property.
             * 
             * @param value
             *     allowed object is
             *     {@link СвИПТип }
             *     
             */
            public void setИП(СвИПТип value) {
                this.ип = value;
            }

            /**
             * Gets the value of the юл property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.Подписант.ЮЛ }
             *     
             */
            public Файл.Документ.Подписант.ЮЛ getЮЛ() {
                return юл;
            }

            /**
             * Sets the value of the юл property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.Подписант.ЮЛ }
             *     
             */
            public void setЮЛ(Файл.Документ.Подписант.ЮЛ value) {
                this.юл = value;
            }

            /**
             * Gets the value of the облПолн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОблПолн() {
                return облПолн;
            }

            /**
             * Sets the value of the облПолн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОблПолн(String value) {
                this.облПолн = value;
            }

            /**
             * Gets the value of the статус property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСтатус() {
                return статус;
            }

            /**
             * Sets the value of the статус property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСтатус(String value) {
                this.статус = value;
            }

            /**
             * Gets the value of the оснПолн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОснПолн() {
                return оснПолн;
            }

            /**
             * Sets the value of the оснПолн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОснПолн(String value) {
                this.оснПолн = value;
            }

            /**
             * Gets the value of the оснПолнОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОснПолнОрг() {
                return оснПолнОрг;
            }

            /**
             * Sets the value of the оснПолнОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОснПолнОрг(String value) {
                this.оснПолнОрг = value;
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
             *         &lt;element name="ФИО" type="{}ФИОТип"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ГосРегИПВыдДов">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="100"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
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
            @XmlType(name = "", propOrder = {
                "\u0444\u0438\u043e"
            })
            public static class ФЛ {

                @XmlElement(name = "\u0424\u0418\u041e", required = true)
                protected ФИОТип фио;
                @XmlAttribute(name = "\u0413\u043e\u0441\u0420\u0435\u0433\u0418\u041f\u0412\u044b\u0434\u0414\u043e\u0432")
                protected String госРегИПВыдДов;
                @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
                protected String иннфл;
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
                 * Gets the value of the госРегИПВыдДов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getГосРегИПВыдДов() {
                    return госРегИПВыдДов;
                }

                /**
                 * Sets the value of the госРегИПВыдДов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setГосРегИПВыдДов(String value) {
                    this.госРегИПВыдДов = value;
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
             *       &lt;sequence>
             *         &lt;element name="ФИО" type="{}ФИОТип"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ГосРегИПВыдДов">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="100"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
             *       &lt;attribute name="НаимОрг">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="1000"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Должн" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="128"/>
             *             &lt;minLength value="0"/>
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
            @XmlType(name = "", propOrder = {
                "\u0444\u0438\u043e"
            })
            public static class ЮЛ {

                @XmlElement(name = "\u0424\u0418\u041e", required = true)
                protected ФИОТип фио;
                @XmlAttribute(name = "\u0413\u043e\u0441\u0420\u0435\u0433\u0418\u041f\u0412\u044b\u0434\u0414\u043e\u0432")
                protected String госРегИПВыдДов;
                @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
                protected String иннюл;
                @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433")
                protected String наимОрг;
                @XmlAttribute(name = "\u0414\u043e\u043b\u0436\u043d", required = true)
                protected String должн;
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
                 * Gets the value of the госРегИПВыдДов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getГосРегИПВыдДов() {
                    return госРегИПВыдДов;
                }

                /**
                 * Sets the value of the госРегИПВыдДов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setГосРегИПВыдДов(String value) {
                    this.госРегИПВыдДов = value;
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
                 * Gets the value of the должн property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getДолжн() {
                    return должн;
                }

                /**
                 * Sets the value of the должн property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setДолжн(String value) {
                    this.должн = value;
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
         *         &lt;element name="СвПер">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ОснПер" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НаимОсн" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НомОсн">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаОсн" type="{}ДатаТип" />
         *                           &lt;attribute name="ДопСвОсн">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="0"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвЛицПер" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="РабОргПрод">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ФИО" type="{}ФИОТип"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Должность" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="128"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="ИныеСвед">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="255"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="ОснПолн">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="120"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ИнЛицо">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="ПредОргПер">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ФИО" type="{}ФИОТип"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Должность" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="128"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="ИныеСвед">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="255"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="НаимОргПер" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="128"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="ОснДоверОргПер">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="120"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="ОснПолнПредПер">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="120"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="ФЛПер">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ФИО" type="{}ФИОТип"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="ИныеСвед">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="255"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="ОснДоверФЛ">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="120"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ТранГруз" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ТранНакл" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="НомТранНакл" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="255"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Перевозчик" type="{}УчастникТип" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="СвТранГруз">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвПерВещи" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ДатаПерВещ" type="{}ДатаТип" />
         *                           &lt;attribute name="СвПерВещ">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="СодОпер" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="255"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ВидОпер">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="255"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ДатаПер" type="{}ДатаТип" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ИнфПолФХЖ3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ИдФайлИнфПол">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="36"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0441\u0432\u041f\u0435\u0440",
            "\u0438\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04163"
        })
        public static class СвПродПер {

            @XmlElement(name = "\u0421\u0432\u041f\u0435\u0440", required = true)
            protected Файл.Документ.СвПродПер.СвПер свПер;
            @XmlElement(name = "\u0418\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04163")
            protected Файл.Документ.СвПродПер.ИнфПолФХЖ3 инфПолФХЖ3;

            /**
             * Gets the value of the свПер property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвПродПер.СвПер }
             *     
             */
            public Файл.Документ.СвПродПер.СвПер getСвПер() {
                return свПер;
            }

            /**
             * Sets the value of the свПер property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвПродПер.СвПер }
             *     
             */
            public void setСвПер(Файл.Документ.СвПродПер.СвПер value) {
                this.свПер = value;
            }

            /**
             * Gets the value of the инфПолФХЖ3 property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвПродПер.ИнфПолФХЖ3 }
             *     
             */
            public Файл.Документ.СвПродПер.ИнфПолФХЖ3 getИнфПолФХЖ3() {
                return инфПолФХЖ3;
            }

            /**
             * Sets the value of the инфПолФХЖ3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвПродПер.ИнфПолФХЖ3 }
             *     
             */
            public void setИнфПолФХЖ3(Файл.Документ.СвПродПер.ИнфПолФХЖ3 value) {
                this.инфПолФХЖ3 = value;
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
             *         &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ИдФайлИнфПол">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="36"/>
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
                "\u0442\u0435\u043a\u0441\u0442\u0418\u043d\u0444"
            })
            public static class ИнфПолФХЖ3 {

                @XmlElement(name = "\u0422\u0435\u043a\u0441\u0442\u0418\u043d\u0444")
                protected List<ТекстИнфТип> текстИнф;
                @XmlAttribute(name = "\u0418\u0434\u0424\u0430\u0439\u043b\u0418\u043d\u0444\u041f\u043e\u043b")
                protected String идФайлИнфПол;

                /**
                 * Gets the value of the текстИнф property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the текстИнф property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getТекстИнф().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ТекстИнфТип }
                 * 
                 * 
                 */
                public List<ТекстИнфТип> getТекстИнф() {
                    if (текстИнф == null) {
                        текстИнф = new ArrayList<ТекстИнфТип>();
                    }
                    return this.текстИнф;
                }

                /**
                 * Gets the value of the идФайлИнфПол property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getИдФайлИнфПол() {
                    return идФайлИнфПол;
                }

                /**
                 * Sets the value of the идФайлИнфПол property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setИдФайлИнфПол(String value) {
                    this.идФайлИнфПол = value;
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
             *       &lt;sequence>
             *         &lt;element name="ОснПер" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НаимОсн" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НомОсн">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаОсн" type="{}ДатаТип" />
             *                 &lt;attribute name="ДопСвОсн">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="0"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвЛицПер" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="РабОргПрод">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ФИО" type="{}ФИОТип"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Должность" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="128"/>
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
             *                           &lt;attribute name="ОснПолн">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="120"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ИнЛицо">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="ПредОргПер">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ФИО" type="{}ФИОТип"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Должность" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="128"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="ИныеСвед">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="255"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="НаимОргПер" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="128"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="ОснДоверОргПер">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="120"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="ОснПолнПредПер">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="120"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="ФЛПер">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ФИО" type="{}ФИОТип"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="ИныеСвед">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="255"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="ОснДоверФЛ">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="120"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ТранГруз" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ТранНакл" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="НомТранНакл" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="255"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Перевозчик" type="{}УчастникТип" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="СвТранГруз">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвПерВещи" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ДатаПерВещ" type="{}ДатаТип" />
             *                 &lt;attribute name="СвПерВещ">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="СодОпер" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="255"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ВидОпер">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="255"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ДатаПер" type="{}ДатаТип" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "\u043e\u0441\u043d\u041f\u0435\u0440",
                "\u0441\u0432\u041b\u0438\u0446\u041f\u0435\u0440",
                "\u0442\u0440\u0430\u043d\u0413\u0440\u0443\u0437",
                "\u0441\u0432\u041f\u0435\u0440\u0412\u0435\u0449\u0438"
            })
            public static class СвПер {

                @XmlElement(name = "\u041e\u0441\u043d\u041f\u0435\u0440", required = true)
                protected List<Файл.Документ.СвПродПер.СвПер.ОснПер> оснПер;
                @XmlElement(name = "\u0421\u0432\u041b\u0438\u0446\u041f\u0435\u0440")
                protected Файл.Документ.СвПродПер.СвПер.СвЛицПер свЛицПер;
                @XmlElement(name = "\u0422\u0440\u0430\u043d\u0413\u0440\u0443\u0437")
                protected Файл.Документ.СвПродПер.СвПер.ТранГруз транГруз;
                @XmlElement(name = "\u0421\u0432\u041f\u0435\u0440\u0412\u0435\u0449\u0438")
                protected Файл.Документ.СвПродПер.СвПер.СвПерВещи свПерВещи;
                @XmlAttribute(name = "\u0421\u043e\u0434\u041e\u043f\u0435\u0440", required = true)
                protected String содОпер;
                @XmlAttribute(name = "\u0412\u0438\u0434\u041e\u043f\u0435\u0440")
                protected String видОпер;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0435\u0440")
                protected String датаПер;

                /**
                 * Gets the value of the оснПер property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the оснПер property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getОснПер().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Файл.Документ.СвПродПер.СвПер.ОснПер }
                 * 
                 * 
                 */
                public List<Файл.Документ.СвПродПер.СвПер.ОснПер> getОснПер() {
                    if (оснПер == null) {
                        оснПер = new ArrayList<Файл.Документ.СвПродПер.СвПер.ОснПер>();
                    }
                    return this.оснПер;
                }

                /**
                 * Gets the value of the свЛицПер property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер }
                 *     
                 */
                public Файл.Документ.СвПродПер.СвПер.СвЛицПер getСвЛицПер() {
                    return свЛицПер;
                }

                /**
                 * Sets the value of the свЛицПер property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер }
                 *     
                 */
                public void setСвЛицПер(Файл.Документ.СвПродПер.СвПер.СвЛицПер value) {
                    this.свЛицПер = value;
                }

                /**
                 * Gets the value of the транГруз property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.ТранГруз }
                 *     
                 */
                public Файл.Документ.СвПродПер.СвПер.ТранГруз getТранГруз() {
                    return транГруз;
                }

                /**
                 * Sets the value of the транГруз property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.ТранГруз }
                 *     
                 */
                public void setТранГруз(Файл.Документ.СвПродПер.СвПер.ТранГруз value) {
                    this.транГруз = value;
                }

                /**
                 * Gets the value of the свПерВещи property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.СвПерВещи }
                 *     
                 */
                public Файл.Документ.СвПродПер.СвПер.СвПерВещи getСвПерВещи() {
                    return свПерВещи;
                }

                /**
                 * Sets the value of the свПерВещи property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Файл.Документ.СвПродПер.СвПер.СвПерВещи }
                 *     
                 */
                public void setСвПерВещи(Файл.Документ.СвПродПер.СвПер.СвПерВещи value) {
                    this.свПерВещи = value;
                }

                /**
                 * Gets the value of the содОпер property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getСодОпер() {
                    return содОпер;
                }

                /**
                 * Sets the value of the содОпер property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setСодОпер(String value) {
                    this.содОпер = value;
                }

                /**
                 * Gets the value of the видОпер property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getВидОпер() {
                    return видОпер;
                }

                /**
                 * Sets the value of the видОпер property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setВидОпер(String value) {
                    this.видОпер = value;
                }

                /**
                 * Gets the value of the датаПер property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getДатаПер() {
                    return датаПер;
                }

                /**
                 * Sets the value of the датаПер property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setДатаПер(String value) {
                    this.датаПер = value;
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
                 *       &lt;attribute name="НаимОсн" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НомОсн">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="ДатаОсн" type="{}ДатаТип" />
                 *       &lt;attribute name="ДопСвОсн">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="0"/>
                 *             &lt;maxLength value="1000"/>
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
                public static class ОснПер {

                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0441\u043d", required = true)
                    protected String наимОсн;
                    @XmlAttribute(name = "\u041d\u043e\u043c\u041e\u0441\u043d")
                    protected String номОсн;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0441\u043d")
                    protected String датаОсн;
                    @XmlAttribute(name = "\u0414\u043e\u043f\u0421\u0432\u041e\u0441\u043d")
                    protected String допСвОсн;

                    /**
                     * Gets the value of the наимОсн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимОсн() {
                        return наимОсн;
                    }

                    /**
                     * Sets the value of the наимОсн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимОсн(String value) {
                        this.наимОсн = value;
                    }

                    /**
                     * Gets the value of the номОсн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНомОсн() {
                        return номОсн;
                    }

                    /**
                     * Sets the value of the номОсн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНомОсн(String value) {
                        this.номОсн = value;
                    }

                    /**
                     * Gets the value of the датаОсн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаОсн() {
                        return датаОсн;
                    }

                    /**
                     * Sets the value of the датаОсн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаОсн(String value) {
                        this.датаОсн = value;
                    }

                    /**
                     * Gets the value of the допСвОсн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДопСвОсн() {
                        return допСвОсн;
                    }

                    /**
                     * Sets the value of the допСвОсн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДопСвОсн(String value) {
                        this.допСвОсн = value;
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
                 *         &lt;element name="РабОргПрод">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ФИО" type="{}ФИОТип"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Должность" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="128"/>
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
                 *                 &lt;attribute name="ОснПолн">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="120"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ИнЛицо">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="ПредОргПер">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ФИО" type="{}ФИОТип"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Должность" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="128"/>
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
                 *                           &lt;attribute name="НаимОргПер" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="128"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="ОснДоверОргПер">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="120"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="ОснПолнПредПер">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="120"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="ФЛПер">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ФИО" type="{}ФИОТип"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="ИныеСвед">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="255"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="ОснДоверФЛ">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="120"/>
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
                    "\u0440\u0430\u0431\u041e\u0440\u0433\u041f\u0440\u043e\u0434",
                    "\u0438\u043d\u041b\u0438\u0446\u043e"
                })
                public static class СвЛицПер {

                    @XmlElement(name = "\u0420\u0430\u0431\u041e\u0440\u0433\u041f\u0440\u043e\u0434")
                    protected Файл.Документ.СвПродПер.СвПер.СвЛицПер.РабОргПрод рабОргПрод;
                    @XmlElement(name = "\u0418\u043d\u041b\u0438\u0446\u043e")
                    protected Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо инЛицо;

                    /**
                     * Gets the value of the рабОргПрод property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.РабОргПрод }
                     *     
                     */
                    public Файл.Документ.СвПродПер.СвПер.СвЛицПер.РабОргПрод getРабОргПрод() {
                        return рабОргПрод;
                    }

                    /**
                     * Sets the value of the рабОргПрод property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.РабОргПрод }
                     *     
                     */
                    public void setРабОргПрод(Файл.Документ.СвПродПер.СвПер.СвЛицПер.РабОргПрод value) {
                        this.рабОргПрод = value;
                    }

                    /**
                     * Gets the value of the инЛицо property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо }
                     *     
                     */
                    public Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо getИнЛицо() {
                        return инЛицо;
                    }

                    /**
                     * Sets the value of the инЛицо property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо }
                     *     
                     */
                    public void setИнЛицо(Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо value) {
                        this.инЛицо = value;
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
                     *         &lt;element name="ПредОргПер">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ФИО" type="{}ФИОТип"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Должность" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="128"/>
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
                     *                 &lt;attribute name="НаимОргПер" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="128"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="ОснДоверОргПер">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="120"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="ОснПолнПредПер">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="120"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="ФЛПер">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ФИО" type="{}ФИОТип"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="ИныеСвед">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="255"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="ОснДоверФЛ">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="120"/>
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
                        "\u043f\u0440\u0435\u0434\u041e\u0440\u0433\u041f\u0435\u0440",
                        "\u0444\u043b\u041f\u0435\u0440"
                    })
                    public static class ИнЛицо {

                        @XmlElement(name = "\u041f\u0440\u0435\u0434\u041e\u0440\u0433\u041f\u0435\u0440")
                        protected Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ПредОргПер предОргПер;
                        @XmlElement(name = "\u0424\u041b\u041f\u0435\u0440")
                        protected Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ФЛПер флПер;

                        /**
                         * Gets the value of the предОргПер property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ПредОргПер }
                         *     
                         */
                        public Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ПредОргПер getПредОргПер() {
                            return предОргПер;
                        }

                        /**
                         * Sets the value of the предОргПер property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ПредОргПер }
                         *     
                         */
                        public void setПредОргПер(Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ПредОргПер value) {
                            this.предОргПер = value;
                        }

                        /**
                         * Gets the value of the флПер property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ФЛПер }
                         *     
                         */
                        public Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ФЛПер getФЛПер() {
                            return флПер;
                        }

                        /**
                         * Sets the value of the флПер property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ФЛПер }
                         *     
                         */
                        public void setФЛПер(Файл.Документ.СвПродПер.СвПер.СвЛицПер.ИнЛицо.ФЛПер value) {
                            this.флПер = value;
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
                         *         &lt;element name="ФИО" type="{}ФИОТип"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Должность" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="128"/>
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
                         *       &lt;attribute name="НаимОргПер" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="128"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="ОснДоверОргПер">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="120"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="ОснПолнПредПер">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="120"/>
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
                            "\u0444\u0438\u043e"
                        })
                        public static class ПредОргПер {

                            @XmlElement(name = "\u0424\u0418\u041e", required = true)
                            protected ФИОТип фио;
                            @XmlAttribute(name = "\u0414\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c", required = true)
                            protected String должность;
                            @XmlAttribute(name = "\u0418\u043d\u044b\u0435\u0421\u0432\u0435\u0434")
                            protected String иныеСвед;
                            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433\u041f\u0435\u0440", required = true)
                            protected String наимОргПер;
                            @XmlAttribute(name = "\u041e\u0441\u043d\u0414\u043e\u0432\u0435\u0440\u041e\u0440\u0433\u041f\u0435\u0440")
                            protected String оснДоверОргПер;
                            @XmlAttribute(name = "\u041e\u0441\u043d\u041f\u043e\u043b\u043d\u041f\u0440\u0435\u0434\u041f\u0435\u0440")
                            protected String оснПолнПредПер;

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
                             * Gets the value of the должность property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getДолжность() {
                                return должность;
                            }

                            /**
                             * Sets the value of the должность property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setДолжность(String value) {
                                this.должность = value;
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

                            /**
                             * Gets the value of the наимОргПер property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getНаимОргПер() {
                                return наимОргПер;
                            }

                            /**
                             * Sets the value of the наимОргПер property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setНаимОргПер(String value) {
                                this.наимОргПер = value;
                            }

                            /**
                             * Gets the value of the оснДоверОргПер property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getОснДоверОргПер() {
                                return оснДоверОргПер;
                            }

                            /**
                             * Sets the value of the оснДоверОргПер property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setОснДоверОргПер(String value) {
                                this.оснДоверОргПер = value;
                            }

                            /**
                             * Gets the value of the оснПолнПредПер property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getОснПолнПредПер() {
                                return оснПолнПредПер;
                            }

                            /**
                             * Sets the value of the оснПолнПредПер property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setОснПолнПредПер(String value) {
                                this.оснПолнПредПер = value;
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
                         *       &lt;sequence>
                         *         &lt;element name="ФИО" type="{}ФИОТип"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="ИныеСвед">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="255"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="ОснДоверФЛ">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="120"/>
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
                            "\u0444\u0438\u043e"
                        })
                        public static class ФЛПер {

                            @XmlElement(name = "\u0424\u0418\u041e", required = true)
                            protected ФИОТип фио;
                            @XmlAttribute(name = "\u0418\u043d\u044b\u0435\u0421\u0432\u0435\u0434")
                            protected String иныеСвед;
                            @XmlAttribute(name = "\u041e\u0441\u043d\u0414\u043e\u0432\u0435\u0440\u0424\u041b")
                            protected String оснДоверФЛ;

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

                            /**
                             * Gets the value of the оснДоверФЛ property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getОснДоверФЛ() {
                                return оснДоверФЛ;
                            }

                            /**
                             * Sets the value of the оснДоверФЛ property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setОснДоверФЛ(String value) {
                                this.оснДоверФЛ = value;
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
                     *       &lt;sequence>
                     *         &lt;element name="ФИО" type="{}ФИОТип"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Должность" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="128"/>
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
                     *       &lt;attribute name="ОснПолн">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="120"/>
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
                        "\u0444\u0438\u043e"
                    })
                    public static class РабОргПрод {

                        @XmlElement(name = "\u0424\u0418\u041e", required = true)
                        protected ФИОТип фио;
                        @XmlAttribute(name = "\u0414\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c", required = true)
                        protected String должность;
                        @XmlAttribute(name = "\u0418\u043d\u044b\u0435\u0421\u0432\u0435\u0434")
                        protected String иныеСвед;
                        @XmlAttribute(name = "\u041e\u0441\u043d\u041f\u043e\u043b\u043d")
                        protected String оснПолн;

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
                         * Gets the value of the должность property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getДолжность() {
                            return должность;
                        }

                        /**
                         * Sets the value of the должность property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setДолжность(String value) {
                            this.должность = value;
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

                        /**
                         * Gets the value of the оснПолн property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getОснПолн() {
                            return оснПолн;
                        }

                        /**
                         * Sets the value of the оснПолн property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setОснПолн(String value) {
                            this.оснПолн = value;
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
                 *       &lt;attribute name="ДатаПерВещ" type="{}ДатаТип" />
                 *       &lt;attribute name="СвПерВещ">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="1000"/>
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
                public static class СвПерВещи {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0412\u0435\u0449")
                    protected String датаПерВещ;
                    @XmlAttribute(name = "\u0421\u0432\u041f\u0435\u0440\u0412\u0435\u0449")
                    protected String свПерВещ;

                    /**
                     * Gets the value of the датаПерВещ property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаПерВещ() {
                        return датаПерВещ;
                    }

                    /**
                     * Sets the value of the датаПерВещ property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаПерВещ(String value) {
                        this.датаПерВещ = value;
                    }

                    /**
                     * Gets the value of the свПерВещ property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСвПерВещ() {
                        return свПерВещ;
                    }

                    /**
                     * Sets the value of the свПерВещ property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСвПерВещ(String value) {
                        this.свПерВещ = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="ТранНакл" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="НомТранНакл" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="255"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Перевозчик" type="{}УчастникТип" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="СвТранГруз">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="1000"/>
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
                    "\u0442\u0440\u0430\u043d\u041d\u0430\u043a\u043b",
                    "\u043f\u0435\u0440\u0435\u0432\u043e\u0437\u0447\u0438\u043a"
                })
                public static class ТранГруз {

                    @XmlElement(name = "\u0422\u0440\u0430\u043d\u041d\u0430\u043a\u043b")
                    protected List<Файл.Документ.СвПродПер.СвПер.ТранГруз.ТранНакл> транНакл;
                    @XmlElement(name = "\u041f\u0435\u0440\u0435\u0432\u043e\u0437\u0447\u0438\u043a")
                    protected УчастникТип перевозчик;
                    @XmlAttribute(name = "\u0421\u0432\u0422\u0440\u0430\u043d\u0413\u0440\u0443\u0437")
                    protected String свТранГруз;

                    /**
                     * Gets the value of the транНакл property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the транНакл property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getТранНакл().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Файл.Документ.СвПродПер.СвПер.ТранГруз.ТранНакл }
                     * 
                     * 
                     */
                    public List<Файл.Документ.СвПродПер.СвПер.ТранГруз.ТранНакл> getТранНакл() {
                        if (транНакл == null) {
                            транНакл = new ArrayList<Файл.Документ.СвПродПер.СвПер.ТранГруз.ТранНакл>();
                        }
                        return this.транНакл;
                    }

                    /**
                     * Gets the value of the перевозчик property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link УчастникТип }
                     *     
                     */
                    public УчастникТип getПеревозчик() {
                        return перевозчик;
                    }

                    /**
                     * Sets the value of the перевозчик property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link УчастникТип }
                     *     
                     */
                    public void setПеревозчик(УчастникТип value) {
                        this.перевозчик = value;
                    }

                    /**
                     * Gets the value of the свТранГруз property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСвТранГруз() {
                        return свТранГруз;
                    }

                    /**
                     * Sets the value of the свТранГруз property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСвТранГруз(String value) {
                        this.свТранГруз = value;
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
                     *       &lt;attribute name="НомТранНакл" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="255"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="ДатаТранНакл" use="required" type="{}ДатаТип" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ТранНакл {

                        @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0440\u0430\u043d\u041d\u0430\u043a\u043b", required = true)
                        protected String номТранНакл;
                        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0422\u0440\u0430\u043d\u041d\u0430\u043a\u043b", required = true)
                        protected String датаТранНакл;

                        /**
                         * Gets the value of the номТранНакл property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getНомТранНакл() {
                            return номТранНакл;
                        }

                        /**
                         * Sets the value of the номТранНакл property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setНомТранНакл(String value) {
                            this.номТранНакл = value;
                        }

                        /**
                         * Gets the value of the датаТранНакл property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getДатаТранНакл() {
                            return датаТранНакл;
                        }

                        /**
                         * Sets the value of the датаТранНакл property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setДатаТранНакл(String value) {
                            this.датаТранНакл = value;
                        }

                    }

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
         *       &lt;sequence>
         *         &lt;element name="ИспрСчФ" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="НомИспрСчФ" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;totalDigits value="3"/>
         *                       &lt;minInclusive value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ДатаИспрСчФ" use="required" type="{}ДатаТип" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СвПрод" type="{}УчастникТип"/>
         *         &lt;element name="ГрузОт" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="ГрузОтпр" type="{}УчастникТип"/>
         *                   &lt;element name="ОнЖе">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="5"/>
         *                         &lt;enumeration value="он же"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ГрузПолуч" type="{}УчастникТип" minOccurs="0"/>
         *         &lt;element name="СвПРД" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="НомерПРД" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="30"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ДатаПРД" use="required" type="{}ДатаТип" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СвПокуп" type="{}УчастникТип"/>
         *         &lt;element name="ДопСвФХЖ1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ИдГосКон">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="255"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="НаимОКВ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="100"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="КурсВал">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="10"/>
         *                       &lt;fractionDigits value="4"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ИнфПолФХЖ1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ИдФайлИнфПол">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="36"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="НомерСчФ" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ДатаСчФ" use="required" type="{}ДатаТип" />
         *       &lt;attribute name="КодОКВ" use="required" type="{}ОКВТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0438\u0441\u043f\u0440\u0421\u0447\u0424",
            "\u0441\u0432\u041f\u0440\u043e\u0434",
            "\u0433\u0440\u0443\u0437\u041e\u0442",
            "\u0433\u0440\u0443\u0437\u041f\u043e\u043b\u0443\u0447",
            "\u0441\u0432\u041f\u0420\u0414",
            "\u0441\u0432\u041f\u043e\u043a\u0443\u043f",
            "\u0434\u043e\u043f\u0421\u0432\u0424\u0425\u04161",
            "\u0438\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04161"
        })
        public static class СвСчФакт {

            @XmlElement(name = "\u0418\u0441\u043f\u0440\u0421\u0447\u0424")
            protected Файл.Документ.СвСчФакт.ИспрСчФ испрСчФ;
            @XmlElement(name = "\u0421\u0432\u041f\u0440\u043e\u0434", required = true)
            protected УчастникТип свПрод;
            @XmlElement(name = "\u0413\u0440\u0443\u0437\u041e\u0442")
            protected Файл.Документ.СвСчФакт.ГрузОт грузОт;
            @XmlElement(name = "\u0413\u0440\u0443\u0437\u041f\u043e\u043b\u0443\u0447")
            protected УчастникТип грузПолуч;
            @XmlElement(name = "\u0421\u0432\u041f\u0420\u0414")
            protected List<Файл.Документ.СвСчФакт.СвПРД> свПРД;
            @XmlElement(name = "\u0421\u0432\u041f\u043e\u043a\u0443\u043f", required = true)
            protected УчастникТип свПокуп;
            @XmlElement(name = "\u0414\u043e\u043f\u0421\u0432\u0424\u0425\u04161")
            protected Файл.Документ.СвСчФакт.ДопСвФХЖ1 допСвФХЖ1;
            @XmlElement(name = "\u0418\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04161")
            protected Файл.Документ.СвСчФакт.ИнфПолФХЖ1 инфПолФХЖ1;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0447\u0424", required = true)
            protected String номерСчФ;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0421\u0447\u0424", required = true)
            protected String датаСчФ;
            @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041a\u0412", required = true)
            protected String кодОКВ;

            /**
             * Gets the value of the испрСчФ property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвСчФакт.ИспрСчФ }
             *     
             */
            public Файл.Документ.СвСчФакт.ИспрСчФ getИспрСчФ() {
                return испрСчФ;
            }

            /**
             * Sets the value of the испрСчФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвСчФакт.ИспрСчФ }
             *     
             */
            public void setИспрСчФ(Файл.Документ.СвСчФакт.ИспрСчФ value) {
                this.испрСчФ = value;
            }

            /**
             * Gets the value of the свПрод property.
             * 
             * @return
             *     possible object is
             *     {@link УчастникТип }
             *     
             */
            public УчастникТип getСвПрод() {
                return свПрод;
            }

            /**
             * Sets the value of the свПрод property.
             * 
             * @param value
             *     allowed object is
             *     {@link УчастникТип }
             *     
             */
            public void setСвПрод(УчастникТип value) {
                this.свПрод = value;
            }

            /**
             * Gets the value of the грузОт property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвСчФакт.ГрузОт }
             *     
             */
            public Файл.Документ.СвСчФакт.ГрузОт getГрузОт() {
                return грузОт;
            }

            /**
             * Sets the value of the грузОт property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвСчФакт.ГрузОт }
             *     
             */
            public void setГрузОт(Файл.Документ.СвСчФакт.ГрузОт value) {
                this.грузОт = value;
            }

            /**
             * Gets the value of the грузПолуч property.
             * 
             * @return
             *     possible object is
             *     {@link УчастникТип }
             *     
             */
            public УчастникТип getГрузПолуч() {
                return грузПолуч;
            }

            /**
             * Sets the value of the грузПолуч property.
             * 
             * @param value
             *     allowed object is
             *     {@link УчастникТип }
             *     
             */
            public void setГрузПолуч(УчастникТип value) {
                this.грузПолуч = value;
            }

            /**
             * Gets the value of the свПРД property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свПРД property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвПРД().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Файл.Документ.СвСчФакт.СвПРД }
             * 
             * 
             */
            public List<Файл.Документ.СвСчФакт.СвПРД> getСвПРД() {
                if (свПРД == null) {
                    свПРД = new ArrayList<Файл.Документ.СвСчФакт.СвПРД>();
                }
                return this.свПРД;
            }

            /**
             * Gets the value of the свПокуп property.
             * 
             * @return
             *     possible object is
             *     {@link УчастникТип }
             *     
             */
            public УчастникТип getСвПокуп() {
                return свПокуп;
            }

            /**
             * Sets the value of the свПокуп property.
             * 
             * @param value
             *     allowed object is
             *     {@link УчастникТип }
             *     
             */
            public void setСвПокуп(УчастникТип value) {
                this.свПокуп = value;
            }

            /**
             * Gets the value of the допСвФХЖ1 property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвСчФакт.ДопСвФХЖ1 }
             *     
             */
            public Файл.Документ.СвСчФакт.ДопСвФХЖ1 getДопСвФХЖ1() {
                return допСвФХЖ1;
            }

            /**
             * Sets the value of the допСвФХЖ1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвСчФакт.ДопСвФХЖ1 }
             *     
             */
            public void setДопСвФХЖ1(Файл.Документ.СвСчФакт.ДопСвФХЖ1 value) {
                this.допСвФХЖ1 = value;
            }

            /**
             * Gets the value of the инфПолФХЖ1 property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.СвСчФакт.ИнфПолФХЖ1 }
             *     
             */
            public Файл.Документ.СвСчФакт.ИнфПолФХЖ1 getИнфПолФХЖ1() {
                return инфПолФХЖ1;
            }

            /**
             * Sets the value of the инфПолФХЖ1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.СвСчФакт.ИнфПолФХЖ1 }
             *     
             */
            public void setИнфПолФХЖ1(Файл.Документ.СвСчФакт.ИнфПолФХЖ1 value) {
                this.инфПолФХЖ1 = value;
            }

            /**
             * Gets the value of the номерСчФ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомерСчФ() {
                return номерСчФ;
            }

            /**
             * Sets the value of the номерСчФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомерСчФ(String value) {
                this.номерСчФ = value;
            }

            /**
             * Gets the value of the датаСчФ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаСчФ() {
                return датаСчФ;
            }

            /**
             * Sets the value of the датаСчФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаСчФ(String value) {
                this.датаСчФ = value;
            }

            /**
             * Gets the value of the кодОКВ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодОКВ() {
                return кодОКВ;
            }

            /**
             * Sets the value of the кодОКВ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодОКВ(String value) {
                this.кодОКВ = value;
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
             *         &lt;element name="ГрузОтпр" type="{}УчастникТип"/>
             *         &lt;element name="ОнЖе">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="5"/>
             *               &lt;enumeration value="он же"/>
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
            @XmlType(name = "", propOrder = {
                "\u0433\u0440\u0443\u0437\u041e\u0442\u043f\u0440",
                "\u043e\u043d\u0416\u0435"
            })
            public static class ГрузОт {

                @XmlElement(name = "\u0413\u0440\u0443\u0437\u041e\u0442\u043f\u0440")
                protected УчастникТип грузОтпр;
                @XmlElement(name = "\u041e\u043d\u0416\u0435")
                protected String онЖе;

                /**
                 * Gets the value of the грузОтпр property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link УчастникТип }
                 *     
                 */
                public УчастникТип getГрузОтпр() {
                    return грузОтпр;
                }

                /**
                 * Sets the value of the грузОтпр property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link УчастникТип }
                 *     
                 */
                public void setГрузОтпр(УчастникТип value) {
                    this.грузОтпр = value;
                }

                /**
                 * Gets the value of the онЖе property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getОнЖе() {
                    return онЖе;
                }

                /**
                 * Sets the value of the онЖе property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setОнЖе(String value) {
                    this.онЖе = value;
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
             *       &lt;attribute name="ИдГосКон">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="255"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="НаимОКВ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="100"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="КурсВал">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="10"/>
             *             &lt;fractionDigits value="4"/>
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
            public static class ДопСвФХЖ1 {

                @XmlAttribute(name = "\u0418\u0434\u0413\u043e\u0441\u041a\u043e\u043d")
                protected String идГосКон;
                @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u041a\u0412")
                protected String наимОКВ;
                @XmlAttribute(name = "\u041a\u0443\u0440\u0441\u0412\u0430\u043b")
                protected BigDecimal курсВал;

                /**
                 * Gets the value of the идГосКон property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getИдГосКон() {
                    return идГосКон;
                }

                /**
                 * Sets the value of the идГосКон property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setИдГосКон(String value) {
                    this.идГосКон = value;
                }

                /**
                 * Gets the value of the наимОКВ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getНаимОКВ() {
                    return наимОКВ;
                }

                /**
                 * Sets the value of the наимОКВ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setНаимОКВ(String value) {
                    this.наимОКВ = value;
                }

                /**
                 * Gets the value of the курсВал property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getКурсВал() {
                    return курсВал;
                }

                /**
                 * Sets the value of the курсВал property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setКурсВал(BigDecimal value) {
                    this.курсВал = value;
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
             *       &lt;sequence>
             *         &lt;element name="ТекстИнф" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ИдФайлИнфПол">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="36"/>
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
                "\u0442\u0435\u043a\u0441\u0442\u0418\u043d\u0444"
            })
            public static class ИнфПолФХЖ1 {

                @XmlElement(name = "\u0422\u0435\u043a\u0441\u0442\u0418\u043d\u0444")
                protected List<ТекстИнфТип> текстИнф;
                @XmlAttribute(name = "\u0418\u0434\u0424\u0430\u0439\u043b\u0418\u043d\u0444\u041f\u043e\u043b")
                protected String идФайлИнфПол;

                /**
                 * Gets the value of the текстИнф property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the текстИнф property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getТекстИнф().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ТекстИнфТип }
                 * 
                 * 
                 */
                public List<ТекстИнфТип> getТекстИнф() {
                    if (текстИнф == null) {
                        текстИнф = new ArrayList<ТекстИнфТип>();
                    }
                    return this.текстИнф;
                }

                /**
                 * Gets the value of the идФайлИнфПол property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getИдФайлИнфПол() {
                    return идФайлИнфПол;
                }

                /**
                 * Sets the value of the идФайлИнфПол property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setИдФайлИнфПол(String value) {
                    this.идФайлИнфПол = value;
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
             *       &lt;attribute name="НомИспрСчФ" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;totalDigits value="3"/>
             *             &lt;minInclusive value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ДатаИспрСчФ" use="required" type="{}ДатаТип" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ИспрСчФ {

                @XmlAttribute(name = "\u041d\u043e\u043c\u0418\u0441\u043f\u0440\u0421\u0447\u0424", required = true)
                protected BigInteger номИспрСчФ;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440\u0421\u0447\u0424", required = true)
                protected String датаИспрСчФ;

                /**
                 * Gets the value of the номИспрСчФ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getНомИспрСчФ() {
                    return номИспрСчФ;
                }

                /**
                 * Sets the value of the номИспрСчФ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setНомИспрСчФ(BigInteger value) {
                    this.номИспрСчФ = value;
                }

                /**
                 * Gets the value of the датаИспрСчФ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getДатаИспрСчФ() {
                    return датаИспрСчФ;
                }

                /**
                 * Sets the value of the датаИспрСчФ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setДатаИспрСчФ(String value) {
                    this.датаИспрСчФ = value;
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
             *       &lt;attribute name="НомерПРД" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="30"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ДатаПРД" use="required" type="{}ДатаТип" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class СвПРД {

                @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u041f\u0420\u0414", required = true)
                protected String номерПРД;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0420\u0414", required = true)
                protected String датаПРД;

                /**
                 * Gets the value of the номерПРД property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getНомерПРД() {
                    return номерПРД;
                }

                /**
                 * Sets the value of the номерПРД property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setНомерПРД(String value) {
                    this.номерПРД = value;
                }

                /**
                 * Gets the value of the датаПРД property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getДатаПРД() {
                    return датаПРД;
                }

                /**
                 * Sets the value of the датаПРД property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setДатаПРД(String value) {
                    this.датаПРД = value;
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
         *       &lt;sequence>
         *         &lt;element name="СведТов" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Акциз" type="{}СумАкцизТип"/>
         *                   &lt;element name="СумНал" type="{}СумНДСТип"/>
         *                   &lt;element name="СвТД" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="КодПроисх" use="required" type="{}ОКСМТип" />
         *                           &lt;attribute name="НомерТД" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="29"/>
         *                                 &lt;minLength value="1"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ИнфПолФХЖ2" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
         *                   &lt;element name="ДопСведТов" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ПрТовРаб">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="1"/>
         *                                 &lt;enumeration value="2"/>
         *                                 &lt;enumeration value="3"/>
         *                                 &lt;enumeration value="4"/>
         *                                 &lt;enumeration value="5"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДопПризн">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="4"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="КодТов">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НаимЕдИзм">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="КрНаимСтрПр">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НадлОтп">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;totalDigits value="26"/>
         *                                 &lt;fractionDigits value="11"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="КорСчДебет">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="9"/>
         *                                 &lt;pattern value="[0-9]{9}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="КорСчКредит">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="9"/>
         *                                 &lt;pattern value="[0-9]{9}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="НомСтр" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;totalDigits value="6"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="НаимТов" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="1000"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ОКЕИ_Тов" type="{}ОКЕИТип" />
         *                 &lt;attribute name="КолТов">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="26"/>
         *                       &lt;fractionDigits value="11"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ЦенаТов">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="26"/>
         *                       &lt;fractionDigits value="11"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="СтТовБезНДС">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="19"/>
         *                       &lt;fractionDigits value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="НалСт" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="7"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;enumeration value="0%"/>
         *                       &lt;enumeration value="10%"/>
         *                       &lt;enumeration value="18%"/>
         *                       &lt;enumeration value="10/110"/>
         *                       &lt;enumeration value="18/118"/>
         *                       &lt;enumeration value="без НДС"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="СтТовУчНал" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="19"/>
         *                       &lt;fractionDigits value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ВсегоОпл">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="СумНалВсего" type="{}СумНДСТип"/>
         *                   &lt;element name="НеттоВс" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;totalDigits value="26"/>
         *                         &lt;fractionDigits value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="СтТовБезНДСВсего">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="19"/>
         *                       &lt;fractionDigits value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="СтТовУчНалВсего" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;totalDigits value="19"/>
         *                       &lt;fractionDigits value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0441\u0432\u0435\u0434\u0422\u043e\u0432",
            "\u0432\u0441\u0435\u0433\u043e\u041e\u043f\u043b"
        })
        public static class ТаблСчФакт {

            @XmlElement(name = "\u0421\u0432\u0435\u0434\u0422\u043e\u0432", required = true)
            protected List<Файл.Документ.ТаблСчФакт.СведТов> сведТов;
            @XmlElement(name = "\u0412\u0441\u0435\u0433\u043e\u041e\u043f\u043b", required = true)
            protected Файл.Документ.ТаблСчФакт.ВсегоОпл всегоОпл;

            /**
             * Gets the value of the сведТов property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the сведТов property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСведТов().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Файл.Документ.ТаблСчФакт.СведТов }
             * 
             * 
             */
            public List<Файл.Документ.ТаблСчФакт.СведТов> getСведТов() {
                if (сведТов == null) {
                    сведТов = new ArrayList<Файл.Документ.ТаблСчФакт.СведТов>();
                }
                return this.сведТов;
            }

            /**
             * Gets the value of the всегоОпл property.
             * 
             * @return
             *     possible object is
             *     {@link Файл.Документ.ТаблСчФакт.ВсегоОпл }
             *     
             */
            public Файл.Документ.ТаблСчФакт.ВсегоОпл getВсегоОпл() {
                return всегоОпл;
            }

            /**
             * Sets the value of the всегоОпл property.
             * 
             * @param value
             *     allowed object is
             *     {@link Файл.Документ.ТаблСчФакт.ВсегоОпл }
             *     
             */
            public void setВсегоОпл(Файл.Документ.ТаблСчФакт.ВсегоОпл value) {
                this.всегоОпл = value;
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
             *         &lt;element name="СумНалВсего" type="{}СумНДСТип"/>
             *         &lt;element name="НеттоВс" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;totalDigits value="26"/>
             *               &lt;fractionDigits value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="СтТовБезНДСВсего">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="19"/>
             *             &lt;fractionDigits value="2"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="СтТовУчНалВсего" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="19"/>
             *             &lt;fractionDigits value="2"/>
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
                "\u0441\u0443\u043c\u041d\u0430\u043b\u0412\u0441\u0435\u0433\u043e",
                "\u043d\u0435\u0442\u0442\u043e\u0412\u0441"
            })
            public static class ВсегоОпл {

                @XmlElement(name = "\u0421\u0443\u043c\u041d\u0430\u043b\u0412\u0441\u0435\u0433\u043e", required = true)
                protected СумНДСТип сумНалВсего;
                @XmlElement(name = "\u041d\u0435\u0442\u0442\u043e\u0412\u0441")
                protected BigDecimal неттоВс;
                @XmlAttribute(name = "\u0421\u0442\u0422\u043e\u0432\u0411\u0435\u0437\u041d\u0414\u0421\u0412\u0441\u0435\u0433\u043e")
                protected BigDecimal стТовБезНДСВсего;
                @XmlAttribute(name = "\u0421\u0442\u0422\u043e\u0432\u0423\u0447\u041d\u0430\u043b\u0412\u0441\u0435\u0433\u043e", required = true)
                protected BigDecimal стТовУчНалВсего;

                /**
                 * Gets the value of the сумНалВсего property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СумНДСТип }
                 *     
                 */
                public СумНДСТип getСумНалВсего() {
                    return сумНалВсего;
                }

                /**
                 * Sets the value of the сумНалВсего property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СумНДСТип }
                 *     
                 */
                public void setСумНалВсего(СумНДСТип value) {
                    this.сумНалВсего = value;
                }

                /**
                 * Gets the value of the неттоВс property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getНеттоВс() {
                    return неттоВс;
                }

                /**
                 * Sets the value of the неттоВс property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setНеттоВс(BigDecimal value) {
                    this.неттоВс = value;
                }

                /**
                 * Gets the value of the стТовБезНДСВсего property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getСтТовБезНДСВсего() {
                    return стТовБезНДСВсего;
                }

                /**
                 * Sets the value of the стТовБезНДСВсего property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setСтТовБезНДСВсего(BigDecimal value) {
                    this.стТовБезНДСВсего = value;
                }

                /**
                 * Gets the value of the стТовУчНалВсего property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getСтТовУчНалВсего() {
                    return стТовУчНалВсего;
                }

                /**
                 * Sets the value of the стТовУчНалВсего property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setСтТовУчНалВсего(BigDecimal value) {
                    this.стТовУчНалВсего = value;
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
             *       &lt;sequence>
             *         &lt;element name="Акциз" type="{}СумАкцизТип"/>
             *         &lt;element name="СумНал" type="{}СумНДСТип"/>
             *         &lt;element name="СвТД" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="КодПроисх" use="required" type="{}ОКСМТип" />
             *                 &lt;attribute name="НомерТД" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="29"/>
             *                       &lt;minLength value="1"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ИнфПолФХЖ2" type="{}ТекстИнфТип" maxOccurs="20" minOccurs="0"/>
             *         &lt;element name="ДопСведТов" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ПрТовРаб">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="1"/>
             *                       &lt;enumeration value="2"/>
             *                       &lt;enumeration value="3"/>
             *                       &lt;enumeration value="4"/>
             *                       &lt;enumeration value="5"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДопПризн">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="4"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="КодТов">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НаимЕдИзм">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="КрНаимСтрПр">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НадлОтп">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;totalDigits value="26"/>
             *                       &lt;fractionDigits value="11"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="КорСчДебет">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="9"/>
             *                       &lt;pattern value="[0-9]{9}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="КорСчКредит">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="9"/>
             *                       &lt;pattern value="[0-9]{9}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="НомСтр" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;totalDigits value="6"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="НаимТов" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="1000"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ОКЕИ_Тов" type="{}ОКЕИТип" />
             *       &lt;attribute name="КолТов">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="26"/>
             *             &lt;fractionDigits value="11"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ЦенаТов">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="26"/>
             *             &lt;fractionDigits value="11"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="СтТовБезНДС">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="19"/>
             *             &lt;fractionDigits value="2"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="НалСт" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="7"/>
             *             &lt;minLength value="1"/>
             *             &lt;enumeration value="0%"/>
             *             &lt;enumeration value="10%"/>
             *             &lt;enumeration value="18%"/>
             *             &lt;enumeration value="10/110"/>
             *             &lt;enumeration value="18/118"/>
             *             &lt;enumeration value="без НДС"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="СтТовУчНал" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;totalDigits value="19"/>
             *             &lt;fractionDigits value="2"/>
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
                "\u0430\u043a\u0446\u0438\u0437",
                "\u0441\u0443\u043c\u041d\u0430\u043b",
                "\u0441\u0432\u0422\u0414",
                "\u0438\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04162",
                "\u0434\u043e\u043f\u0421\u0432\u0435\u0434\u0422\u043e\u0432"
            })
            public static class СведТов {

                @XmlElement(name = "\u0410\u043a\u0446\u0438\u0437", required = true)
                protected СумАкцизТип акциз;
                @XmlElement(name = "\u0421\u0443\u043c\u041d\u0430\u043b", required = true)
                protected СумНДСТип сумНал;
                @XmlElement(name = "\u0421\u0432\u0422\u0414")
                protected List<Файл.Документ.ТаблСчФакт.СведТов.СвТД> свТД;
                @XmlElement(name = "\u0418\u043d\u0444\u041f\u043e\u043b\u0424\u0425\u04162")
                protected List<ТекстИнфТип> инфПолФХЖ2;
                @XmlElement(name = "\u0414\u043e\u043f\u0421\u0432\u0435\u0434\u0422\u043e\u0432")
                protected Файл.Документ.ТаблСчФакт.СведТов.ДопСведТов допСведТов;
                @XmlAttribute(name = "\u041d\u043e\u043c\u0421\u0442\u0440", required = true)
                protected BigInteger номСтр;
                @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0422\u043e\u0432", required = true)
                protected String наимТов;
                @XmlAttribute(name = "\u041e\u041a\u0415\u0418_\u0422\u043e\u0432")
                protected String океиТов;
                @XmlAttribute(name = "\u041a\u043e\u043b\u0422\u043e\u0432")
                protected BigDecimal колТов;
                @XmlAttribute(name = "\u0426\u0435\u043d\u0430\u0422\u043e\u0432")
                protected BigDecimal ценаТов;
                @XmlAttribute(name = "\u0421\u0442\u0422\u043e\u0432\u0411\u0435\u0437\u041d\u0414\u0421")
                protected BigDecimal стТовБезНДС;
                @XmlAttribute(name = "\u041d\u0430\u043b\u0421\u0442", required = true)
                protected String налСт;
                @XmlAttribute(name = "\u0421\u0442\u0422\u043e\u0432\u0423\u0447\u041d\u0430\u043b", required = true)
                protected BigDecimal стТовУчНал;

                /**
                 * Gets the value of the акциз property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СумАкцизТип }
                 *     
                 */
                public СумАкцизТип getАкциз() {
                    return акциз;
                }

                /**
                 * Sets the value of the акциз property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СумАкцизТип }
                 *     
                 */
                public void setАкциз(СумАкцизТип value) {
                    this.акциз = value;
                }

                /**
                 * Gets the value of the сумНал property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СумНДСТип }
                 *     
                 */
                public СумНДСТип getСумНал() {
                    return сумНал;
                }

                /**
                 * Sets the value of the сумНал property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СумНДСТип }
                 *     
                 */
                public void setСумНал(СумНДСТип value) {
                    this.сумНал = value;
                }

                /**
                 * Gets the value of the свТД property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the свТД property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getСвТД().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Файл.Документ.ТаблСчФакт.СведТов.СвТД }
                 * 
                 * 
                 */
                public List<Файл.Документ.ТаблСчФакт.СведТов.СвТД> getСвТД() {
                    if (свТД == null) {
                        свТД = new ArrayList<Файл.Документ.ТаблСчФакт.СведТов.СвТД>();
                    }
                    return this.свТД;
                }

                /**
                 * Gets the value of the инфПолФХЖ2 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the инфПолФХЖ2 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getИнфПолФХЖ2().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ТекстИнфТип }
                 * 
                 * 
                 */
                public List<ТекстИнфТип> getИнфПолФХЖ2() {
                    if (инфПолФХЖ2 == null) {
                        инфПолФХЖ2 = new ArrayList<ТекстИнфТип>();
                    }
                    return this.инфПолФХЖ2;
                }

                /**
                 * Gets the value of the допСведТов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Файл.Документ.ТаблСчФакт.СведТов.ДопСведТов }
                 *     
                 */
                public Файл.Документ.ТаблСчФакт.СведТов.ДопСведТов getДопСведТов() {
                    return допСведТов;
                }

                /**
                 * Sets the value of the допСведТов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Файл.Документ.ТаблСчФакт.СведТов.ДопСведТов }
                 *     
                 */
                public void setДопСведТов(Файл.Документ.ТаблСчФакт.СведТов.ДопСведТов value) {
                    this.допСведТов = value;
                }

                /**
                 * Gets the value of the номСтр property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getНомСтр() {
                    return номСтр;
                }

                /**
                 * Sets the value of the номСтр property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setНомСтр(BigInteger value) {
                    this.номСтр = value;
                }

                /**
                 * Gets the value of the наимТов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getНаимТов() {
                    return наимТов;
                }

                /**
                 * Sets the value of the наимТов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setНаимТов(String value) {
                    this.наимТов = value;
                }

                /**
                 * Gets the value of the океиТов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getОКЕИТов() {
                    return океиТов;
                }

                /**
                 * Sets the value of the океиТов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setОКЕИТов(String value) {
                    this.океиТов = value;
                }

                /**
                 * Gets the value of the колТов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getКолТов() {
                    return колТов;
                }

                /**
                 * Sets the value of the колТов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setКолТов(BigDecimal value) {
                    this.колТов = value;
                }

                /**
                 * Gets the value of the ценаТов property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getЦенаТов() {
                    return ценаТов;
                }

                /**
                 * Sets the value of the ценаТов property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setЦенаТов(BigDecimal value) {
                    this.ценаТов = value;
                }

                /**
                 * Gets the value of the стТовБезНДС property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getСтТовБезНДС() {
                    return стТовБезНДС;
                }

                /**
                 * Sets the value of the стТовБезНДС property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setСтТовБезНДС(BigDecimal value) {
                    this.стТовБезНДС = value;
                }

                /**
                 * Gets the value of the налСт property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getНалСт() {
                    return налСт;
                }

                /**
                 * Sets the value of the налСт property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setНалСт(String value) {
                    this.налСт = value;
                }

                /**
                 * Gets the value of the стТовУчНал property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getСтТовУчНал() {
                    return стТовУчНал;
                }

                /**
                 * Sets the value of the стТовУчНал property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setСтТовУчНал(BigDecimal value) {
                    this.стТовУчНал = value;
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
                 *       &lt;attribute name="ПрТовРаб">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="1"/>
                 *             &lt;enumeration value="2"/>
                 *             &lt;enumeration value="3"/>
                 *             &lt;enumeration value="4"/>
                 *             &lt;enumeration value="5"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="ДопПризн">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="4"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="КодТов">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НаимЕдИзм">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="КрНаимСтрПр">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НадлОтп">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;totalDigits value="26"/>
                 *             &lt;fractionDigits value="11"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="КорСчДебет">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="9"/>
                 *             &lt;pattern value="[0-9]{9}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="КорСчКредит">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="9"/>
                 *             &lt;pattern value="[0-9]{9}"/>
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
                public static class ДопСведТов {

                    @XmlAttribute(name = "\u041f\u0440\u0422\u043e\u0432\u0420\u0430\u0431")
                    protected String прТовРаб;
                    @XmlAttribute(name = "\u0414\u043e\u043f\u041f\u0440\u0438\u0437\u043d")
                    protected String допПризн;
                    @XmlAttribute(name = "\u041a\u043e\u0434\u0422\u043e\u0432")
                    protected String кодТов;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0415\u0434\u0418\u0437\u043c")
                    protected String наимЕдИзм;
                    @XmlAttribute(name = "\u041a\u0440\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u041f\u0440")
                    protected String крНаимСтрПр;
                    @XmlAttribute(name = "\u041d\u0430\u0434\u043b\u041e\u0442\u043f")
                    protected BigDecimal надлОтп;
                    @XmlAttribute(name = "\u041a\u043e\u0440\u0421\u0447\u0414\u0435\u0431\u0435\u0442")
                    protected String корСчДебет;
                    @XmlAttribute(name = "\u041a\u043e\u0440\u0421\u0447\u041a\u0440\u0435\u0434\u0438\u0442")
                    protected String корСчКредит;

                    /**
                     * Gets the value of the прТовРаб property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getПрТовРаб() {
                        return прТовРаб;
                    }

                    /**
                     * Sets the value of the прТовРаб property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setПрТовРаб(String value) {
                        this.прТовРаб = value;
                    }

                    /**
                     * Gets the value of the допПризн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДопПризн() {
                        return допПризн;
                    }

                    /**
                     * Sets the value of the допПризн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДопПризн(String value) {
                        this.допПризн = value;
                    }

                    /**
                     * Gets the value of the кодТов property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодТов() {
                        return кодТов;
                    }

                    /**
                     * Sets the value of the кодТов property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодТов(String value) {
                        this.кодТов = value;
                    }

                    /**
                     * Gets the value of the наимЕдИзм property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимЕдИзм() {
                        return наимЕдИзм;
                    }

                    /**
                     * Sets the value of the наимЕдИзм property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимЕдИзм(String value) {
                        this.наимЕдИзм = value;
                    }

                    /**
                     * Gets the value of the крНаимСтрПр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКрНаимСтрПр() {
                        return крНаимСтрПр;
                    }

                    /**
                     * Sets the value of the крНаимСтрПр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКрНаимСтрПр(String value) {
                        this.крНаимСтрПр = value;
                    }

                    /**
                     * Gets the value of the надлОтп property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getНадлОтп() {
                        return надлОтп;
                    }

                    /**
                     * Sets the value of the надлОтп property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setНадлОтп(BigDecimal value) {
                        this.надлОтп = value;
                    }

                    /**
                     * Gets the value of the корСчДебет property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКорСчДебет() {
                        return корСчДебет;
                    }

                    /**
                     * Sets the value of the корСчДебет property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКорСчДебет(String value) {
                        this.корСчДебет = value;
                    }

                    /**
                     * Gets the value of the корСчКредит property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКорСчКредит() {
                        return корСчКредит;
                    }

                    /**
                     * Sets the value of the корСчКредит property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКорСчКредит(String value) {
                        this.корСчКредит = value;
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
                 *       &lt;attribute name="КодПроисх" use="required" type="{}ОКСМТип" />
                 *       &lt;attribute name="НомерТД" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="29"/>
                 *             &lt;minLength value="1"/>
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
                public static class СвТД {

                    @XmlAttribute(name = "\u041a\u043e\u0434\u041f\u0440\u043e\u0438\u0441\u0445", required = true)
                    protected String кодПроисх;
                    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0422\u0414", required = true)
                    protected String номерТД;

                    /**
                     * Gets the value of the кодПроисх property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодПроисх() {
                        return кодПроисх;
                    }

                    /**
                     * Sets the value of the кодПроисх property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодПроисх(String value) {
                        this.кодПроисх = value;
                    }

                    /**
                     * Gets the value of the номерТД property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНомерТД() {
                        return номерТД;
                    }

                    /**
                     * Sets the value of the номерТД property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНомерТД(String value) {
                        this.номерТД = value;
                    }

                }

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
     *       &lt;sequence>
     *         &lt;element name="СвОЭДОтпр" minOccurs="0">
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
     *                 &lt;attribute name="ИдЭДО" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="3"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдОтпр" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="4"/>
     *             &lt;maxLength value="46"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ИдПол" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="4"/>
     *             &lt;maxLength value="46"/>
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
        "\u0441\u0432\u041e\u042d\u0414\u041e\u0442\u043f\u0440"
    })
    public static class СвУчДокОбор {

        @XmlElement(name = "\u0421\u0432\u041e\u042d\u0414\u041e\u0442\u043f\u0440")
        protected Файл.СвУчДокОбор.СвОЭДОтпр свОЭДОтпр;
        @XmlAttribute(name = "\u0418\u0434\u041e\u0442\u043f\u0440", required = true)
        protected String идОтпр;
        @XmlAttribute(name = "\u0418\u0434\u041f\u043e\u043b", required = true)
        protected String идПол;

        /**
         * Gets the value of the свОЭДОтпр property.
         * 
         * @return
         *     possible object is
         *     {@link Файл.СвУчДокОбор.СвОЭДОтпр }
         *     
         */
        public Файл.СвУчДокОбор.СвОЭДОтпр getСвОЭДОтпр() {
            return свОЭДОтпр;
        }

        /**
         * Sets the value of the свОЭДОтпр property.
         * 
         * @param value
         *     allowed object is
         *     {@link Файл.СвУчДокОбор.СвОЭДОтпр }
         *     
         */
        public void setСвОЭДОтпр(Файл.СвУчДокОбор.СвОЭДОтпр value) {
            this.свОЭДОтпр = value;
        }

        /**
         * Gets the value of the идОтпр property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдОтпр() {
            return идОтпр;
        }

        /**
         * Sets the value of the идОтпр property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдОтпр(String value) {
            this.идОтпр = value;
        }

        /**
         * Gets the value of the идПол property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдПол() {
            return идПол;
        }

        /**
         * Sets the value of the идПол property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдПол(String value) {
            this.идПол = value;
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
         *       &lt;attribute name="ИдЭДО" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="3"/>
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
        public static class СвОЭДОтпр {

            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", required = true)
            protected String наимОрг;
            @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
            protected String иннюл;
            @XmlAttribute(name = "\u0418\u0434\u042d\u0414\u041e", required = true)
            protected String идЭДО;

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
             * Gets the value of the идЭДО property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИдЭДО() {
                return идЭДО;
            }

            /**
             * Sets the value of the идЭДО property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИдЭДО(String value) {
                this.идЭДО = value;
            }

        }

    }

}
