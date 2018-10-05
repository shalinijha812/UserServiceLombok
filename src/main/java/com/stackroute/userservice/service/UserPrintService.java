package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPrintService implements UserService{


        @Autowired
        private UserRepository userRepository;

        public User addUser(User user){
           System.out.println(user);
           return user;

        }
        public List<User> getAllUser(){
            System.out.println("Retriving users from aws");
            return  null;
        }
}



