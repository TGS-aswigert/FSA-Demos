package com.demos.crud.finished.controller;

import com.demos.crud.finished.model.User;
import com.demos.crud.finished.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                           @RequestBody User userDetails) {
        return userService.updateUser(userId, userDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(value = "id") Long userId) {
        userService.deleteUser(userId);
    }
}
