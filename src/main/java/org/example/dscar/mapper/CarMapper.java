package org.example.dscar.mapper;

import org.example.dscar.dao.entities.Car;
import org.example.dscar.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDto carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDto fromCarToCarDto(Car car){
        return mapper.map(car, CarDto.class);
    }
}
