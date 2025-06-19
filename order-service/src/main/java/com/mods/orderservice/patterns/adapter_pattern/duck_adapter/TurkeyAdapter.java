package com.mods.orderservice.patterns.adapter_pattern.duck_adapter;

public class TurkeyAdapter implements Duck{

    /**
     * composition: use turkey method instead of duck
     */
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
