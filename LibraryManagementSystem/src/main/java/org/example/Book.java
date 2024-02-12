package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @Column(name = "book_name",nullable = false)
    private String name;

    @Column(name = "book_publication_name",nullable = false)
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

}
