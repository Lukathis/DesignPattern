package strategy.middle;


/**
 * I'm Readhead, looks a little bit different, need to override display
 * But I just fly and quack like ordinary duck
 * Why do I need to override these two methods?! --> fly() and quack()?
 * Why should MallardDuck and I should suffer this?
 */
public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public String display() {
        return "My head is red";
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
