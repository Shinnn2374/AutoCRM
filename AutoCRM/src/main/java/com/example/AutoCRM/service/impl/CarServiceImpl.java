package com.example.AutoCRM.service.impl;

import com.example.AutoCRM.dto.car.CarRequestDto;
import com.example.AutoCRM.dto.car.CarResponseDto;
import com.example.AutoCRM.repository.CarRepository;
import com.example.AutoCRM.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<CarResponseDto> getAllCars() {
        return carRepository.findAll();
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
