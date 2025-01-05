package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class CheckoutConfirmationPageTest extends TestMethods{

    //single product check out submission confirmation tests (guest and registered user are on the same page after shopping cart)

    //positive valid tests

    //Test 009 -> valid 'Free Time & Electronics' product check out submission confirmation test (as a guest)
    @Test
    @DisplayName("Valid 'Free Time & Electronics' Product Checkout Submission Confirmation Test (as a guest)")
    @Tag("Valid_Singular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void validFreeTimeProductCheckoutConfirmationTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
        //valid 'Free Time & Electronics' product to check out submission confirmation test (as a guest) -> registered user and guest share the same test method
        validOrderCheckoutConfirmationTest();
    }

}
