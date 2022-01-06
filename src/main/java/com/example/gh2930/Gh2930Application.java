package com.example.gh2930;

import io.micrometer.core.annotation.Timed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Gh2930Application {

    public static void main(String[] args) {
        SpringApplication.run(Gh2930Application.class, args);
    }

    @GetMapping("hello")
    @Timed
    String sayHello() {
        return "World";
    }
}
