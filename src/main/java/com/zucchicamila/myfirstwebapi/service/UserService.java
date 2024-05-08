package com.zucchicamila.myfirstwebapi.service;

import com.zucchicamila.myfirstwebapi.handler.BusinessException;
import com.zucchicamila.myfirstwebapi.model.User;
import com.zucchicamila.myfirstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public User save (User user) {
        return repository.save(user);
    }

    public User update(Long id, User user) {
        if (repository.existsById(id)) {
            user.setId(id);
            return repository.save(user);
        } else {
            throw new BusinessException("O ID informado não existe");
        }
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}