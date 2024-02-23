package com.justin.springsecurity.controllers;

import com.justin.springsecurity.model.ERole;
import com.justin.springsecurity.model.RoleEntity;
import com.justin.springsecurity.model.UserEntity;
import com.justin.springsecurity.model.request.CreateUserDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class PrincipalController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World Not Secured";
    }

    @GetMapping("/hello-secured")
    public String helloSecured(){
        return "Hello World Secured";
    }

    @PostMapping("/createUser")
    public ResponseEntity<?>createUser(@Valid @RequestBody CreateUserDTO createUserDTO){

    }


}
