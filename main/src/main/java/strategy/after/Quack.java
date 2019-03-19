package strategy.after;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        return "Quack quack quack";
    }
}
