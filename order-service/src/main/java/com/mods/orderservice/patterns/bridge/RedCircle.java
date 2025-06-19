package com.mods.orderservice.patterns.bridge;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw circle : Red, radius : " + radius + ", x : " + x + ", y : " + y);
    }
}
