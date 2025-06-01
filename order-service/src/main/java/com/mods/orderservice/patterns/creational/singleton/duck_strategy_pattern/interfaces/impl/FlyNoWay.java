package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.FlyBehaviors;

public class FlyNoWay implements FlyBehaviors {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
