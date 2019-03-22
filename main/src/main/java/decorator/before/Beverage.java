package decorator.before;

import excepitons.ArgumentNullException;

public abstract class Beverage {

    protected String description;
    protected boolean milk = false;
    protected boolean soy = false;
    protected boolean mocha = false;
    protected boolean whip = false;

    private static final float MILK_COST = 1.0f;
    private static final float SOY_COST = 1.0f;
    private static final float MOCHA_COST = 1.0f;
    private static final float WHIP_COST = 1.0f;

    public Beverage(String description) {
        if (description == null)
            throw new ArgumentNullException("description should not be null", Beverage.class);

        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public float cost() {
        float condimentCost = 0.0f;
        if (hasMilk()) condimentCost += MILK_COST;
        if (hasSoy()) condimentCost += SOY_COST;
        if (hasMocha()) condimentCost += MOCHA_COST;
        if (hasWhip()) condimentCost += WHIP_COST;
        return condimentCost;
    }
}
