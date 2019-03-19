package strategy.after;

public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        return "Not be able to fly";
    }
}
