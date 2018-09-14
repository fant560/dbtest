package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Юридическое лицо
 */
@Entity
public class LegalEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    @Min(1)
    @Max(1001)
    private String organizationName;
    /**
     * ИНН юридического лица
     */
    @Column
    @NotNull
    @Pattern(regexp = "([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}")
    private String innLegalEntity;

    /**
     * КПП
     */
    @Column
    @Pattern(regexp = "[0-9]{7}")
    private String KPP;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getInnLegalEntity() {
        return innLegalEntity;
    }

    public void setInnLegalEntity(String innLegalEntity) {
        this.innLegalEntity = innLegalEntity;
    }

    public String getKPP() {
        return KPP;
    }

    public void setKPP(String KPP) {
        this.KPP = KPP;
    }
}
