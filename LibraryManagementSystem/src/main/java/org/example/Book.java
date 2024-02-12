package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @Column(name = "book_name",nullable = false)
    private String name;

    @Column(name = "book_publication_year",nullable = false)
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowingList;

    @ManyToMany()
    @JoinTable(
            name = "categoriestobooks",
            joinColumns = {@JoinColumn(name = "categoriestobooks_book_id")},
                    inverseJoinColumns = @JoinColumn(name = "categoriestobooks_category_id"))
    private List <Category> categorylist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_author_id",referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id",referencedColumnName = "publisher_id")
    private Publisher publisher;

    //@ManyToMany(fetch = FetchType.LAZY)
    //    @JoinTable(
    //            name = "pro2colors",
    //            joinColumns = {@JoinColumn(name = "pro2colors_product_id")},
    //            inverseJoinColumns = {@JoinColumn(name = "pro2colors_color_id")}

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<BookBorrowing> getBookBorrowingList() {
        return bookBorrowingList;
    }

    public void setBookBorrowingList(List<BookBorrowing> bookBorrowingList) {
        this.bookBorrowingList = bookBorrowingList;
    }

    public List<Category> getCategorylist() {
        return categorylist;
    }

    public void setCategorylist(List<Category> categorylist) {
        this.categorylist = categorylist;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", stock=" + stock +
                ", bookBorrowingList=" + bookBorrowingList +
                ", categorylist=" + categorylist +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
