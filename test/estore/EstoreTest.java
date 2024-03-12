package estore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoreTest {
    @Test
    public void testThatUserCanBeAddedToEstore(){
        Estore estore = new Estore();
        estore.addSeller("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        assertEquals(1,estore.getSellers().size());
    }
    @Test
    public void testThatSellerCanBeFoundBySellerPhoneNumber(){
        Estore estore = new Estore();
        estore.addSeller("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Seller seller = estore.findSellerWithSellerPhoneNumber("09027531222");
            assertEquals(seller,estore.getSellers().get(0));
    }
    @Test
    public void testThatSellerCanAddItemToListOfItem(){
        Estore estore = new Estore();
        estore.addSeller("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Seller seller = estore.findSellerWithSellerPhoneNumber("09027531222");
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        seller.addProduct(estore,product);
        assertEquals(product,estore.getProducts("productName"));

    }

}