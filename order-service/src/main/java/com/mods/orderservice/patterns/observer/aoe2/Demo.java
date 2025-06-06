package com.mods.orderservice.patterns.observer.aoe2;

public class Demo {
    public static void main(String[] args) {
        TownCenter tc = new TownCenter();

        Villager v1 = new Villager("Villager 1", "food");
        Villager v2 = new Villager("Villager 2", "wood");
        Villager v3 = new Villager("Villager 3", "berries");

        tc.addObserver(v1);
        tc.addObserver(v2);
        tc.addObserver(v3);

        // Initial orders
        tc.issueOrder("gather food");
        tc.issueOrder("gather wood");

        // Change roles dynamically
        v2.setRole("food");
        v3.setRole("wood");

        // New orders
        tc.issueOrder("gather food");
        tc.issueOrder("gather wood");
    }
}

