package com.mods.orderservice.patterns.creational.factory;

public class AnimalFactory extends IAnimalFactory{
    @Override
    public IAnimal getAnimal(String type) throws Exception {
        return switch (type) {
            case "duck" -> new Duck();
            case "tiger" -> new Tiger();
            default -> throw new Exception("Unexpected value: " + type);
        };
    }
}
