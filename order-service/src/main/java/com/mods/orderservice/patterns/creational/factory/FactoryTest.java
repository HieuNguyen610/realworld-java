package com.mods.orderservice.patterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) throws Exception {
        IAnimalFactory factory = new AnimalFactory();
        IAnimal duck = factory.getAnimal("duck");
        duck.speak();
    }
}
