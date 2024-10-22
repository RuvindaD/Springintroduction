package com.ijse.Springintro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.User;
import com.ijse.Springintro.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override

    public User createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));//Encode the password. So that is not human readable.
        return userRepository.save(user);

    }
    
    
}
