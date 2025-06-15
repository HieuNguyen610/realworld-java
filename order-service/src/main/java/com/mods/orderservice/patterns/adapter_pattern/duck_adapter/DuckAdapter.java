package com.mods.orderservice.patterns.adapter_pattern.duck_adapter;

public class DuckAdapter implements Turkey {

    Duck duck;

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
