package com.mods.orderservice.patterns.bridge.aoe2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit {
    protected WeaponApi weaponApi;
    private String name;
    private int attack;
    private int meleeArmor;
    private int pierceArmor;

    public Unit(WeaponApi weaponApi) {
        this.weaponApi = weaponApi;
    }

    abstract void fight(Unit target);
}

@Getter
@Setter
class Militia extends Unit {

    private String name = "militia";
    private int attack = 4;
    private int meleeArmor = 0;

    public Militia(WeaponApi weaponApi) {
        super(weaponApi);
    }

    @Override
    void fight(Unit target) {
        weaponApi.attack(this, target);
    }
}