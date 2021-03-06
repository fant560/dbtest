package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
public class Correction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @NotNull
    private BigInteger number;
    @Column
    @NotNull
    @Pattern(regexp = "((((0[1-9]{1}|1[0-9]{1}|2[0-8]{1})\\.(0[1-9]{1}|1[0-2]{1}))|((29|30)\\.(01|0[3-9]{1}|1[0-2]{1}))|(31\\.(01|03|05|07|08|10|12)))\\.((19|20)[0-9]{2}))|(29\\.02\\.((19|20)(((0|2|4|6|8)(0|4|8))|((1|3|5|7|9)(2|6)))))")
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
