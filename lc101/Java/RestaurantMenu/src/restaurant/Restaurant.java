package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {


        Menu menu = new Menu();
        MenuItem cheesecake = new MenuItem("cheesecake", 2.90, "cheese and cake", "dessert", false);
        MenuItem spaghetti=new MenuItem("spaghetti", 3.98, "spaghetti and sauce", "main course", false);


        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(cheesecake);

        System.out.println(cheesecake);
        System.out.println(spaghetti);
    }
    

}
