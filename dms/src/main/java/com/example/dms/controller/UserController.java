package com.example.dms.controller;

import com.example.dms.entity.UserEntity;
import com.example.dms.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> findUserById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity userEntity) {
        return userService.saveUser(userEntity);
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
        return userService.updateUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}