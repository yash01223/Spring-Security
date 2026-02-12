package com.spring.security.Spring_Security.Controller;

import com.spring.security.Spring_Security.model.User;
import com.spring.security.Spring_Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUser {

    @Autowired
    public UserService userService;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
