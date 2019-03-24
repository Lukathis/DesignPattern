package decorator.after;

public class StarbuzzCoffe {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        printBeverageAndCost(espresso);

        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        printBeverageAndCost(beverage);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        printBeverageAndCost(houseBlend);

    }


    public static void printBeverageAndCost(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
