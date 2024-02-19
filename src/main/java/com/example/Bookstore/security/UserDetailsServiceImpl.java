package com.example.Bookstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Bookstore.repositories.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDetails userDetails = userDetailsRepository.findUserByEmail(email);
        
        if (userDetails == null) {
            throw new UsernameNotFoundException("User with username: " + email + " not found");
        }
        
        // Create and return the Spring Security UserDetails object
        return org.springframework.security.core.userdetails.User.builder()
                .username(userDetails.getUsername())
                .password(userDetails.getPassword())
                .roles("ADMIN") // Replace with appropriate roles from userDetails if available
                .build();
    }

}
