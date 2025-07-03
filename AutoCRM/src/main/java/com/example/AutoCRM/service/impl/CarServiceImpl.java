package com.example.AutoCRM.service.impl;

import com.example.AutoCRM.dto.car.CarRequestDto;
import com.example.AutoCRM.dto.car.CarResponseDto;
import com.example.AutoCRM.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<CarResponseDto> getAllCars() {
        return List.of();
    }

    @Override
    public CarResponseDto getCarById(Long id) {
        return null;
    }

    @Override
    public CarResponseDto createCar(CarRequestDto carRequestDto) {
        return null;
    }

    @Override
    public CarResponseDto updateCar(Long id, CarRequestDto carRequestDto) {
        return null;
    }

    @Override
    public void deleteCar(Long id) {

    }
}
