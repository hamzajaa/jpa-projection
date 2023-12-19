package com.example.jpaprojection.service;

import com.example.jpaprojection.bean.Person;
import com.example.jpaprojection.dao.PersonDao;
import com.example.jpaprojection.dao.PersonInterfaceProjection;
import com.example.jpaprojection.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public List<PersonDto> findAllDtos(String lastName) {
        return personDao.findByLastName(lastName);
    }

    @Override
    public List<PersonInterfaceProjection> findAllInterProjection(String firstName) {
        return personDao.findPersonByFirstName(firstName);
    }

    @Override
    public List<Person> findAllByQuery(String firstName) {
        return personDao.findAllByQuery(firstName);
    }


    @Override
    public void save(Person person) {
        personDao.save(person);
    }
}
