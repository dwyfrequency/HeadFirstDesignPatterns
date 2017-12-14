package com.safari.HeadFirstDesignPatterns;

/**
 * Created by jdwy215 on 12/12/2017.
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
