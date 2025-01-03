package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class LoginRegisterDashboardPageLoginSectionTest extends TestMethods{

    //valid login / logout tests

    //Test 003 -> valid user account logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout")
    void validAccountLogoutTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
    }

    //Test 004 -> valid user account login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login")
    void validAccountLoginTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
        //valid user login test
        validUserAccountLoginTest(loginRegisterDashboardRegisterSectionPage);
    }

    //invalid logout tests

    //Test 004a -> invalid user account login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login email
        invalidUserAccountNoEmailLoginTest(loginRegisterDashboardRegisterSectionPage);
    }

}
