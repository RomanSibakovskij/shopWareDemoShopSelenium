package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> navigate to login & register dashboard page test
    @Test
    @DisplayName("Navigate To Login & Register Dashboard Page")
    @Tag("User_Navigation_To_Login_Register_Dashboard")
    void navigateToLoginRegisterDashboardPageTest(){
        HomePage homePage = new HomePage(driver);
        navigateToLoginAndRegisterDashboardPageTest(homePage);
    }
}
