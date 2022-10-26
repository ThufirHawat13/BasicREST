package com.example.FirstRestApp.repositories;

import com.example.FirstRestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);

    List<Person> findByEmail(String email);

    List<Person> findByNameStartingWith(String startingWith);

}
