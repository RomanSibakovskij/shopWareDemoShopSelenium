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
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addFreeTimeAndElectronicsProductToCheckoutTest();
    }

    //Test 006a -> remove 'Free Time & Electronics' product from shopping cart page test (as a guest)
    @Test
    @DisplayName("Remove 'Free Time & Electronics' Product From Shopping Cart Page Test (as a guest)")
    @Tag("Remove_Singular_Product_From_Shopping_Cart")
    @Tag("Test_As_A_Guest")
    void removeFreeTimeProductFromCartTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //remove 'Free Time & Electronics' product from shopping cart page test (as a guest)
        removeFreeTimeAndElectronicsProductFromCartPageTest();
    }

}
