package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LibraryManagementSystem");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction(); //Önce Factory sonra Manager oluştur.
        Book book1 = entityManager.find(Book.class, 1);
        Book book2 = entityManager.find(Book.class, 2);


        transaction.begin();

        transaction.commit();
    }
}