package strategy.before;

/**
 * I'm a rubber yellow duck, cannot quack but squeeze, cannot fly
 * So need to override the quack and fly method.
 */
public class RubberDuck extends Duck {

    @Override
    public String display() {
        return "All yellow";
    }

    @Override
    public String quack() {
        return "I don't quack, I squeeze";
    }

    @Override
    public String fly() {
        /**
         * I'm a rubber duck, cannot fly
         * Should override the fly method and do nothing
         */
        return "";
    }
}
