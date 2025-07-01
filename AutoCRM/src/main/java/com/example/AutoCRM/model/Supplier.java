package com.example.AutoCRM.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactPhone;

    @OneToMany(mappedBy = "supplier")
    private List<SparePart> spareParts;
}