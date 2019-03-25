package factory.middle;

import factory.before.Pizza;

public class Client {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println(cheese);

        SimplePizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        Pizza nyVeggie = nyStore.orderPizza("veggie");
        System.out.println(nyVeggie);

        SimplePizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        Pizza chicagoVeggie = chicagoStore.orderPizza("veggie");
        System.out.println(chicagoVeggie);

    }
}
