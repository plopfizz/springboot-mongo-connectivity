package com.learningmongo.mongodb.service;

import com.learningmongo.mongodb.collection.Person;

public interface PersonService {
    String save(Person person);

//    List<Person> getPersonStartWith(String name);
//
//    void delete(String id);
//
//    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
//
//    Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);
//
//    List<Document> getOldestPersonByCity();
//
//    List<Document> getPopulationByCity();
}