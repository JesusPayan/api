package com.scheduler.backend.api.service;

import com.scheduler.backend.api.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    public List <Person> findAll();
    public Person findById(Long id);
    public void deleteById(Long id);
    public Person update(Long id,Long cel);
    public Person save(Person newPerson);
}
