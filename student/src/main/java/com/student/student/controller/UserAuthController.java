package com.student.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userauth")
public class UserAuthController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Hello, User! you are publicEndpoint.";
    }
    @GetMapping("/account")
    public String accountEndpoint() { 
        return "Hello, User! you are accountEndpoint.";
    }
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, User! you are adminEndpoint.";    
    }

}
