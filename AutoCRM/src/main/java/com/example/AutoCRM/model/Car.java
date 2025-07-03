package com.example.AutoCRM.model;

import com.example.AutoCRM.dto.car.CarResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    private int year;

    private String vin;

    public static CarResponseDto CarToCarResponseDto(Car car) {
        var CarDto = new CarResponseDto().builder()
                .brand(car.getBrand())
                .model(car.getModel())
                .color(car.getColor())
                .year(car.getYear())
                .vin(car.getVin())
                .build();
        return CarDto;
    }
}
