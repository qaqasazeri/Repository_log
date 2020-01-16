package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {


        Menu menu = new Menu();
        MenuItem cheesecake = new MenuItem("cheesecake", 2.90, "cheese and cake", "dessert", false);
        MenuItem spaghetti = new MenuItem("spaghetti", 3.98, "spaghetti and sauce", "main course", false);
        MenuItem nachos = new MenuItem("nachos", 7.78, "nachos", "entree", true);

        menu.addMenuItem(cheesecake);

        menu.addMenuItem(spaghetti);

        menu.addMenuItem(nachos);


       //Printing single menu item
        menu.printSingleItem(cheesecake);


       // Delete from menu and print menu

       menu.removeMenuItem(spaghetti);

        for (MenuItem menuList : menu.getItems()) {

            System.out.println(menuList);
        }


    }

}
