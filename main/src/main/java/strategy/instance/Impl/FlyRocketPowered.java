package strategy.instance.Impl;

import strategy.instance.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public String fly() {
        return "Powered by rocket";
    }
}
