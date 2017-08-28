package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.valueobjects;

import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.entities.Person;
import lombok.Data;

@Data
public class PersonDto {

    private long id;

    private String name;

    private String surname;

    public PersonDto(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.surname = person.getSurname();
    }

}
