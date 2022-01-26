package com.anjani.hotelanjani.controller;

import java.util.List;

import com.anjani.hotelanjani.entities.User;
import com.anjani.hotelanjani.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/allusername")
    public List<String>getAllUserNames()
    {
        return service.getAllUserNames();
    }
    @GetMapping("/validate/{username}/{password}")
    public User validateLogin(@PathVariable String username,@PathVariable String password)
    {
        System.out.println(username+""+password);
        return service.validateUser(username, password);
    }
}
