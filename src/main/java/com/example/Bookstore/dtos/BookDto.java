package com.example.Bookstore.dtos;

import jakarta.validation.constraints.NotBlank;

public record BookDto(
    

  @NotBlank  String autor,

  @NotBlank  String title,

  @NotBlank String theme
) {

}
