package factory.after;

public class Client {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyStore.orderPizza("cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese");
    }
}
