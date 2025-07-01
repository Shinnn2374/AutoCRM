package com.example.AutoCRM.model;

import com.example.AutoCRM.model.modelEnums.MasterStatus;
import com.example.AutoCRM.model.modelEnums.Specilization;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "masters")
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Specilization specilization;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private MasterStatus status;
}
