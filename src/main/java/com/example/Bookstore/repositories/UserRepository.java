package com.example.Bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
