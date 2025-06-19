package com.mods.orderservice.patterns.creational.factory;

public abstract class IAnimalFactory {
    public abstract IAnimal getAnimal(String type) throws Exception;
}
