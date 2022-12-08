package telran.java45.person.dao;

import org.springframework.data.repository.CrudRepository;

import telran.java45.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
