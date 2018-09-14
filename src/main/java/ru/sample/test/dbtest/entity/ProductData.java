package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Entity
public class ProductData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    @NotNull
    private ExciseSum exciseSum;
    @OneToOne
    @PrimaryKeyJoinColumn
    @NotNull
    private NDSSum ndsSum;
    @ManyToOne
    @JoinColumn(name = "decleration_info_id")
    private List<DeclarationInfo> declarationInfoList;
    @ManyToOne
    @JoinColumn(name = "text_info_id")
    private List<TextInfo> textInfos;
    @OneToOne
    @PrimaryKeyJoinColumn
    private AdditionalProductData additionalProductData;
    @Column
    @NotNull
    private BigInteger number;
    @Column
    @Min(1)
    @Max(1000)
    private String productDescription;
    /**
     * Код из Общероссийского классификатора единиц измерения
     */
    @Column
    @Min(3)
    @Max(4)
    @Pattern(regexp = "[0-9]{3,4}")
    private String code;

    /**
     * TODO научиться писать ограничения на большие числа
     */
    @Column
    private BigDecimal productsAmount;
    @Column
    private BigDecimal productsPrice;
    @Column
    private BigDecimal priceWithoutNDS;
    /**
     * Налоговая стоимость
     * TODO переназовите меня
     */
    @Column
    @NotNull
    @Pattern(regexp = "([А-Яа-яЁё]{1,7})|(7)|(1)|(0%)|(10%)|(18%)|(10/110)|(18/118)|(без НДС)")
    private String price;

    @Column
    @NotNull
    private BigDecimal priceWithTaxes;

}
