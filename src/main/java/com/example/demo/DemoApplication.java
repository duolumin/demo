package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("第1次提交");
        System.out.println("第2次提交");
        System.out.println("第3次提交");
        System.out.println("第4次提交");
        System.out.println("第5次提交");

        SpringApplication.run(DemoApplication.class, args);

    }

}
