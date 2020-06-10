package com.unw.service;

import com.unw.entity.Person;
import com.unw.repo.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public Person findByName(String name) {
    return personRepository.findByName(name);
  }
  
  public List<Person> findAll(){
    return personRepository.findAll();
  }

}
