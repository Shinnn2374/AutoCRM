package com.example.AutoCRM.model;

import jakarta.persistence.*;

@Entity
public class UsedSparePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "spare_part_id")
    private SparePart sparePart;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private ServiceRequest request;
}