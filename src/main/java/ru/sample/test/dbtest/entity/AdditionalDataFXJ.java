package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.websocket.ClientEndpoint;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TODO переназовите меня
 */
@Entity
public class AdditionalDataFXJ implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @Min(1)
    @Max(255)
    private String organizationIdentifier;
    @Column
    @Min(1)
    @Max(255)
    private String OKVIdentifier;
    /**
     * TODO и меня
     */
    @Column
    private BigDecimal course;

}
