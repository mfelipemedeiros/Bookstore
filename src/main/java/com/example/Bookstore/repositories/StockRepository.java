package com.example.Bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.entities.StockEntity;

@Repository
public interface StockRepository extends JpaRepository<StockEntity, Long>{

}
