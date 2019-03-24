package decorator.after;

public class Whip extends CondimentDecorator {

    private static final String WHIP_NAME = "whip";
    private static final double EXTRA_PRICE = 1.23;

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + WHIP_NAME;
    }

    @Override
    public double cost() {
        return beverage.cost() + EXTRA_PRICE;
    }

}
