package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Сведения об индивидуальном предпринимателе
 */
@Entity
public class EntrepreneurInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * ИНН и ФИО обязательны, фио может быть несколько
     */

    @ManyToOne
    @JoinColumn(name = "fio_id")
    private List<FIO> fio;

    @Column
    @Pattern(regexp = "([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{10}")
    @NotNull
    private String inn;
    /**
     * Реквизиты свидетельства о государственной регистрации индивидуального предпринимателя
     */
    @Column
    @Min(1)
    @Max(100)
    private String registrationInfo;
    /**
     * Иные сведения, хз что такое, смотри xsd
     */
    @Column
    @Min(1)
    @Max(255)
    private String otherInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FIO> getFio() {
        return fio;
    }

    public void setFio(List<FIO> fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(String registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
