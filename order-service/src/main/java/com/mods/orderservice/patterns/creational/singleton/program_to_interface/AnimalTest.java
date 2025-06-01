package com.mods.orderservice.patterns.creational.singleton.program_to_interface;

/**
 * program to a supertype ( animal super type with a makeSound method ) .
 *
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}
