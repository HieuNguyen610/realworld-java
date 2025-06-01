package com.mods.orderservice.patterns.creational.singleton.program_to_interface;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        meow();
    }

    private void meow() {
        System.out.println("meow");
    }
}
