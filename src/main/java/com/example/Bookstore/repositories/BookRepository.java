package com.example.Bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.entities.BookEntity;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
    
    List<BookEntity> findByTitle(String title);
}
