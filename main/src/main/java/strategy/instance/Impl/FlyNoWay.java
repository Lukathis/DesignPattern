package strategy.instance.Impl;

import strategy.instance.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        return "Not be able to fly";
    }
}
