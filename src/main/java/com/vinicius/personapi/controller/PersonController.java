package com.vinicius.personapi.controller;

import com.vinicius.personapi.dto.MessageResponseDTO;
import com.vinicius.personapi.dto.request.PersonDTO;
import com.vinicius.personapi.entity.Person;
import com.vinicius.personapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    
    private final PersonService personService;
    
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDto) {
        return personService.createPerson(personDto);
    }
    
    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }
}