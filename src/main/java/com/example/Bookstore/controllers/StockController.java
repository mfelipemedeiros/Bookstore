package com.example.Bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bookstore.repositories.StockRepository;

@RestController
@RequestMapping("/bookstore/stock")
public class StockController {

    @Autowired
    StockRepository stockRepository;

    
}
