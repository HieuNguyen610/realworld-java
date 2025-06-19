package com.mods.orderservice.patterns.behaviors.strategy;

public class Game {
    public static void main(String[] args) {
        Unit archer = new Archer();
        archer.display();           // I'm an Archer.
        Unit swordsman = new Swordsman();
        swordsman.display();        // I'm a Swordsman.

        archer.attack(swordsman);     // Shooting arrows from a distance!

        swordsman.attack(archer);  // Attacking with sword!
        archer.showStats();

        swordsman.showStats();

    }
}

