package com.mods.orderservice.patterns.bridge;

public interface FeedingApi {
    public void feed(int timesADay, int amount, String typeOfFood);
}

 class BigDog implements FeedingApi {
    @Override
    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Cho con chó lớn ăn " +
                amount + " gam " + typeOfFood +" "+ timesADay + " lần một ngày ");
    }
}

class SmallDog implements FeedingApi {
    @Override
    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Cho con chó small ăn " +
                amount + " gam " + typeOfFood +" "+ timesADay + " lần một ngày ");
    }
}
