package com.mods.orderservice.patterns.bridge;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw circle : Green, radius : " + radius + ", x : " + x + ", y : " + y);
    }
}
