package strategy.after;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public String display() {
        return "My name is MallardDuck";
    }

}
