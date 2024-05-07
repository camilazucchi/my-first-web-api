package com.zucchicamila.myfirstwebapi.controller;

import com.zucchicamila.myfirstwebapi.model.User;
import com.zucchicamila.myfirstwebapi.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Operation(summary = "Get all users")
    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }

    @Operation(summary = "Get a user by username")
    @GetMapping("/{username}")
    public User getOneUser(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @Operation(summary = "Delete a user by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "User deleted successfully"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @Operation(summary = "Create a new user")
    @PostMapping
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

}
