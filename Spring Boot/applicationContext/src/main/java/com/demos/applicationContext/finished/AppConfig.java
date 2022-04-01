package com.demos.applicationContext.finished;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="abigail")
    public Student student() {
        return new Student(1, "Abigail");
    }

    @Bean(name = "mary")
    public Student studentMary() {
        return new Student(2, "Mary");
    }
}
