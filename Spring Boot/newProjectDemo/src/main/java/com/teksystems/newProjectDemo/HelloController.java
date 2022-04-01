package com.teksystems.newProjectDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    User user = new User("Abigail");

    @GetMapping("/greet")
    public String greetUser() {
        return "Hello " + user.getName();
    }
}
