package strategy.instance.Impl;

import strategy.instance.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        return "Quack quack quack";
    }
}
