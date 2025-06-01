package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.FlyWithWings;

public class DuckSimulator {
    public static void main(String[] args) {
        MalladDuck malladDuck = new MalladDuck();
        malladDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();

        rubberDuck.setFlyBehaviors(new FlyWithWings());
        rubberDuck.performFly();
    }
}
