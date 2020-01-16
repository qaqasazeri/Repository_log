package restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {


    private ArrayList<MenuItem> items;
    private LocalDateTime lastupdated;


    public Menu() {

        items = new ArrayList<>();
        lastupdated = LocalDateTime.now();

    }

    public void addMenuItem(MenuItem item) {
        System.out.println("Adding new item");
        if (!this.items.contains(item)) {
            this.items.add(item);
            printMenuList();
            this.lastupdated = LocalDateTime.now();
            System.out.println("Last updated after new item added: " + lastupdated);
        }
    }

    public void removeMenuItem(MenuItem item) {
        System.out.println("Removing new item");
        if (this.items.contains(item))
            this.items.remove(item);
           printMenuList();
        this.lastupdated = LocalDateTime.now();
        System.out.println("Last updated after item removed: " + lastupdated);

    }

    public void printMenuList(){

        for(MenuItem menuList:items){
            System.out.println(menuList);
        }
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


    public void printSingleItem(MenuItem singleItem) {
        System.out.println("Printing only "+singleItem);
      if(items.contains(singleItem)){

          System.out.println(singleItem);
      }
    }
}