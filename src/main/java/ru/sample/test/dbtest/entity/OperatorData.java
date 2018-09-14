package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Сведения об операторе электронного документооборота отправителя файла обмена счета-фактуры (информации продавца)
 */
@Entity
public class OperatorData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    @Min(1)
    @Max(1000)
    private String organizationName;

    /**
     * ИНН юридического лица
     */
    @Column
    @NotNull
    @Pattern(regexp = "([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}")
    private String innLegalEntity;

    @Column
    @NotNull
    @Min(3)
    @Max(3)
    private String idEDO;

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

    public String getIdEDO() {
        return idEDO;
    }

    public void setIdEDO(String idEDO) {
        this.idEDO = idEDO;
    }
}
