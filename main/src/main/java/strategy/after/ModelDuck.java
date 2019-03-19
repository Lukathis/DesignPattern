package strategy.after;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Quack();
    }

    public String display() {
        return "Model Duck";
    }
}
