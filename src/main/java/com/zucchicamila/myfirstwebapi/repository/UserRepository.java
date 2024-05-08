package com.zucchicamila.myfirstwebapi.repository;

import com.zucchicamila.myfirstwebapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}