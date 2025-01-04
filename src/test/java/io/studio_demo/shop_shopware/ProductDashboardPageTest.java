package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class ProductDashboardPageTest extends TestMethods{

    //singular product addition to cart tests

    //Test 005 -> add 'Free Time & Electronics' product to cart test (as a guest)
    @Test
    @DisplayName("Add 'Free Time & Electronics' Product To Cart Test (as a guest)")
    @Tag("Add_Singular_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addFreeTimeProductToCartTest(){
        //add 'Free Time & Electronics' product to cart (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
    }

    //Test 005a -> remove 'Free Time & Electronics' product from aside shopping cart test (as a guest)
    @Test
    @DisplayName("Remove 'Free Time & Electronics' Product From Aside Cart Test (as a guest)")
    @Tag("Add_Singular_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void removeFreeTimeProductFromAsideCartTest(){
        //remove 'Free Time & Electronics' product from aside shopping cart (as a guest)
        removeFreeTimeAndElectronicsProductFromAsideShoppingCartTest();
    }

    //Test 005b -> add 'Free Time & Electronics' product to cart test (as a registered user)
    @Test
    @DisplayName("Add 'Free Time & Electronics' Product To Cart Test (as a registered user)")
    @Tag("Add_Singular_Product_To_Cart")
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
    }

    // multiple products addition to cart tests

    //Test 005c -> add 'Clothing' products to cart test (as a guest)
    @Test
    @DisplayName("Add 'Clothing' Products To Cart Test (as a guest)")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void addClothingProductsToCartGuestTest(){
        //add 'Clothing' products to cart (as a guest)
        addClothingProductsToCartTest();
    }

}
