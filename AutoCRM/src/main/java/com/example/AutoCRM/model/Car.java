package com.example.AutoCRM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private int year;

    private String color;

    private String vin;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private List<Client> clients;

    @OneToMany(mappedBy = "car")
    private List<ServiceRequest> requests;


}
