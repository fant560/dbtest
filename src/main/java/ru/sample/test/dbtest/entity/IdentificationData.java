package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Идентификационные сведения
 */
@Entity
public class IdentificationData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    @NotNull
    private EntrepreneurInfo entrepreneurInfo;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Contact contact;
    @OneToOne
    @PrimaryKeyJoinColumn
    private BankInfo bankInfo;
    @Column
    @Min(1)
    @Max(10)
    private String okpo;
    @Column
    @Min(1)
    @Max(1000)
    private String structuredDepartment;
    @Column
    @Min(1)
    @Max(255)
    private String participantsInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntrepreneurInfo getEntrepreneurInfo() {
        return entrepreneurInfo;
    }

    public void setEntrepreneurInfo(EntrepreneurInfo entrepreneurInfo) {
        this.entrepreneurInfo = entrepreneurInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getStructuredDepartment() {
        return structuredDepartment;
    }

    public void setStructuredDepartment(String structuredDepartment) {
        this.structuredDepartment = structuredDepartment;
    }

    public String getParticipantsInfo() {
        return participantsInfo;
    }

    public void setParticipantsInfo(String participantsInfo) {
        this.participantsInfo = participantsInfo;
    }
}
