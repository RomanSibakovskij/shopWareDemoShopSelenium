package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class ProductDashboardPageTest extends TestMethods{

    //Test 005 - add 'Free Time & Electronics' product to cart test (as a guest)
    @Test
    @DisplayName("Add 'Free Time & Electronics' Product To Cart Test (as a guest)")
    @Tag("Add_Singular_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addFreeTimeProductToCartTest(){
        //add 'Free Time & Electronics' product to cart (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
    }

}
