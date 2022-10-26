package com.example.FirstRestApp.services;

import com.example.FirstRestApp.models.Person;
import com.example.FirstRestApp.repositories.PeopleRepository;
import com.example.FirstRestApp.util.PersonNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
       return peopleRepository.findAll();
    }

    public Person findById(int id) {
        Optional<Person> person = peopleRepository.findById(id);
        return person.orElseThrow(PersonNotFoundException::new);
    }

    @Transactional
    public void save(Person person) {

        person.setUpdatedAt(LocalDateTime.now());
        peopleRepository.save(person);
    }

    @Transactional
    public void update(Person updPerson, int id) {
        updPerson.setUpdatedAt(LocalDateTime.now());
        updPerson.setId(id);
        peopleRepository.save(updPerson);
    }

    @Transactional
    public void delete(int id) {

        peopleRepository.deleteById(id);
    }


}
