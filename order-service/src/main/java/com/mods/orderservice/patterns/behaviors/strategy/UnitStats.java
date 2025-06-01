package com.mods.orderservice.patterns.behaviors.strategy;

import lombok.Setter;

import java.util.Set;

import java.util.Set;

@Setter
public class UnitStats {
    private int hitPoints;
    private int damage;
    private int range;
    private int meleeArmor;
    private int pierceArmor;
    private Set<String> armorClasses;

    private UnitStats() {} // private constructor

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final UnitStats instance = new UnitStats();

        public Builder hitPoints(int hitPoints) {
            instance.hitPoints = hitPoints;
            return this;
        }

        public Builder damage(int damage) {
            instance.damage = damage;
            return this;
        }

        public Builder range(int range) {
            instance.range = range;
            return this;
        }

        public Builder meleeArmor(int armor) {
            instance.meleeArmor = armor;
            return this;
        }

        public Builder pierceArmor(int armor) {
            instance.pierceArmor = armor;
            return this;
        }

        public Builder armorClasses(Set<String> classes) {
            instance.armorClasses = classes;
            return this;
        }

        public UnitStats build() {
            return instance;
        }
    }

    // Getters
    public int getHitPoints() { return hitPoints; }
    public int getDamage() { return damage; }
    public int getRange() { return range; }
    public int getMeleeArmor() { return meleeArmor; }
    public int getPierceArmor() { return pierceArmor; }
    public Set<String> getArmorClasses() { return armorClasses; }

    @Override
    public String toString() {
        return String.format("HP: %d, DMG: %d, RNG: %d, MeleeArmor: %d, PierceArmor: %d, Classes: %s",
                hitPoints, damage, range, meleeArmor, pierceArmor, armorClasses);
    }
}


