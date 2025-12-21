package com.crud4_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Crud4_1Application {

    public static void main(String[] args) {
        SpringApplication.run(Crud4_1Application.class, args);
    }

}
