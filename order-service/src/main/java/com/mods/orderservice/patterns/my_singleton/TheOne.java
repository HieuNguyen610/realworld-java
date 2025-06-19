package com.mods.orderservice.patterns.my_singleton;

/**
 * 3 ways to create thread safe singleton:
 * 1. synchronized ( not optimized but work)
 * 2. early initialization ( work but not optimized)
 * 3. double check (work but need more check, requires java 1.4+)
 */
public class TheOne {
    private TheOne(){
        System.out.println("Create instance");
    }

    /**
     * volatile: make sure the instance is accessed by only one thread
     * synchronized: make sure the instance is accessed by only one thread but it 's redundant after the first
     * early initialization: make sure the instance is created once but at cost of initialization first
     */
    private volatile static TheOne instance;

    /**
     * double check to make sure only synchronized once when instance is created.
     * @return
     */
    public static TheOne getInstance(){
        if(instance == null){
            synchronized (TheOne.class) {
                if (instance == null) {
                    instance = new TheOne();
                }
            }
        }
        return instance;
    }
}

class TestSingleton {

    public static void main(String[] args) {
        TheOne one = TheOne.getInstance();
        TheOne two = TheOne.getInstance();
        System.out.println(one == two);
    }
}


