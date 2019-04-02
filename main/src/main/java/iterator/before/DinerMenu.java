package iterator.before;

public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Diner 1", "Diner 1 description", true, 1.10);
        addItem("Diner 2", "Diner 2 description", true, 2.10);
        addItem("Diner 3", "Diner 3 description", true, 3.10);
        addItem("Diner 4", "Diner 4 description", true, 4.10);
        addItem("Diner 5", "Diner 5 description", true, 5.10);
        addItem("Diner 6", "Diner 6 description", true, 6.10);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
