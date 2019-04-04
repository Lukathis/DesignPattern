package iterator.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake Item1", "Pancake Item1 description", true, 1.00);
        addItem("Pancake Item2", "Pancake Item2 description", true, 2.00);
        addItem("Pancake Item3", "Pancake Item3 description", true, 3.00);
        addItem("Pancake Item4", "Pancake Item4 description", true, 4.00);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
