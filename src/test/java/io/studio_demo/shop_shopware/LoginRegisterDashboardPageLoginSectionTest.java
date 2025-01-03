package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class LoginRegisterDashboardPageLoginSectionTest extends TestMethods{

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

}
