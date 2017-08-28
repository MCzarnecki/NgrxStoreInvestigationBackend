package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.controllers;

import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.services.PersonService;
import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.valueobjects.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PeopleController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/people")
    public List<PersonDto> getPeople() {
        return personService.getAllPeople();
    }

    @PostMapping(path = "/people")
    public PersonDto savePerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }

}
