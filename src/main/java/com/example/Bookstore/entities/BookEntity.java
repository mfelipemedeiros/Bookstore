package com.example.Bookstore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "books")
@Table(name = "books")
@Setter
@Getter
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String autor;

    private String title;

    private String theme;

    private Long stock_id;
}
