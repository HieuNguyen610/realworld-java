package com.mods.orderservice.patterns.observer.aoe2;

import java.util.ArrayList;
import java.util.List;

public class TownCenter implements Subject {
    private final List<Observer> observers = new ArrayList<>();

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
        System.out.println("📢 Town Center issues order: " + order);
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Issue an order
    public void issueOrder(String order) {
        notifyObservers(order);
    }
}

