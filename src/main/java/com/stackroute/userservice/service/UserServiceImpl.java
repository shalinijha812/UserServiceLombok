package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        User savedUser=userRepository.save(user);
        return savedUser;

    }
    public List<User> getAllUser(){
        return  (List<User>)userRepository.findAll();
    }
}
