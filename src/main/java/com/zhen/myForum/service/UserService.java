package com.zhen.myForum.service;

import com.zhen.myForum.entity.User;
import com.zhen.myForum.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public User updateUser(int userId, User user) {
        Optional<User> optionalUser = userRepo.findById(userId);
        if(optionalUser.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }
        User foundUser = optionalUser.get();
        user.setUserId(userId);
        return userRepo.save(user);
    }

    public User deleteUser(int userId) {
        Optional<User> optionalUser = userRepo.findById(userId);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("User not found");
        }
        User user = optionalUser.get();
        userRepo.delete(user);
        return user;
    }

}
