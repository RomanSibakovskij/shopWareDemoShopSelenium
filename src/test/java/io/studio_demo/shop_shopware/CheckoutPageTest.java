package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //single product check out tests (guest)

    //positive valid tests

    //Test 007 -> valid 'Free Time & Electronics' product check out (shipping address) test (as a guest)
    @Test
    @DisplayName("Valid 'Free Time & Electronics' Product To Checkout Test (shipping address) (as a guest)")
    @Tag("Valid_Singular_Product_To_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Test_As_A_Guest")
    void validFreeTimeProductCheckoutTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
    }

    //negative checkout (shipping address input) tests

    //no singular input

    //Test 007a -> invalid 'Free Time & Electronics' product check out (shipping address) test - no first name (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No First Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoFirstNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no first name (as a guest)
        invalidGuestProductNoFirstNameCheckout();
    }

    //Test 007b -> invalid 'Free Time & Electronics' product check out (shipping address) test - no last name (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No Last Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoLastNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no last name (as a guest)
        invalidGuestProductNoLastNameCheckout();
    }

    //multiple product checkout tests

    //Test 008 -> valid 'Clothing' products to check out (shipping address) test (as a guest)
    @Test
    @DisplayName("Valid 'Clothing' Products To Checkout Test (shipping address) (as a guest)")
    @Tag("Valid_Multiple_Products_To_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Test_As_A_Guest")
    void validClothingProductsCheckoutGuestTest(){
        //add 'Clothing' products to cart (as a guest)
        addClothingProductsToCartTest();
        //add 'Clothing' products to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
    }

}
