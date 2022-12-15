package telran.java45.person.service;

import telran.java45.person.dto.AddressDto;
import telran.java45.person.dto.CityPopulationDto;
import telran.java45.person.dto.PersonDto;

public interface PersonService {
	Boolean addPerson(PersonDto personDto);

	PersonDto findPersonById(Integer id);
	
	PersonDto removePerson(Integer id);
	
	PersonDto updatePersonName(Integer id, String name);
	
	PersonDto updatePersonAddress(Integer id, AddressDto addressDto);
	
	Iterable<PersonDto> findPersonsByCity(String city);
	
	Iterable<PersonDto> findPersonsByName(String name);
	
	Iterable<PersonDto> findPersonsBetweenAges(Integer minAge, Integer maxAge);
	
	Iterable<CityPopulationDto> getCitiesPopulation();
	
	Iterable<PersonDto> getChildren();
	
	Iterable<PersonDto> findEmployeeBySalary(Integer min, Integer max);
}
