package com.example.lesson37;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson37Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson37Application.class, args);

        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);

    }

}
