package ru.sample.test.dbtest.entity;

import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class ReceiverLoad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String someValue;


}
