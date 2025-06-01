package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.FlyBehaviors;
import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.QuackBehaviors;
import lombok.Setter;

/**
 * design principles:
 * 1. separates things that changes and that don't.
 * 2. prioritize composition over inheritance. ( has-a is better than is-a)
 *
 * strategy pattern: defines family of algorithms, encapsulates each one, and makes them interchangeable.
 */
@Setter
public abstract class Duck {

    protected FlyBehaviors flyBehaviors;
    protected QuackBehaviors quackBehaviors;

    public void swim() {
    }

    public void performFly () {
        flyBehaviors.fly();
    };

    public void performQuack () {
        quackBehaviors.quack();
    };

}
