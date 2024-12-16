package org.example.dscar.web;

import lombok.AllArgsConstructor;
import org.example.dscar.dto.CarDto;
import org.example.dscar.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {

    private final CarService carService;


    @MutationMapping
    public CarDto saveCar(@Argument CarDto car) {
        return carService.saveCar(car);
    }


    @QueryMapping
    public List<CarDto> getCarByModelAndPrice(@Argument String model, @Argument double price) {
        return carService.getCarByModelAndPrice(model, price);
    }
}
