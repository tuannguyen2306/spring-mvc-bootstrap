package com.spring.bookstore.controller;

import com.spring.bookstore.entity.BookEntity;
import com.spring.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by E6430 on 06/12/17.
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String showBooks(Model model){
        List<BookEntity> bookList = bookRepository.findALL();
        model.addAttribute("bookList", bookList);
        return "home";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("searchInput") String searchInput, Model model){
        List<BookEntity> resultList;
        if (searchInput.isEmpty()){
            resultList = bookRepository.findALL();
        }else {
            resultList = bookRepository.search(searchInput);
        }
            model.addAttribute("bookList", resultList);
        return "home";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable int id){
    bookRepository.deleteById(id);
    return "redirect:/";
    }


}
