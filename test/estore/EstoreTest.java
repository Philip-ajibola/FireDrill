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
    public void testThatSellerCanResetPassword(){
        Seller seller = new Seller("name","10 Yaba road","ajibola@gmail.com","09027531222","password",15);
        seller.resetPassword("password","newPassword");
        assertEquals("newPassword",seller.getPassword());
    }
    @Test
    public void testThatWhenUserWantToResetPasswordWithWrongOldPassword_errorIsThrown(){
        Seller seller = new Seller("name","10 Yaba road","ajibola@gmail.com","09027531222","password",15);
        assertThrows(WrongPasswordException.class,()-> seller.resetPassword("oldPassword","newPassword"));
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
    @Test
    public void testThatSellerCanRemoveProductFromListOfProduct(){
        Estore estore = new Estore();
        estore.addSeller("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Seller seller = estore.findSellerWithSellerPhoneNumber("09027531222");
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        seller.addProduct(estore,product);
        assertEquals(product,estore.getProducts("productName"));
        seller.removeProduct(estore,"productName");
        assertEquals(0,estore.getListOfProduct().size());

    }
    @Test
    public void testThatCustomerCanCreateAccount(){
        Estore estore = new Estore();
        estore.addCustomer("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        assertEquals(1,estore.getCustomers().size());
    }
    @Test
    public void testThatCustomerCanAddItemsToShoppingCart(){
        Customer customer = new Customer("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Item item = new Item(product,2);
        customer.addItemToCart(item);
        assertEquals(1,customer.getItems().size());
    }
    @Test
    public void testThatCustomerCanAddDifferentItemsToShoppingCart(){
        Customer customer = new Customer("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Product product1 = new Product( 1, "productName",30,ProductCategory.GROCERIES,"description");
        Item item = new Item(product,2);
        Item item1 = new Item(product1,6);
        customer.addItemToCart(item);
        customer.addItemToCart(item1);
        assertEquals(2,customer.getItems().size());
    }
    @Test
    public void testThatCustomerCanRemoveItemFromShoppingCart(){
        Customer customer = new Customer("name","10 Yaba road","ajibola@gmail.com","09027531222","passwword",15);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Product product1 = new Product( 1, "productName",30,ProductCategory.GROCERIES,"description");
        Item item = new Item(product,2);
        Item item1 = new Item(product1,6);
        customer.addItemToCart(item);
        customer.addItemToCart(item1);
        customer.removeItem(item);
        assertEquals(1,customer.getItems().size());
    }

}