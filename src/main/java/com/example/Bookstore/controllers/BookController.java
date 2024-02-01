package com.example.Bookstore.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    @PostMapping("/create")
    public ResponseEntity<BookEntity> createBook(@RequestBody @Valid BookDto bookDto){
        var bookModel = new BookEntity();
        BeanUtils.copyProperties(bookDto, bookModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookModel);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<BookEntity>> getAllBooks() {
        List<BookEntity> bookList = bookRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(bookList);
    }
        @GetMapping("/get/{title}")
    public ResponseEntity<List<BookEntity>> getByName(@PathVariable(value="title" ) String title) {
        List<BookEntity> bookList = bookRepository.findByTitle(title);

        return ResponseEntity.status(HttpStatus.OK).body(bookList);
    }
}
