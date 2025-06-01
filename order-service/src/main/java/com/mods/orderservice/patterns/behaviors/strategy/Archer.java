package com.mods.orderservice.patterns.behaviors.strategy;

import java.util.Set;

 class Swordsman extends Unit {
    public Swordsman() {
        this.attackStrategy = new MeleeAttack();
        this.stats = UnitStats.builder()
                .hitPoints(60)
                .damage(6)
                .range(1)
                .meleeArmor(1)
                .pierceArmor(0)
                .armorClasses(Set.of("Infantry"))
                .build();
    }

    @Override
    public void display() {
        System.out.println("I'm a Swordsman.");
    }
}


public class Archer extends Unit {
    public Archer() {
        this.attackStrategy = new RangedAttack();

        this.stats = UnitStats.builder()
                .hitPoints(30)
                .damage(4)
                .range(4)
                .meleeArmor(0)
                .pierceArmor(0)
                .armorClasses(Set.of("Archer"))
                .build();
    }

    @Override
    public void display() {
        System.out.println("I'm an Archer.");
    }
}


