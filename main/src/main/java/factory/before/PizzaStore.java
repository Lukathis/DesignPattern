package factory.before;

public class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        /**
         * For this part, all type is hard-coded
         * If there's any new kind of pizza or need to remove some pizza
         * Need to change this trunk in this client.
         *
         * This part of code does not close to modification
         *
         * So this is the "change" part and we should extract them from this part to an independent module
         */
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
