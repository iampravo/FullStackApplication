package com.pravinsingh.apps.fullstackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pravinsingh.apps.fullstackapp")
public class FullStackApplication {
    public static void main(String... args) {
        SpringApplication.run(FullStackApplication.class, args);
    }

}
