package com.example.Bookstore.repositories;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository {

    UserDetails findUserByEmail(String email);

}
