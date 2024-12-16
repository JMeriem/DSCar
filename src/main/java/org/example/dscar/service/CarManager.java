package org.example.dscar.service;

import lombok.AllArgsConstructor;
import org.example.dscar.dao.entities.Car;
import org.example.dscar.dao.repositories.CarRepository;
import org.example.dscar.dto.CarDto;
import org.example.dscar.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public CarDto saveCar(CarDto carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        return carMapper.fromCarToCarDto(car);
    }

    @Override
    public List<CarDto> getCarByModelAndPrice(String model, double price) {
        List<Car> cars = carRepository.findByModelAndPrice(model, price);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }
}
