package com.mods.orderservice.patterns.decorators.aoe2;

public class BlastFurnaceDecorator extends UnitDecorator{
    public BlastFurnaceDecorator(Unit baseUnit) {
        super(baseUnit);
    }

    @Override
    public String getDescription() {
        return baseUnit.getDescription() + " + BlastFurnace";
    }

    @Override
    public int getAttack() {
        return baseUnit.getAttack() + 2;
    }
}
