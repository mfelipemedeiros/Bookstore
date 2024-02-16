package com.example.Bookstore.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bookstore.dtos.StockDto;
import com.example.Bookstore.entities.BookEntity;
import com.example.Bookstore.entities.StockEntity;
import com.example.Bookstore.repositories.StockRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bookstore/stock")
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @PostMapping("/addItem")
    public ResponseEntity<StockEntity> addItem(@RequestBody StockDto stockDto) {
        var stockModel = new StockEntity();
        BeanUtils.copyProperties(stockDto, stockModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockRepository.save(stockModel));
    }
        
}
