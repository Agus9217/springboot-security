package com.justin.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /*@PostMapping("/create")
    public ResponseEntity<?>createUser(){

    }*/


}
