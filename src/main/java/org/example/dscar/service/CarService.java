package org.example.dscar.service;

import org.example.dscar.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto saveCar(CarDto carDto);
    List<CarDto> getCarByModelAndPrice(String model, double price);
}
