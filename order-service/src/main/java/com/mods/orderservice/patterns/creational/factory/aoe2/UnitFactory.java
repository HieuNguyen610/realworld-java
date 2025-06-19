package com.mods.orderservice.patterns.creational.factory.aoe2;

 interface Unit {
    String getName();
    int getHP();
    int getDamage();
    void attack();
}

 class Militia implements Unit {

     @Override
     public String getName() {
         return "militia";
     }

     @Override
     public int getHP() {
         return 0;
     }

     @Override
     public int getDamage() {
         return 0;
     }

     @Override
     public void attack() {
         System.out.println(this.getName() + " attack: " + this.getDamage() );
     }
 }
 class Archer implements Unit {

     @Override
     public String getName() {
         return "archer";
     }

     @Override
     public int getHP() {
         return 0;
     }

     @Override
     public int getDamage() {
         return 0;
     }

     @Override
     public void attack() {
         System.out.println(this.getName() + " attack: " + this.getDamage() );
     }
 }
 class Scout implements Unit {

     @Override
     public String getName() {
         return "scout";
     }

     @Override
     public int getHP() {
         return 0;
     }

     @Override
     public int getDamage() {
         return 0;
     }

     @Override
     public void attack() {
         System.out.println(this.getName() + " attack: " + this.getDamage() );
     }
 }

public class UnitFactory {
    public static Unit createUnit(String type) {
        switch (type.toLowerCase()) {
            case "militia": return new Militia();
            case "archer": return new Archer();
            case "scout": return new Scout();
            default: throw new IllegalArgumentException("Unknown unit type");
        }
    }

    public static void main(String[] args) {
        Unit unit = UnitFactory.createUnit("militia");
        unit.attack();
    }
}



