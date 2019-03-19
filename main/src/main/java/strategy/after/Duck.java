package strategy.after;


public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        if (fb == null) throw new IllegalArgumentException("FlyBehavior should not be null");
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        if (qb == null) throw new IllegalArgumentException("QuackBehavior should not be null");
        quackBehavior = qb;
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String performFly() {
        return flyBehavior.fly();
    }
}
