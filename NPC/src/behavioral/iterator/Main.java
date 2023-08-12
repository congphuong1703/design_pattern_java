package behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Item("Home", "home.html"));
        menu.addItem(new Item("Contact", "contact.html"));
        menu.addItem(new Item("About us", "about-us.html"));

        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
