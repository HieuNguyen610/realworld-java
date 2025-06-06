package com.mods.orderservice.patterns.decorators.aoe2;

public class Aoe2DecoratorDemo {
    public static void main(String[] args) {
        Unit unit = new Militia();

        System.out.println("--- Base Unit ---");
        printStats(unit);

        // Apply Forging and Armor upgrades
        unit = new ForgingDecorator(unit);
        unit = new ArmorDecorator(unit);
        unit = new BlastFurnaceDecorator(unit);

        System.out.println("\n--- Upgraded Unit ---");
        printStats(unit);
    }

    private static void printStats(Unit unit) {
        System.out.println("Description: " + unit.getDescription());
        System.out.println("Attack: " + unit.getAttack());
        System.out.println("Armor: " + unit.getArmor());
        System.out.println("HP: " + unit.getHP());
    }
}
