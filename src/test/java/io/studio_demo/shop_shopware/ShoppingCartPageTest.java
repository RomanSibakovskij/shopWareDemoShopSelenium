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
        addProductToCheckoutTest();
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

    //Test 006b -> add 'Free Time & Electronics' product to check out test (as a registered user)
    @Test
    @DisplayName("Add 'Free Time & Electronics' Product To Checkout Test (as a registered user)")
    @Tag("Add_Singular_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addFreeTimeProductToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //add 'Free Time & Electronics' product to cart (as a registered user)
        addFreeTimeAndElectronicsProductToCartRegUserTest();
        //add 'Free Time & Electronics' product to check out test (as a registered user)
        addProductToCheckoutRegUserTest();
    }

    //multiple products addition to check out tests

    //Test 006c -> add 'Clothing' products to check out test (as a guest)
    @Test
    @DisplayName("Add 'Clothing' Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addClothingProductsToCartGuestTest(){
        //add 'Clothing' products to cart (as a guest)
        addClothingProductsToCartTest();
        //add 'Clothing' products to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 006d -> add 'Clothing' products to check out test (as a registered user)
    @Test
    @DisplayName("Add 'Clothing' Products To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void addClothingProductsToCartRegisteredUserTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //add 'Clothing' products to cart (as a registered user)
        addClothingProductsToCartRegUserTest();
        //add 'Clothing' products to check out test (as a registered user)
        addProductToCheckoutRegUserTest();
    }

}
