package template;

public class Client {

    public static void main(String[] args) {
        CoffeWithHook coffeeHook = new CoffeWithHook();

        System.out.println("Making coffee...");
        coffeeHook.prepareRecipe();
    }
}
