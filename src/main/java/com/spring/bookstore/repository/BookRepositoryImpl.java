package com.spring.bookstore.repository;

import com.spring.bookstore.entity.BookEntity;
import com.spring.bookstore.entity.CategoryEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by E6430 on 06/11/17.
 */
@Repository
public class BookRepositoryImpl implements BookRepository{
    List<BookEntity> listBook;

    public void init(){
        final CategoryEntity categoryIT = new CategoryEntity( 1,"IT", "IT Boook");
        final CategoryEntity categoryMath = new CategoryEntity(2, "Math", "Mathematic books");

        listBook = new ArrayList<BookEntity>(){{
          add( new BookEntity(1, "Java A-Z", "Roger",
                  "9971-5-0210-0", 12.3, new Date(), categoryIT));
          add( new BookEntity(2, "PHP A-Z", "Bill",
                  "85-359-0277-5", 12.3, new Date(), categoryIT));
          add(new BookEntity(3, "Cleam Code", "Bruno",
                  "0-684-84328-5", 10, new Date(), categoryIT));
          add(new BookEntity(4, "Math for kids", "helio",
                  "80-902734-1-6", 10, new Date(), categoryMath));
        }};
    }

    @Override
    public List<BookEntity> findALL() {
        return listBook;
    }
}
