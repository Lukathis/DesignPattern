package strategy.before;

public class DecoyDuck extends Duck {
    @Override
    public String display() {
        return "Just wood duck";
    }

    @Override
    public String quack() {
        /**
         * I'm a decoy duck, cannot quack
         */
        return "";
    }

    @Override
    public String fly() {
        /**
         * I'm a decoy duck, cannot fly, just stay there quietly
         */
        return "";
    }
}
