package ru.sample.test.dbtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
public class Fieldinformation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(max = 20)
    @ManyToOne
    @JoinColumn(name = "text_info_id")
    private List<TextInfo> textInfos;
    @Column
    @Min(36)
    @Max(36)
    private String fileIdentifier;


}
