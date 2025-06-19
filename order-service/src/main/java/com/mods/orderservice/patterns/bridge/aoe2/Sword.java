package com.mods.orderservice.patterns.bridge.aoe2;

public class Sword implements WeaponApi{
    @Override
    public void attack(Unit attacker, Unit defender) {
        int damage = attacker.getAttack() - attacker.getMeleeArmor();
        System.out.println(attacker.getName() + " attack with sword " + defender.getName() + " for " + damage + " damage");
    }
}
