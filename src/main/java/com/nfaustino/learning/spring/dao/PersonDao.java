package com.nfaustino.learning.spring.dao;

import com.nfaustino.learning.spring.model.Person;

import java.util.UUID;

public interface PersonDao {
    Boolean insertPerson(UUID id, Person person);

    default Boolean insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
