package estore;

import dataStructure.MySet;

import java.util.ArrayList;

public class Estore {

    private ArrayList<Seller> sellers;
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;

    public Estore(){
        sellers = new ArrayList<>();
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addSeller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        Seller seller = new Seller(name,homeAddress,emailAddress,phoneNumber,password,age);
        sellers.add(seller);
    }

    public ArrayList<Seller> getSellers() {
        return sellers;
    }

    public Seller findSellerWithSellerPhoneNumber(String phoneNumber) {
        Seller expectedSeller  = null;
        for(Seller seller: sellers)if(phoneNumber.equals(seller.getPhoneNumber())) expectedSeller =  seller;
        return expectedSeller;
    }

    public void addProductToListOfProduct(Product product) {
        this.products.add(product);
    }

    public Product getProducts(String productName) {
        Product expectedProduct = null;
        for(Product product: products) if(productName.equals(product.productName()))expectedProduct = product;
        return expectedProduct;
    }

    public void addCustomer(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        Customer customer = new Customer(name,homeAddress,emailAddress,phoneNumber,password,age);
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
