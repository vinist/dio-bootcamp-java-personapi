package com.vinicius.personapi.utils;

import com.vinicius.personapi.dto.request.PhoneDTO;
import com.vinicius.personapi.entity.Phone;
import com.vinicius.personapi.entity.PhoneEnum;

public class PhoneUtils {
    
    private static final String PHONE_NUMER = "67992142236";
    private static final PhoneEnum PHONE_TYPE = PhoneEnum.MOBILE;
    private static final long PHONE_ID = 1L;
    
    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMER)
                .type(PHONE_TYPE)
                .build();
    }
    
    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMER)
                .type(PHONE_TYPE)
                .build();
    }
}
