package strategy.instance;


public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    //Use Constructor to inject dependency
    public Duck(FlyBehavior fb, QuackBehavior qb){
        flyBehavior = fb;
        quackBehavior = qb;
    }

    //Use setter injection also works (Need investigate why constructor is better than setter
//    public void setFlyBehavior(FlyBehavior fb) {
//        if (fb == null) throw new IllegalArgumentException("FlyBehavior should not be null");
//        flyBehavior = fb;
//    }
//
//    public void setQuackBehavior(QuackBehavior qb) {
//        if (qb == null) throw new IllegalArgumentException("QuackBehavior should not be null");
//        quackBehavior = qb;
//    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String performFly() {
        return flyBehavior.fly();
    }
}
