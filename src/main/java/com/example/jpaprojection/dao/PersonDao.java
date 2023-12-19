package com.example.jpaprojection.dao;

import com.example.jpaprojection.bean.Person;
import com.example.jpaprojection.dto.PersonDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {



    List<PersonDto> findByLastName(String lastName);
    List<PersonInterfaceProjection> findPersonByFirstName(String firstName);

    @Query(value = "SELECT p from Person as p where p.firstName=:firstName")
    List<Person> findAllByQuery(@Param("firstName") String firstName);
}
