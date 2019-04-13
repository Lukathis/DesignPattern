package strategy.instance;

import strategy.instance.Impl.FlyNoWay;
import strategy.instance.Impl.FlyWithWings;
import strategy.instance.Impl.Quack;
import strategy.instance.Impl.Squeak;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        //Use constructor dependency injection to create different duck instance
        //Which will avoid create lots of inheritance of duck class
        Duck mallardDuck = new Duck( new FlyWithWings(),new Quack());
        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performQuack());

        Duck modelDuck = new Duck(new FlyNoWay(), new Squeak());
        System.out.println(modelDuck.performFly());
        System.out.println(modelDuck.performQuack());


    }
}
