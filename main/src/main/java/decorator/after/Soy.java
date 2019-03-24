package decorator.after;

public class Soy extends CondimentDecorator {

    private final String SOY_NAME = "soy";
    private final double EXTRA_PRICE = 1.00;

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + SOY_NAME;
    }

    @Override
    public double cost() {
        return beverage.cost() + EXTRA_PRICE;
    }
}
