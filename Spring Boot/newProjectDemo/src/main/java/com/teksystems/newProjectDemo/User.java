package com.teksystems.newProjectDemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

public class User {
    @Getter @Setter
    private String name;

    public User(String name) {
        this.name = name;
    }
}
