package com.mods.orderservice.patterns.creational.singleton;

/**
 * problem : create a single instance of class
 * solution: using private constructor and private static variable, method is used to control the creation of object
 * use-case: to ensure that only one object is created for a class
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
