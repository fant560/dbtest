package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class AdditionalProductData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Дополнительные сведения об отгруженных  товарах (о выполненных работах, оказанных услугах), переданных имущественных правах
     */
    @Column
    @Pattern(regexp = "(1)|(2)|(3)|(4)|(5)")
    private String additionalProductsData;
    /**
     * Дополнительная информация о признаке
     */
    @Column
    @Min(1)
    @Max(4)
    private String additionalPropertyInfo;

    @Column
    @Min(1)
    @Max(255)
    private String productCode;
    /**
     * Единица измерения товара
     */
    @Column
    @Min(1)
    @Max(255)
    private String unit;
    /**
     * Краткое наименование страны происхождения товара (графа 10а счета-фактуры)
     */
    @Min(1)
    @Max(255)
    @Column
    private String productCountryOrigin;
    /**
     * Количество надлежит отпустить
     * TODO написать ограничения, для BigDecimal лениво
     */
    @Column
    private BigDecimal amount;

    @Column
    @Pattern(regexp = "[0-9]{9}")
    private String accountCredit;

    @Column
    @Pattern(regexp = "[0-9]{9}")
    private String accountDebet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdditionalProductsData() {
        return additionalProductsData;
    }

    public void setAdditionalProductsData(String additionalProductsData) {
        this.additionalProductsData = additionalProductsData;
    }

    public String getAdditionalPropertyInfo() {
        return additionalPropertyInfo;
    }

    public void setAdditionalPropertyInfo(String additionalPropertyInfo) {
        this.additionalPropertyInfo = additionalPropertyInfo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getProductCountryOrigin() {
        return productCountryOrigin;
    }

    public void setProductCountryOrigin(String productCountryOrigin) {
        this.productCountryOrigin = productCountryOrigin;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(String accountCredit) {
        this.accountCredit = accountCredit;
    }

    public String getAccountDebet() {
        return accountDebet;
    }

    public void setAccountDebet(String accountDebet) {
        this.accountDebet = accountDebet;
    }
}
