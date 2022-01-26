package com.anjani.hotelanjani.service;

import java.util.List;

import com.anjani.hotelanjani.entities.User;
import com.anjani.hotelanjani.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
   public List<String>getAllUserNames()
    {
        return repository.getAllUserNames();
    }
    public User validateUser(String username,String password)
    {
        return repository.getByUsernameAndPassword(username, password);
    }

}
