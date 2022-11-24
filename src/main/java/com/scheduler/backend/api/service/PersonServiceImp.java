package com.scheduler.backend.api.service;

import com.scheduler.backend.api.entity.Person;
import com.scheduler.backend.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImp implements PersonService {


    @Autowired
    private  PersonRepository personRepository;

    /*public PersonServiceImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }*/

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

        personRepository.deleteById(id);

    }

    @Override
    public Person save(Person newPerson) {
        return personRepository.save(newPerson);
    }

    @Override
    public Person update(Long id, Long cel) {
        Person personToUpdate = personRepository.getReferenceById(id);
        if (personToUpdate!=null){
            personToUpdate.setCelphone(cel);
        }
        return personRepository.save(personToUpdate);
    }
}
