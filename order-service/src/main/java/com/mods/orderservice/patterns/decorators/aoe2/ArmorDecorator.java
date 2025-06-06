package com.mods.orderservice.patterns.decorators.aoe2;

public class ArmorDecorator extends UnitDecorator {
    public ArmorDecorator(Unit baseUnit) {
        super(baseUnit);
    }

    @Override
    public String getDescription() {
        return baseUnit.getDescription() + " + Armor";
    }

    @Override
    public int getArmor() {
        return baseUnit.getArmor() + 1;
    }
}

