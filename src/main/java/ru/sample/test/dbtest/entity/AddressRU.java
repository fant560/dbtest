package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
public class AddressRU implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Из всего этого обязательно указать только код региона
     */
    @Column
    @Pattern(regexp = "[0-9]{6}")
    private String index;

    @Column
    @NotNull
    @Pattern(regexp =  "[0-9]{2}")
    private String regionCode;

    @Column
    @Min(1)
    @Max(50)
    private String district;

    @Column
    @Min(1)
    @Max(50)
    private String city;

    @Column
    @Min(1)
    @Max(50)
    private String locality;

    @Column
    @Min(1)
    @Max(50)
    private String street;

    @Column
    @Min(1)
    @Max(20)
    private String house;

    @Column
    @Min(1)
    @Max(20)
    private String housing;

    @Column
    @Min(1)
    @Max(20)
    private String flat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
