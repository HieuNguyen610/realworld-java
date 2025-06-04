package com.mods.orderservice.patterns.observer.weather_data;

import com.mods.orderservice.patterns.observer.aoe2.Observer;

public class FutureForecast implements Observer {
    @Override
    public void update() {
        System.out.println("Display forecast");
    }
}
