package factory.middle;

import factory.before.CheesePizza;
import factory.before.GreekPizza;
import factory.before.PepperPizza;
import factory.before.Pizza;

public class NYPizzaFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
        } else if (type.equals("veggie")){
            pizza = new NYVeggiePizza();
        }

        return pizza;
    }
}
