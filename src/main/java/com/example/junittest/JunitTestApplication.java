package com.example.junittest;

import com.example.junittest.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestApplication implements CommandLineRunner {


    @Autowired
    private CalculatorService calculatorService;

    public static void main(String[] args) {
        SpringApplication.run(JunitTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("sum");
    }
}
