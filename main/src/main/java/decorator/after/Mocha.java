package decorator.after;

public class Mocha extends CondimentDecorator {

    private static final String MOCHA_NAME = "Mocha";
    private static final double EXTRA_PRICE = 0.20;

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + MOCHA_NAME;
    }

    public double cost() {
        return beverage.cost() + EXTRA_PRICE;
    }
}
