package iterator.after;

public class Client {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

        System.out.println("=============Iterable Menu==============");
        NewIterableMenu newIterableMenu = new NewIterableMenu();
        for (MenuItem item : newIterableMenu) {
            System.out.println(item);
        }
    }
}
