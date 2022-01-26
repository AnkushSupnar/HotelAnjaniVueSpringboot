package com.anjani.hotelanjani.repositories;

import java.util.List;

import com.anjani.hotelanjani.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
    
    @Query("Select username from User")
    List<String>getAllUserNames();
    User getByUsernameAndPassword(String username,String password);
    
}
