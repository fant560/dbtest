package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Ровно одно из трех должно быть указано
     * TODO как-то это нахардкодить
     */

    @Column
    @OneToOne
    @PrimaryKeyJoinColumn
    private AddressRU addressRU;

    @Column
    @OneToOne
    @PrimaryKeyJoinColumn
    private AddressType addressType;

    @Column
    @Min(1)
    @Max(36)
    private String addressCode;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressRU getAddressRU() {
        return addressRU;
    }

    public void setAddressRU(AddressRU addressRU) {
        this.addressRU = addressRU;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }
}
