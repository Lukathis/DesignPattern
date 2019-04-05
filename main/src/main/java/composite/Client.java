package composite;

public class Client {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("PANCAKE 1", "P1", true, 1.20));
        pancakeHouseMenu.add(new MenuItem("PANCAKE 2", "P2", true, 2.20));
        pancakeHouseMenu.add(new MenuItem("PANCAKE 3", "P3", false, 3.10));

        dinerMenu.add(new MenuItem("Dinner 1", "D1", false, 8.10));
        dinerMenu.add(new MenuItem("Dinner 2", "D2", false, 9.10));

        cafeMenu.add(new MenuItem("Mocha", "Just Mocha", true, 3.10));
        cafeMenu.add(new MenuItem("Latte", "Just Latte", true, 3.00));
        cafeMenu.add(new MenuItem("Americano", "Just Americano", true, 2.00));

        dessertMenu.add(new MenuItem("RBC", "Red bean cake", true, 3.00));
        dessertMenu.add(new MenuItem("GBC", "Green bean cake", true, 3.00));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
