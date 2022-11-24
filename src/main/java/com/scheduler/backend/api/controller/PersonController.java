package com.scheduler.backend.api.controller;

import com.scheduler.backend.api.entity.Person;
import com.scheduler.backend.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonService service;
    //http://localhost:8080/api/persons
    @GetMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAllPersons(){
        return service.findAll();
    }
    @GetMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person findPerson(Long id){
        return service.findById(id);
    }
    @PostMapping("/persons/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Person savePerson(@RequestBody Person newPerson){
        return service.save(newPerson);
    }

}
