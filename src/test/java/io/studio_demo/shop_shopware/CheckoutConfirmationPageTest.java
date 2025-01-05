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

    //Test 009a -> valid 'Free Time & Electronics' product check out submission confirmation test  (as a registered user)
    @Test
    @DisplayName("Valid 'Free Time & Electronics' Product Checkout Submission Confirmation Test (as a registered user)")
    @Tag("Valid_Singular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void validFreeTimeProductCheckoutConfirmationRegUserTest(){
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
        //valid 'Free Time & Electronics' product to check out submission confirmation test (as a guest) -> registered user and guest share the same test method
        validOrderCheckoutConfirmationTest();
    }

    //multiple products check out submission confirmation tests (guest and registered user are on the same page after shopping cart)

    //Test 009b -> valid 'Clothing' products check out submission confirmation test (as a guest)
    @Test
    @DisplayName("Valid 'Clothing' Products Checkout Submission Confirmation Test (as a guest)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void validClothingProductsCheckoutConfirmationTest(){
        //add 'Clothing' products to cart (as a guest)
        addClothingProductsToCartTest();
        //add 'Clothing' products to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
        //valid 'Free Time & Electronics' product to check out submission confirmation test (as a guest) -> registered user and guest share the same test method
        validOrderCheckoutConfirmationTest();
    }

    //Test 009c -> valid 'Clothing' products check out submission confirmation test (as a registered user)
    @Test
    @DisplayName("Valid 'Clothing' Products Checkout Submission Confirmation Test (as a registered user)")
    @Tag("Valid_Multiple_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void validClothingProductsCheckoutConfirmationRegUserTest(){
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
        //valid 'Free Time & Electronics' product to check out submission confirmation test (as a guest) -> registered user and guest share the same test method
        validOrderCheckoutConfirmationTest();
    }

    //negative checkout confirmation test

    //Test 009d -> invalid 'Free Time & Electronics' product check out submission confirmation test - don't click 'Terms and Conditions' checkbox (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product Checkout Submission Confirmation Test - No Agree to Terms (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutConfirmationNoTermsTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
        //invalid 'Free Time & Electronics' product to check out submission confirmation test - don't click 'Terms and Conditions' checkbox (as a guest) -> registered user will have the same output so only guest is tested
        invalidOrderCheckoutConfirmationNoAgreeToTermsTest();
    }

    //Test 009e -> invalid 'Free Time & Electronics' product check out submission confirmation test - don't click 'Terms and Conditions' checkbox (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product Checkout Submission Confirmation Test - Remove Product Before Confirmation (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutConfirmationRemoveProductTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //valid 'Free Time & Electronics' product to check out test (shipping address) (as a guest)
        validGuestProductCheckout();
        //invalid 'Free Time & Electronics' product to check out submission confirmation test - remove product before order confirmation (as a guest) -> registered user will have the same output so only guest is tested
        invalidOrderCheckoutConfirmationRemoveFreeTimeProductTest();
    }

}
