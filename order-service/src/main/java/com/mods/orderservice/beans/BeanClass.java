package com.mods.orderservice.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BeanClass {

    @PostConstruct
    public void hello() {
        System.out.println("Hello world");
    }
}
