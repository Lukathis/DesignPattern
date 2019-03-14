package strategy.before;

public abstract class Duck {

    public abstract String display();

    public String quack() {
        return "Quack as an ordinary duck";
    }

    public String fly() {
        return "Fly with wings like an ordinary duck";
    }
}
