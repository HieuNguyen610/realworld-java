package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.FlyNoWay;
import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.Quack;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehaviors = new FlyNoWay();
        quackBehaviors = new Quack();
    }
}
