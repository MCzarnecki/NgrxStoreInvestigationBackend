package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.services.impl;

import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.entities.Person;
import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.repositories.PersonRepository;
import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.services.PersonService;
import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.valueobjects.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonDto> getAllPeople() {
        return personRepository.findAll().stream().map(PersonDto::new).collect(Collectors.toList());
    }

    @Override
    public PersonDto addPerson(PersonDto personDto) {
        Person person = personDtoToPerson(personDto);
        person = personRepository.save(person);
        return new PersonDto(person);
    }

    private Person personDtoToPerson(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getId());
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());
        return person;
    }
}
