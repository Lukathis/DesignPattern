package factory.before;

public class Pizza {

    public String description = "Abstract pizza";

    public void prepare() {

    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }

    @Override
    public String toString() {
        return description;
    }
}
