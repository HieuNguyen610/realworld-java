package com.mods.orderservice.patterns.observer.weather_data;

import com.mods.orderservice.patterns.observer.aoe2.Observer;
import io.micrometer.observation.Observation;

public class CurrentStatistic implements Observer {
    @Override
    public void update() {
        System.out.println("Display statistics");
    }
}
