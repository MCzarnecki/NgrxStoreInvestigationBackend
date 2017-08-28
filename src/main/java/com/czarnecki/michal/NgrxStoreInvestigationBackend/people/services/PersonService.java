package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.services;

import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.valueobjects.PersonDto;

import java.util.List;

public interface PersonService {

    List<PersonDto> getAllPeople();

    PersonDto addPerson(PersonDto person);

}
