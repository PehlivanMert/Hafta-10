package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private int id;

    @Column(name = "publisher_name",nullable = false)
    private String name;

    @Column(name = "publisher_establishment_year",nullable = false)
    private String establishmentYear;

    @Column(name = "publisher_address",nullable = false)
    private String address;
}
