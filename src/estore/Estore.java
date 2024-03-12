package estore;

import dataStructure.MySet;

import java.util.ArrayList;

public class Estore {

    private ArrayList<Seller> sellers;
    public Estore(){
        sellers = new ArrayList<>();
    }

    public void addSeller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        Seller seller = new Seller(name,homeAddress,emailAddress,phoneNumber,password,age);
        sellers.add(seller);
    }

    public int getNumberOfSeller() {
        return sellers.size();
    }

    public Seller findSellerWithSellerPhoneNumber(String phoneNumber) {
        Seller expectedSeller  = null;
        for(Seller seller: sellers)if(phoneNumber.equals(seller.getPhoneNumber())) expectedSeller =  seller;
        return expectedSeller;
    }
}
