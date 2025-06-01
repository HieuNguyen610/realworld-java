package com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern;

import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.FlyNoWay;
import com.mods.orderservice.patterns.creational.singleton.duck_strategy_pattern.interfaces.impl.Squeak;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehaviors = new FlyNoWay();
        quackBehaviors = new Squeak();
    }

}
