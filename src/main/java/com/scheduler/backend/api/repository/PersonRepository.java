package com.scheduler.backend.api.repository;

import com.scheduler.backend.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    /*Create,read,update,delete*/
}
