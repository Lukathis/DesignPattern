package factory.last;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public String createDough() {
        return "Thin crust dough";
    }

    @Override
    public String createSauce() {
        return "Marinara sauce";
    }

    @Override
    public String createCheese() {
        return "Reggiano cheese";
    }

    @Override
    public String createClam() {
        return "Fresh clams";
    }
}
