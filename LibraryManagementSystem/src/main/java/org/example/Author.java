package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int id;

    @Column(name = "author_name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "author_birthdate",nullable = false)
    private LocalDate birthDate;

    @Column(name = "author_country",nullable = false)
    private String country;
}
