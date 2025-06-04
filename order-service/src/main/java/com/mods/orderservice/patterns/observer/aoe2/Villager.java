package com.mods.orderservice.patterns.observer.aoe2;

public class Villager implements Observer {
    private final String name;
    private String role; // Mutable role

    public Villager(String name, String initialRole) {
        this.name = name;
        this.role = initialRole.toLowerCase();
    }

    public void setRole(String newRole) {
        System.out.println("🔁 " + name + " is reassigned to: " + newRole);
        this.role = newRole.toLowerCase();
    }

    @Override
    public void update() {

    }
}


