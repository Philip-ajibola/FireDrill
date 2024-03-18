package estore;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Item> items;
    private double itemTotalPrice;
    public Order(Customer customer){
        this.customer = customer;
        items = customer.getItems();
    }

    public double calculateAmount(){
        for(Item item: items){
            itemTotalPrice += item.calculateItemAmount();
        }
        return itemTotalPrice;
    }

}
