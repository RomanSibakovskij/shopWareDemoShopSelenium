package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //single product check out tests

    //positive valid tests

    //Test 007 -> valid 'Free Time & Electronics' product check out test (as a guest)
    @Test
    @DisplayName("Valid 'Free Time & Electronics' Product To Checkout Test (as a guest)")
    @Tag("Valid_Singular_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void validFreeTimeProductCheckoutTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (as a guest)
        validGuestProductCheckout();
    }

}
