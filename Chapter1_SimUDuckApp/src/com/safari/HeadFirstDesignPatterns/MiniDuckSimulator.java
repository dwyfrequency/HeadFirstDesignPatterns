package com.safari.HeadFirstDesignPatterns;

/**
 * Created by jdwy215 on 12/12/2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        //add rocket flying on the fly
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
