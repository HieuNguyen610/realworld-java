package com.mods.orderservice.patterns.creational.singleton.factory_pattern;

public abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("I'm a circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("I'm a square.");
    }
}

class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else {
            return null;
        }
    }
}

class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else {
            return null;
        }
    }
}

class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

class ShapeFactoryDemo {
    public static void main(String[] args) {

        Shape shape1 = FactoryProducer.getFactory(false).getShape("circle");
        shape1.draw();

        Shape shape2 = FactoryProducer.getFactory(true).getShape("square");
        shape2.draw();
    }
}