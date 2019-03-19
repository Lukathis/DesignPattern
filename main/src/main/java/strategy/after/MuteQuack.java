package strategy.after;

public class MuteQuack implements QuackBehavior {

    @Override
    public String quack() {
        return "Do nothing";
    }
}
