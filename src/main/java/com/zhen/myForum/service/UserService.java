package com.zhen.myForum.service;

import com.zhen.myForum.entity.User;
import com.zhen.myForum.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

}
