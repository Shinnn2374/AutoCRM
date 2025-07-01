package com.example.AutoCRM.dto.client;

import com.example.AutoCRM.model.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponseDto {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private List<Car> cars;
}
