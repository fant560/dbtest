package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class TotallyPaid implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    @NotNull
    private NDSSum ndsSum;
    @Column
    private BigDecimal netto;
    @Column
    private BigDecimal withoutNDS;
    @Column
    @NotNull
    private BigDecimal withNDS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NDSSum getNdsSum() {
        return ndsSum;
    }

    public void setNdsSum(NDSSum ndsSum) {
        this.ndsSum = ndsSum;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public BigDecimal getWithoutNDS() {
        return withoutNDS;
    }

    public void setWithoutNDS(BigDecimal withoutNDS) {
        this.withoutNDS = withoutNDS;
    }

    public BigDecimal getWithNDS() {
        return withNDS;
    }

    public void setWithNDS(BigDecimal withNDS) {
        this.withNDS = withNDS;
    }
}
