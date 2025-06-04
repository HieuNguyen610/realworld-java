package com.mods.orderservice.patterns.observer.weather_data;

import com.mods.orderservice.patterns.observer.aoe2.Observer;
import com.mods.orderservice.patterns.observer.aoe2.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String order) {
        System.out.println("📢 Weather data issues new updates: " + order);
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
