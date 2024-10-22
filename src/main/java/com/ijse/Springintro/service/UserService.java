package com.ijse.Springintro.service;

import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.User;

@Service
public interface UserService {
    User createUser(User user);
    
}
