package com.mods.orderservice.patterns.bridge;

public abstract class Animal {
    protected FeedingApi feedingApi;
    protected Animal(FeedingApi feedingApi) {
        this.feedingApi = feedingApi;
    }

    public abstract void feed();
}
