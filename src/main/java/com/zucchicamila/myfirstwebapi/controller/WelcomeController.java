package com.zucchicamila.myfirstwebapi.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(info = @Info(title = "My API", version = "1.0.0", description = "Description of my API"))
public class WelcomeController {

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome to my Spring Boot Web API";
    }

}