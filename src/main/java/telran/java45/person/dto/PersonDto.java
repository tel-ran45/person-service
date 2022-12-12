package telran.java45.person.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;

@Getter
//@JsonTypeInfo
public class PersonDto {

    Integer id;
    String name;
    LocalDate birthDate;
    AddressDto address; 
}
