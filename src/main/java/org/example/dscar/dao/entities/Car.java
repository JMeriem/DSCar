package org.example.dscar.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Car;
    String model;
    String color;
    String matricul;
    double price;
}
