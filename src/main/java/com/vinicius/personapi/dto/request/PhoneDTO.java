package com.vinicius.personapi.dto.request;

import com.vinicius.personapi.entity.PhoneEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private PhoneEnum type;
    
    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
