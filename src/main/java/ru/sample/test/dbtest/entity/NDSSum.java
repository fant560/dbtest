package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class NDSSum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Чисел должно быть 19, не более 2х из них на дробную часть
     * TODO накодить как-то, мне лень
     */
    @Column
    private BigDecimal ndsSum;

    @Column
    @Pattern(regexp = "[А-Яа-яЁё]{1,18}|(без НДС)")
    private String noNds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getNdsSum() {
        return ndsSum;
    }

    public void setNdsSum(BigDecimal ndsSum) {
        this.ndsSum = ndsSum;
    }

    public String getNoNds() {
        return noNds;
    }

    public void setNoNds(String noNds) {
        this.noNds = noNds;
    }
}
