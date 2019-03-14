package strategy.middle;

public class DecoyDuck extends Duck {

    /**
     * Just DecoyDuck no need to implement either Flyable or Quackable
     */

    @Override
    public String display() {
        return "Just wood duck";
    }

}
