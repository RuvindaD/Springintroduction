package com.ijse.Springintro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.Springintro.entity.User;
import com.ijse.Springintro.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    
}
