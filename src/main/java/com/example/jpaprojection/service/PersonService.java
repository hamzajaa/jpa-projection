package com.example.jpaprojection.service;

import com.example.jpaprojection.bean.Person;
import com.example.jpaprojection.dao.PersonInterfaceProjection;
import com.example.jpaprojection.dto.PersonDto;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    List<PersonDto> findAllDtos(String lastName);

    List<PersonInterfaceProjection> findAllInterProjection(String firstName);

    List<Person> findAllByQuery(String firstName);

    void save(Person person);

}
