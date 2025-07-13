package com.example.springkadaitodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.springkadaitodo.repository")
@EntityScan("com.example.springkadaitodo.entity")
@ComponentScan("com.example.springkadaitodo")
public class SpringKadaiTodoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringKadaiTodoApplication.class, args);
    }
}
