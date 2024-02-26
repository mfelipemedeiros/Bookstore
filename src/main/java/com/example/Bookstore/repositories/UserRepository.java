package com.example.Bookstore.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{


    Optional<UserEntity> findByEmail(String email);
}
