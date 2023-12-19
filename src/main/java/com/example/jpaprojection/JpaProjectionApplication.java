package com.example.jpaprojection;

import com.example.jpaprojection.bean.Address;
import com.example.jpaprojection.bean.Person;
import com.example.jpaprojection.dao.AddressDao;
import com.example.jpaprojection.dao.PersonDao;
import com.example.jpaprojection.service.PersonService;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class JpaProjectionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaProjectionApplication.class, args);
    }

    @Autowired
    private PersonDao personDao;
    @Autowired
    private AddressDao addressDao;

    @Override
    public void run(String... args) throws Exception {

        List<Person> personList = new ArrayList<>();
        List<Address> addressList = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {

            Address address = new Address(UUID.randomUUID().toString() + i, "RABAT" + i, "HHHH" + i);
            addressList.add(address);
            Person person = new Person();
            person.setFirstName("hamza");
            person.setLastName("jaa");
            person.setEmail("hamza" + i + "@gmail.com");
            person.setAddress(address);
            personList.add(person);

        }
        addressDao.saveAll(addressList);
        personDao.saveAll(personList);
    }
}
