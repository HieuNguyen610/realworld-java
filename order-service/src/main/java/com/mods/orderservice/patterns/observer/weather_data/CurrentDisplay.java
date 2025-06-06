package com.mods.orderservice.patterns.observer.weather_data;

import com.mods.orderservice.patterns.observer.aoe2.Observer;

public class CurrentDisplay implements Observer {
    @Override
    public void update() {
        System.out.println("Display current data");
    }
}
