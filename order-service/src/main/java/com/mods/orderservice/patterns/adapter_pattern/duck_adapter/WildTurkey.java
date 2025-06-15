package com.mods.orderservice.patterns.adapter_pattern.duck_adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("wild turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("wild turkey fly");
    }
}
