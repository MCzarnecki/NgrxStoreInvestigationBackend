package com.czarnecki.michal.NgrxStoreInvestigationBackend.people.repositories;

import com.czarnecki.michal.NgrxStoreInvestigationBackend.people.entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findAll();
}
