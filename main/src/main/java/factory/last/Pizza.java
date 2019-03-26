package factory.last;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    String clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 min");
    }

    void cut() {
        System.out.println("Cutting");
    }

    void box() {
        System.out.println("Boxing");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}
