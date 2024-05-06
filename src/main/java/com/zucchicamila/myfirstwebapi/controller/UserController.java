package com.zucchicamila.myfirstwebapi.controller;

import com.zucchicamila.myfirstwebapi.model.User;
import com.zucchicamila.myfirstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getOneUser(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    // Aqui não usamos return, pois o método é void e ao excluir um usuário não retornamos nada!
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

}
