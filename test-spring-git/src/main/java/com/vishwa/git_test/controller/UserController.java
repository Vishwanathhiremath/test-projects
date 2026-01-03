package com.vishwa.git_test.controller;

import com.vishwa.git_test.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {

        UserService user = new UserService();
        return "user found ( name : " + user.getName() + " , id : " + user.getId() + ") ";

    }
}
