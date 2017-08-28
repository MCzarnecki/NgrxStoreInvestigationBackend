package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String surname;

}
