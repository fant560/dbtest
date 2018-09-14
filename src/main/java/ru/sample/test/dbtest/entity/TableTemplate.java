package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
public class TableTemplate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "additional_product_data_id")
    private List<AdditionalProductData> additionalProductData;
    @OneToOne
    @PrimaryKeyJoinColumn
    @NotNull
    private TotallyPaid totallyPaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AdditionalProductData> getAdditionalProductData() {
        return additionalProductData;
    }

    public void setAdditionalProductData(List<AdditionalProductData> additionalProductData) {
        this.additionalProductData = additionalProductData;
    }

    public TotallyPaid getTotallyPaid() {
        return totallyPaid;
    }

    public void setTotallyPaid(TotallyPaid totallyPaid) {
        this.totallyPaid = totallyPaid;
    }
}
