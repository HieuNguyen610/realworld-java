package com.mods.orderservice.patterns.decorators.aoe2;

public abstract class UnitDecorator implements Unit {
    protected Unit baseUnit;

    public UnitDecorator(Unit baseUnit) {
        this.baseUnit = baseUnit;
    }

    @Override
    public String getDescription() {
        return baseUnit.getDescription();
    }

    @Override
    public int getAttack() {
        return baseUnit.getAttack();
    }

    @Override
    public int getArmor() {
        return baseUnit.getArmor();
    }

    @Override
    public int getHP() {
        return baseUnit.getHP();
    }
}

