package com.example.jpaonetoone;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.example.jpaonetoone.repository")
@SpringBootApplication
public class JpaonetooneApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaonetooneApplication.class, args);
    }

}
