package com.jwt.controller;

import com.jwt.entity.Book;
import com.jwt.entity.Store;
import com.jwt.service.BookstoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookStoreController
{
    @Autowired
    private BookstoresService bookstoresService;


    @GetMapping("/stores")
    public List<Store> getAllStore ()
    {
        return bookstoresService.getAllStore();
    }

    @GetMapping("/stores/{id}")
    public Store getStoreById (@PathVariable Long id)
    {
        return bookstoresService.getStoreById(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBook ()
    {
        return bookstoresService.getAllBook();
    }

    @GetMapping("/stores/{id}/books")
    public List<Book> getBookById (@PathVariable Long id)
    {
        return bookstoresService.getBookById(id);
    }
}
