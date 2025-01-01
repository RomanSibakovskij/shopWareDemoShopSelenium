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

}
