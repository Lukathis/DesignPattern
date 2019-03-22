package decorator.before;

public class DarkRoast extends Beverage {

    private static final float EXTRA_COST = 2.90f;

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public float cost() {
        return super.cost() + EXTRA_COST;
    }
}
