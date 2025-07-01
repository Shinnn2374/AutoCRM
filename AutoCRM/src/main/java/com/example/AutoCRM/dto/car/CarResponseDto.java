package com.example.AutoCRM.dto.car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarResponseDto {

    private String brand;
    private String model;
    private String color;
    private int year;
    private String vin;
}
