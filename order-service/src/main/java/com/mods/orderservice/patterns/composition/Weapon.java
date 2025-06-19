package com.mods.orderservice.patterns.composition;

public interface Weapon {
    void attack();
}

class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}

class Bow implements Weapon {

    @Override
    public void attack() {
        System.out.println("Bow attack");
    }
}

class Knight {

    private final Weapon weapon;

    public Knight() {
        weapon = new Sword();
    }

    public void attack( ) {
        weapon.attack();
    }
}

class Archer {
    private final Weapon weapon;

    public Archer() {
        weapon = new Bow();
    }

    public void attack() {
        weapon.attack();
    }
}

class TestWeapon {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.attack();

        Archer archer = new Archer();
        archer.attack();
    }
}