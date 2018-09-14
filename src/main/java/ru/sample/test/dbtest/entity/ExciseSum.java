package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ExciseSum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Чисел должно быть 19, не более 2х из них на дробную часть
     * TODO накодить как-то, мне лень
     */
    @Column
    private BigDecimal sum;
    /**
     * Без акциза
     */
    @Column
    // кто эту ересь написал? Oo
    // TODO написать тест, не факт что сработает
    @Pattern(regexp = "[А-Яа-яЁё]{10}|(без акциза)")
    private String noExcise;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getNoExcise() {
        return noExcise;
    }

    public void setNoExcise(String noExcise) {
        this.noExcise = noExcise;
    }
}
