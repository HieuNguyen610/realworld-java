package com.mods.orderservice.patterns.behaviors.strategy;

import lombok.Getter;

public abstract class Unit {
    protected AttackStrategy attackStrategy;
    protected UnitStats stats;

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void setStats(UnitStats stats) {
        this.stats = stats;
    }

    public UnitStats getStats() {
        return stats;
    }

    public void attack(Unit target) {
        if (attackStrategy != null)
            attackStrategy.attack(this, target);
        else
            System.out.println("No attack strategy assigned.");
    }

    public void showStats() {
        System.out.println(stats);
    }

    public abstract void display();
}

