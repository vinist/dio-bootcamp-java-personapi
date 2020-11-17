package com.vinicius.personapi.service;

import com.vinicius.personapi.dto.MessageResponseDTO;
import com.vinicius.personapi.dto.request.PersonDTO;
import com.vinicius.personapi.entity.Person;
import com.vinicius.personapi.mapper.PersonMapper;
import com.vinicius.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    
    private final PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;
    
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDto) {
        Person personToSave = personMapper.toModel(personDto);
        
        var savedPersion = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID "+ savedPersion.getId())
                .build();
    }
    
    public List<PersonDTO> listAll() {
        List<Person> listPerson = personRepository.findAll();
        return listPerson.stream().map(personMapper::toDto).collect(Collectors.toList());
    }
}
