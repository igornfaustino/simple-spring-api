package com.nfaustino.learning.spring.dao;

import com.nfaustino.learning.spring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<Person>();

    @Override
    public Boolean insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return true;
    }
}
