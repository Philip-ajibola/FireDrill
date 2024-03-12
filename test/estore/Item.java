package estore;

public class Item {
    private Product product;
    private int quantity;
    public Item(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }
}
