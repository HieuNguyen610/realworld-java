package com.mods.orderservice.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    @PostConstruct
    public void helloWorld() {
        System.out.println("Hello world, springboot3");
    }
}
