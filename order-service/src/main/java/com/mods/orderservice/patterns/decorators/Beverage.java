package com.mods.orderservice.patterns.decorators;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beverage {
    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;
    private boolean ice;

    public double cost() {
        return 0;
    }
}
