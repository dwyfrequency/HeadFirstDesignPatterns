package com.safari.HeadFirstDesignPatterns;

/**
 * Created by jdwy215 on 12/12/2017.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}
