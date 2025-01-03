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

    //no singular input

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

    //Test 004b -> invalid user account login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login password
        invalidUserAccountNoPasswordLoginTest(loginRegisterDashboardRegisterSectionPage);
    }

    //invalid singular input

    //Test 004c -> invalid user account login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidAccountLoginInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login email
        invalidUserAccountInvalidEmailLoginTest(loginRegisterDashboardRegisterSectionPage);
    }

    //Test 004d -> invalid user account login test - invalid login password
    @Test
    @DisplayName("Invalid User Login Test - Invalid Password")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidAccountLoginInvalidPasswordTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //valid user account creation test
        validUserAccountCreationTest(loginRegisterDashboardRegisterSectionPage);
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login password
        invalidUserAccountInvalidPasswordLoginTest(loginRegisterDashboardRegisterSectionPage);
    }

}
