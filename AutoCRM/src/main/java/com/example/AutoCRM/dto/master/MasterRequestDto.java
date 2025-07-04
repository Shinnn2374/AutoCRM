package com.example.AutoCRM.dto.master;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MasterRequestDto {

    private Long id;

    private String firstName;

    private String lastName;
}
