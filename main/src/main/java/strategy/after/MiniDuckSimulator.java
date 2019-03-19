package strategy.after;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println(mallard.performQuack());
        System.out.println(mallard.performFly());

        Duck modelDuck = new ModelDuck();
        System.out.println(modelDuck.performQuack());
        System.out.println(modelDuck.performFly());
    }
}
