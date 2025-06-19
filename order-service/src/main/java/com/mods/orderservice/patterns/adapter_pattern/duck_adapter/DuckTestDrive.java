package com.mods.orderservice.patterns.adapter_pattern.duck_adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();

        System.out.println("-------------");
        duck.quack();
        duck.fly();

    }
}
