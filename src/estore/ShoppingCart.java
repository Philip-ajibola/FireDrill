package estore;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item>items;
    public ShoppingCart(){
        items = new ArrayList<>();
    }
    public void addItemToShoppingList(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
