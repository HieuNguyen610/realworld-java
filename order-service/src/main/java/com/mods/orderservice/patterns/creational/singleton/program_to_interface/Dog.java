package com.mods.orderservice.patterns.creational.singleton.program_to_interface;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        bark();
    }

    private void bark() {
        System.out.println("bark");
    }
}
