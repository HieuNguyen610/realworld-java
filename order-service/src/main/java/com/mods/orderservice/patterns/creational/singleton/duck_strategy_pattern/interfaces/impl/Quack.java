package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.QuackBehaviors;

public class Quack implements QuackBehaviors {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
