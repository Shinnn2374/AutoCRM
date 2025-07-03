package com.example.AutoCRM.service;

import com.example.AutoCRM.dto.car.CarRequestDto;
import com.example.AutoCRM.dto.car.CarResponseDto;

import java.util.List;

public interface CarService {

    List<CarResponseDto> getAllCars();

    CarResponseDto getCarById(Long id);

    CarResponseDto createCar(CarRequestDto carRequestDto);

    CarResponseDto updateCar(Long id, CarRequestDto carRequestDto);

    void deleteCar(Long id);
}
