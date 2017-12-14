package com.safari.HeadFirstDesignPatterns;

/**
 * Created by jdwy215 on 12/12/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
