package com.vinicius.personapi.utils;

import com.vinicius.personapi.dto.request.PersonDTO;
import com.vinicius.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class PersonUtils {
    
    private static final String FIRST_NAME = "João";
    private static final String LAST_NAME = "Silva";
    private static final String CPF = "022.354.666-10";
    private static final long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(1990, 10, 20);
    
    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firsName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate("10-10-1999")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }
    
    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firsName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
