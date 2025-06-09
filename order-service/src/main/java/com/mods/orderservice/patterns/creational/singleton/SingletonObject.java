package com.mods.orderservice.patterns.creational.singleton;

import lombok.Getter;

public class SingletonObject {

    /**
     * -- GETTER --
     *  get instance
     *
     * @return
     */
    @Getter
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

}
