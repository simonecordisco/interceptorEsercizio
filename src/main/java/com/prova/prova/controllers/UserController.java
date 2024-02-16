package com.prova.prova.controllers;

import com.prova.prova.entities.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(path="/get")
    public Users getUser(){
        return new Users();
    }
}
