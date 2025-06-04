package com.mods.orderservice.patterns.decorators.aoe2;

public class Militia implements Unit {
    @Override
    public String getDescription() {
        return "Militia";
    }

    @Override
    public int getAttack() {
        return 4;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public int getHP() {
        return 40;
    }
}
