package com.example.AutoCRM.dto.service;

import com.example.AutoCRM.model.Master;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceResponseDto {

    private Integer price;

    private String name;

    private Master master;
}
