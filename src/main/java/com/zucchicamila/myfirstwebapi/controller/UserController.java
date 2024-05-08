package com.zucchicamila.myfirstwebapi.controller;

import com.zucchicamila.myfirstwebapi.model.User;
import com.zucchicamila.myfirstwebapi.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @Operation(summary = "Get all users", description = "Get a list of all users")
    @GetMapping
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @Operation(summary = "Get user by ID", description = "Get user details by ID")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(summary = "Create a new user", description = "Create a new user")
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }

    @Operation(summary = "Update user details", description = "Update user details by ID")
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }

    @Operation(summary = "Delete user", description = "Delete user by ID")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteById(id);
    }

}
