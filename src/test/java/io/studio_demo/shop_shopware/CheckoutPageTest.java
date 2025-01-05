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

    //Test 007c -> invalid 'Free Time & Electronics' product check out (shipping address) test - no email address (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No Email (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoEmailTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no email (as a guest)
        invalidGuestProductNoEmailCheckout();
    }

    //Test 007d -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest address (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No Address (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoAddressTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no guest address (as a guest)
        invalidGuestProductNoAddressCheckout();
    }

    //Test 007e -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest city (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No City (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoCityTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no guest city (as a guest)
        invalidGuestProductNoCityCheckout();
    }

    //Test 007f -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest postal code (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No Postal Code (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoPostalCodeTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no guest postal code (as a guest)
        invalidGuestProductNoPostalCodeCheckout();
    }

    //Test 007g -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest country / state (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - No Country (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutNoCountryTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - no guest country / state (as a guest)
        invalidGuestProductNoCountryCheckout();
    }

    //too short singular input

    //Test 007h -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short first name (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short First Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortFirstNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short first name (as a guest) (1 char)
        invalidGuestProductTooShortFirstNameCheckout();
    }

    //Test 007i -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short last name (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short Last Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortLastNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short last name (as a guest) (3 chars)
        invalidGuestProductTooShortLastNameCheckout();
    }

    //Test 007j -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short email address (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short Email (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortEmailTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short email address (as a guest) (1 char - name,domain)
        invalidGuestProductTooShortEmailCheckout();
    }

    //Test 007k -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short street address (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short Address (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortAddressTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short street address (as a guest) (1 char)
        invalidGuestProductTooShortAddressCheckout();
    }

    //Test 007l -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short city (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short City (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortCityTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short city (as a guest) (1 char)
        invalidGuestProductTooShortCityCheckout();
    }

    //Test 007m -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short postal code (as a guest) (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Short Postal Code (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooShortPostalCodeTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too short postal code (as a guest) (2 digits)
        invalidGuestProductTooShortPostalCodeCheckout();
    }

    //too short singular input

    //Test 007n -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long first name (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Long First Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooLongFirstNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too long first name (as a guest) (100 chars)
        invalidGuestProductTooLongFirstNameCheckout();
    }

    //Test 007o -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long last name (as a guest)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Long Last Name (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooLongLastNameTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too long last name (as a guest) (110 chars)
        invalidGuestProductTooLongLastNameCheckout();
    }

    //Test 007p -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long email (as a guest)  (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Long Email (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooLongEmailTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too long email address (as a guest) (100 chars - name)
        invalidGuestProductTooLongEmailCheckout();
    }

    //Test 007q -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long street address (as a guest)  (the checkout doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid 'Free Time & Electronics' Product To Checkout Test (shipping address) - Too Long Address (as a guest)")
    @Tag("Invalid_Singular_Product_Checkout")
    @Tag("Shipping_Address_Guest")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidFreeTimeProductCheckoutTooLongAddressTest(){
        //add 'Free Time & Electronics' product to cart test (as a guest)
        addFreeTimeAndElectronicsProductToCartTest();
        //add 'Free Time & Electronics' product to check out test (as a guest)
        addProductToCheckoutTest();
        //invalid 'Free Time & Electronics' product to check out test (shipping address) - too long street address (as a guest) (100 chars)
        invalidGuestProductTooLongAddressCheckout();
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
