package strategy.instance.Impl;

import strategy.instance.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public String fly() {
        return "Fly with wings";
    }
}
