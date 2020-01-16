package restaurant;

public class MenuItem {

    private String name;

    private double price;

    private String description;

    private String category;

    private boolean isNew;


    public MenuItem(String name, double price, String description, String category, boolean isNew) {

        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
   }
@Override
    public String toString() {
        return "name: " +this.name + "; description:(" + this.description + ")" +
                "; price: $"+this.price + "; category: "+this.category+ "; new item: "+isNew;
    }


}
