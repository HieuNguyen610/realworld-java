package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.FlyWithWings;
import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.Quack;

public class MalladDuck extends Duck{

    public MalladDuck() {
        flyBehaviors = new FlyWithWings();
        quackBehaviors = new Quack();
    }

}
