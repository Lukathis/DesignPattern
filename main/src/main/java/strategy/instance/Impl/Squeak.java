package strategy.instance.Impl;

import strategy.instance.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public String quack() {
        return "Squeak squeak squeak";
    }
}
