package com.example.Bookstore.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bookstore.dtos.BookDto;
import com.example.Bookstore.entities.BookEntity;
import com.example.Bookstore.repositories.BookRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bookstore/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<BookEntity> createBook(@RequestBody @Valid BookDto bookDto){
        var bookModel = new BookEntity();
        BeanUtils.copyProperties(bookDto, bookModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookModel);
    }
}
