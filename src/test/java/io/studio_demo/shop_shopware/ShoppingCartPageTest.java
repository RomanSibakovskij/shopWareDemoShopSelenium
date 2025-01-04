package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single product addition to check out tests

    //Test 006 -> add 'Free Time & Electronics' product to check out test (as a guest)
    @Test
    @DisplayName("Add 'Free Time & Electronics' Product To Checkout Test (as a guest)")
    @Tag("Add_Singular_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addFreeTimeProductToCheckoutTest(){
        //add 'Free Time & Electronics' product to cart (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out (as a guest)
        addFreeTimeAndElectronicsProductToCheckoutTest();
    }

}
