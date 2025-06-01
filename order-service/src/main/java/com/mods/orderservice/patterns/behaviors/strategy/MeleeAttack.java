package com.mods.orderservice.patterns.behaviors.strategy;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void attack(Unit attacker, Unit defender) {
        int baseDamage = attacker.getStats().getDamage();
        int targetArmor = defender.getStats().getMeleeArmor();

        int actualDamage = Math.max(1, baseDamage - targetArmor); // minimum 1
        int newHP = defender.getStats().getHitPoints() - actualDamage;

        defender.getStats().setHitPoints(Math.max(0, newHP)); // HP không âm

        System.out.printf("%s attacks %s with sword for %d damage (after armor).%n",
                attacker.getClass().getSimpleName(),
                defender.getClass().getSimpleName(),
                actualDamage);
    }
}

 class RangedAttack implements AttackStrategy {
    @Override
    public void attack(Unit attacker, Unit defender) {
        int baseDamage = attacker.getStats().getDamage();
        int targetArmor = defender.getStats().getPierceArmor();

        int actualDamage = Math.max(1, baseDamage - targetArmor);
        int newHP = defender.getStats().getHitPoints() - actualDamage;

        defender.getStats().setHitPoints(Math.max(0, newHP));

        System.out.printf("%s shoots %s for %d damage (after armor).%n",
                attacker.getClass().getSimpleName(),
                defender.getClass().getSimpleName(),
                actualDamage);
    }
}


