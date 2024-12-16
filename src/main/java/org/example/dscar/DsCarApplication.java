package org.example.dscar;

import org.example.dscar.dao.entities.Car;
import org.example.dscar.dao.repositories.CarRepository;
import org.example.dscar.dto.CarDto;
import org.example.dscar.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsCarApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepository carRepository){
        return  args -> {
            carRepository.saveAll(
                    List.of(
                            Car.builder().model("model1").color("red").matricul("sssssss").price(123456).build(),
                            Car.builder().model("model2").color("yellow").matricul("qaaaaaaaa").price(123456).build(),
                            Car.builder().model("model3").color("pink").matricul("jdccsjss").price(123456).build(),
                            Car.builder().model("model4").color("blue").matricul("agaauihyjyu").price(123456).build()

                    )

            );
        };
    }



}
