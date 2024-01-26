package com.example.Bookstore.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public record UserDto(

    @NotBlank String email,
    @NotNull  String password
) {

}
