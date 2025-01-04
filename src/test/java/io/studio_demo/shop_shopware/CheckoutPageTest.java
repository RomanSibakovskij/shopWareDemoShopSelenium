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
