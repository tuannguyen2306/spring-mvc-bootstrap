package com.spring.bookstore.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by E6430 on 06/11/17.
 */
public class BookEntity {
    private int id;
    private String name;
    private String author;
    private String isbn;
    private double price;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date publishDate;
    private CategoryEntity category;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public BookEntity() {
    }

    public BookEntity(int id) {
        this.id = id;
    }

    public BookEntity(int id, String name, String author, String isbn, double price, Date publishDate, CategoryEntity category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publishDate = publishDate;
        this.category = category;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())return false;
       BookEntity that = (BookEntity) o;
       return id == that.id;
    }

    @Override
    public int hashCode(){
        return id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Date getPublishDate() {
//        return publishDate;
//    }

//    format Date
    public String getPublishDateFormat(){
        return simpleDateFormat.format(publishDate);
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }



}
