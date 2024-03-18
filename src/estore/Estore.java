package estore;

import java.util.ArrayList;
import java.util.List;

public class Estore {
    private String name;
    private Admin admin;
    private List<Product> products = new ArrayList<>();
    private ArrayList<Seller> sellers = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addSeller(Seller seller) {
        sellers.add(seller);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Seller findSeller(Seller seller){
        if(seller == null) throw new UserNotfoundException("User Not Found");
        for(Seller seller1: sellers){
            if( seller1 == seller) seller = seller1;
        }
        return seller;
    }

    public ArrayList<Seller> getSellers() {
        return sellers;
    }

    public Product getProducts(String productName) {
        Product expectedProduct = null;
        for(Product product: products){
            if(product.productName().equals(productName)) expectedProduct = product;
        }
        if(expectedProduct == null) throw new ProductNotFoundException("Can't Find Product ");
        return expectedProduct;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.removeIf(product1 -> product1 == product);
    }
    public void removeProduct(String productName) {
        products.removeIf(product1 -> product1.productName().equals(productName));
    }

    public int getListOfProduct() {
        return products.size();
    }

    public int getListCustomers() {
        return customers.size();
    }
}
