package com.zhen.myForum.controller;

import com.zhen.myForum.entity.User;
import com.zhen.myForum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable int userId) {
        try {
            User user1 = userService.updateUser(userId, user);
            return ResponseEntity.status(200).body(user1);
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.status(404).body(new User());
        }
    }
}
