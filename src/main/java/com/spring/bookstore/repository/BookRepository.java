package com.spring.bookstore.repository;

import com.spring.bookstore.entity.BookEntity;

import java.util.List;

/**
 * Created by E6430 on 06/11/17.
 */

public interface BookRepository {
    List<BookEntity> findALL();
    List<BookEntity> search(String searchInput);
    void deleteById(int id);
    void save(BookEntity book);
    BookEntity findOne(int id);
    void update(BookEntity book);
}
