package com.mods.orderservice.patterns.decorators.aoe2;

public class ForgingDecorator extends UnitDecorator {
    public ForgingDecorator(Unit baseUnit) {
        super(baseUnit);
    }

    @Override
    public String getDescription() {
        return baseUnit.getDescription() + " + Forging";
    }

    @Override
    public int getAttack() {
        return baseUnit.getAttack() + 1;
    }
}

