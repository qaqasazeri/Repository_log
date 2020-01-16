package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> items;
    private LocalDate lastupdated;


    public Menu(){

        items=new ArrayList<>();
        lastupdated= LocalDate.now();

    }

    public void setItems(ArrayList<MenuItem>items){
        this.items=items;
    }
    public  ArrayList<MenuItem> getItems(){
        return items;
    }
}

