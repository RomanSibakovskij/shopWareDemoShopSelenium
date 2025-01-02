package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class LoginRegisterDashboardPageTest extends TestMethods{

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002a -> valid user account creation test (female)
    @Test
    @DisplayName("Valid User Account Creation Test (female)")
    @Tag("Valid_User_Account_Creation")
    void validFemaleAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test (female)
        validFemaleUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //invalid user account creation tests

    //no singular input

    //Test 002b -> invalid user account creation test - no first name
    @Test
    @DisplayName("Invalid User Account Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no first name
        invalidUserAccountNoFirstNameCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002c -> invalid user account creation test - no last name
    @Test
    @DisplayName("Invalid User Account Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no last name
        invalidUserAccountNoLastNameCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002d -> invalid user account creation test - no email address
    @Test
    @DisplayName("Invalid User Account Creation Test - No Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no email address
        invalidUserAccountNoEmailCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002e -> invalid user account creation test - no password
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no password
        invalidUserAccountNoPasswordCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002f -> invalid user account creation test - no street address
    @Test
    @DisplayName("Invalid User Account Creation Test - No Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoAddressTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no street address
        invalidUserAccountNoAddressCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002g -> invalid user account creation test - no city
    @Test
    @DisplayName("Invalid User Account Creation Test - No City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoCityTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no city
        invalidUserAccountNoCityCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002h -> invalid user account creation test - no postal code (user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Postal Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoPostalCodeTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no postal code
        invalidUserAccountNoPostalCodeCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 002i -> invalid user account creation test - no user country
    @Test
    @DisplayName("Invalid User Account Creation Test - No Country")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoCountryTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no user country
        invalidUserAccountNoCountryCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

}
