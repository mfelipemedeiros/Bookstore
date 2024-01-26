package com.example.Bookstore.controllers;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Bookstore.dtos.UserDto;
import com.example.Bookstore.entities.UserEntity;
import com.example.Bookstore.repositories.UserRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bookstore/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody @Valid UserDto userDto) {

        var userModel = new UserEntity();
        BeanUtils.copyProperties(userDto, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(userModel));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAll(){
        List<UserEntity> userModel = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(userModel);
    }
     
}
