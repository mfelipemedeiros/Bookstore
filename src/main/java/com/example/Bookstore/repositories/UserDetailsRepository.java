package com.example.Bookstore.repositories;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsRepository {

    UserDetails findUserByEmail(String username);

}
