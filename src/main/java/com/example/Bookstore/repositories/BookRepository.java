package com.example.Bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.entities.BooksEntity;

@Repository
public interface BookRepository extends JpaRepository<BooksEntity, Long>{
    
}
