package strategy.middle;

/**
 * I'm MallardDuck, looks a little bit different, need to override display
 * But I just fly and quack like ordinary duck
 * Why do I need to override these two methods?! --> fly() and quack()?
 * Why should RedheadDuck and I should suffer this?
 */
public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public String display() {
        return "Green head";
    }

    @Override
    public String fly() {
        return "Fly with wings like ordinary duck";
    }

    @Override
    public String quack() {
        return "Quack as ordinary Duck";
    }
}
