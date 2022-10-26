package com.example.BasicREST.repositories;

import com.example.BasicREST.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);

    List<Person> findByEmail(String email);

    List<Person> findByNameStartingWith(String startingWith);

}
