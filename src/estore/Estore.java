package estore;

import dataStructure.MySet;

import java.util.ArrayList;

public class Estore {

    private ArrayList<Integer> seller;
    public Estore(){
        seller = new ArrayList<>();
    }

    public void addSeller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        User seller = new Seller(name,homeAddress,emailAddress,phoneNumber,password,age);
    }

    public int getNumberOfSeller() {
        return seller.size();
    }
}
