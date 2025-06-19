package com.mods.orderservice.patterns.creational.factory;

public class Duck implements IAnimal{
    @Override
    public void speak() {
        System.out.println("Quack");
    }
}
