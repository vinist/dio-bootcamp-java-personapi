package com.vinicius.personapi.entity;

import lombok.*;

@Getter
@AllArgsConstructor
public enum PhoneEnum {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");
    
    private final String description;
}
