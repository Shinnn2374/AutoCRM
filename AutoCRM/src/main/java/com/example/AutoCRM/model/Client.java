package com.example.AutoCRM.model;

import com.example.AutoCRM.dto.client.ClientResponseDto;
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
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    @OneToMany(mappedBy = "cars")
    private List<Car> cars;


    public static ClientResponseDto modelToDto(Client client) {
        var clientDto = new ClientResponseDto().builder()
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .email(client.getEmail())
                .phone(client.getPhone())
                .cars(client.getCars())
                .build();
        return clientDto;
    }
}
