package strategy.after;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public String fly() {
        return "Powered by rocket";
    }
}
