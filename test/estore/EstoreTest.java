package estore;

import estore.Exception.InValidCardType;
import estore.Exception.WrongPasswordException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoreTest {
    private  Admin admin;
    private Address adminAddress;
    @BeforeEach
    public void creatingAdmin(){
        admin = new Admin("name",adminAddress,"ajibola@gmail.com","09027531222","passwword",15);
        adminAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
    }
    @Test
    public void testThatUserCanBeAddedToEstore(){
        Estore estore = new Estore();
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","passwword",15);
        admin.addSeller(seller,estore);
        assertEquals(1,estore.getSellers().size());
    }
    @Test
    public void testThatSellerCanBeFoundBySellerPhoneNumber(){
        Estore estore = new Estore();
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","passwword",15);

        admin.addSeller(seller,estore);
        Seller sellerExpected = admin.findSeller(seller,estore);
            assertEquals(seller,sellerExpected);
    }
    @Test
    public void testThatSellerCanResetPassword(){
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","password",15);

        seller.resetPassword("password","newPassword");
        assertEquals("newPassword",seller.getPassword());
    }
    @Test
    public void testThatWhenUserWantToResetPasswordWithWrongOldPassword_errorIsThrown(){
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");

        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","password",15);
        assertThrows(WrongPasswordException.class,()-> seller.resetPassword("oldPassword","newPassword"));
    }
    @Test
    public void testThatSellerCanAddItemToListOfItem(){
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Estore estore = new Estore();
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","password",15);

        Seller seller1 = estore.findSeller(seller);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        seller.addProduct(admin,product,estore);
        assertEquals(product,estore.getProducts("productName"));

    }
    @Test
    public void testThatWhenProductDoesNotExistInProductListExceptionIsThrown(){
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Estore estore = new Estore();
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","password",15);

        Seller seller1 = estore.findSeller(seller);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        seller.addProduct(admin,product,estore);
        assertThrows(ProductNotFoundException.class,()->admin.getProducts("productname",estore));

    }
    @Test
    public void testThatSellerCanRemoveProductFromListOfProduct(){
        Address sellerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Estore estore = new Estore();
        Seller seller = new Seller("name",sellerAddress,"ajibola@gmail.com","09027531222","password",15);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        seller.addProduct(admin,product,estore);
        assertEquals(product,estore.getProducts("productName"));
        seller.removeProduct(admin,"productName",estore);
        assertEquals(0,estore.getListOfProduct());

    }
    @Test
    public void testThatCustomerCanCreateAccount(){
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        Estore estore = new Estore();
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);
        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","passwword",15,billingFormat);
        admin.addCustomer(customer,estore);
        assertEquals(1,estore.getListCustomers());
    }
    @Test
    public void testThatWhenCustomerWantToResetPasswordWithWrongOldPassword_errorIsThrown(){
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");

        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);

        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","password",15,billingFormat);
        assertThrows(WrongPasswordException.class,()-> customer.resetPassword("oldPassword","newPassword"));
    }
    @Test
    public void testThatCustomerCanAddItemsToShoppingCart(){
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);
        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","passwword",15,billingFormat);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Item item = new Item(product,2);
        customer.addItemToCart(item);
        assertEquals(1,customer.getItems().size());
    }
    @Test
    public void testThatCustomerCanAddDifferentItemsToShoppingCart(){
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);
        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","passwword",15,billingFormat);
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
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);
        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","passwword",15,billingFormat);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Product product1 = new Product( 1, "productName",30,ProductCategory.GROCERIES,"description");
        Item item = new Item(product,2);
        Item item1 = new Item(product1,6);
        customer.addItemToCart(item);
        customer.addItemToCart(item1);
        customer.removeItem(item);
        assertEquals(1,customer.getItems().size());
    }
    @Test
    public void testThatCustomerCanPayForTheItemsTheyOrderFor(){
        Address customerAddress = new Address("Ikeja","Nigeria","23","yaba","Lagos");
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
        BillingFormat billingFormat = new BillingFormat("phoneNumber","name",customerAddress,creditCardInformation);

        Customer customer = new Customer("name",customerAddress,"ajibola@gmail.com","09027531222","passwword",15,billingFormat);
        Product product = new Product( 1, "productName",45.0,ProductCategory.ELECTRONICS,"description");
        Product product1 = new Product( 1, "productName",30,ProductCategory.GROCERIES,"description");
        Item item = new Item(product,2);
        Item item1 = new Item(product1,6);
        customer.addItemToCart(item);
        customer.addItemToCart(item1);
        Order order = new Order(customer);
        assertEquals(2,customer.getItems().size());
        assertEquals(270,customer.order(order));
    }
    @Test
    public void testThatWhenInValidCardIsUsedExceptionISThrown(){
        assertThrows(InValidCardType.class,()-> new CreditCardInformation("ccV","7132456378124356"));
    }
    @Test
    public void testThatIfTheLengthOfTheCardNumberIsNot13Or16ErrorIsThrown(){
        assertThrows(InValidCardType.class,()-> new CreditCardInformation("ccV","45637812435678"));
        CreditCardInformation creditCardInformation = new CreditCardInformation("ccV","4132456378124356");
    }


}