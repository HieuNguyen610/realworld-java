package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

public interface Flyable {
    default void fly() {
        System.out.println("fly");
    };
}
