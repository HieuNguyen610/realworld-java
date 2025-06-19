package com.mods.orderservice.patterns.bridge;

/**
 * bridge pattern: tach biet lop truu tuong khoi cac implementations.
 */
public class Dog extends Animal{

    private int timesADay, amount;
    private String typeOfFood;

    protected Dog(int timesADay, int amount, String typeOfFood, FeedingApi feedingApi) {
        super(feedingApi);
        this.timesADay = timesADay;
        this.amount = amount;
        this.typeOfFood = typeOfFood;
    }

    @Override
    public void feed() {
        feedingApi.feed(timesADay, amount, typeOfFood);
    }
}

class Main {
    public static void main(String[] args) {
        Animal bigDog = new Dog(3, 500, "Thịt bò", new BigDog());
        Animal smallDog = new Dog(2, 250, "Thịt heo", new SmallDog());

        bigDog.feed();
        smallDog.feed();
        System.out.println("-------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
