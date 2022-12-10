package com.nfaustino.learning.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nfaustino.learning.spring.dao.PersonDao;
import com.nfaustino.learning.spring.model.Person;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public Boolean addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
