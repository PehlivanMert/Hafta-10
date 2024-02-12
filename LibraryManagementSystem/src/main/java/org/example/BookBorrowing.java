package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bookborrowing")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookborrowing_id")
    private int id;

    @Column(name = "borrower_name",nullable = false)
    private String borrowerName;

    @Column(name = "borrower_email",nullable = false,unique = true)
    private String borrowerEmail;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_date",nullable = false)
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date",nullable = false)
    private LocalDate returnDate;

}
