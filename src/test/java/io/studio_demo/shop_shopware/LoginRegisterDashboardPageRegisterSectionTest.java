package io.studio_demo.shop_shopware;

import org.junit.jupiter.api.*;

public class LoginRegisterDashboardPageRegisterSectionTest extends TestMethods{

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

    //Test 002j -> invalid user account creation test - no user state (user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User State")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoStateTest(){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - no user state
        invalidUserAccountNoStateCreationTest(loginRegisterDashboardRegisterSectionPage);
    }

    //too short singular input

    //Test 002k -> invalid user account creation test - too short first name (1 char) (user account has been created - the test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short first name (1 char)
        invalidUserAccountTooShortFirstNameCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002l -> invalid user account creation test - too short last name (3 chars) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short last name (3 chars)
        invalidUserAccountTooShortLastNameCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002m -> invalid user account creation test - too short email (1 char - name and domain) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short email ( 1 char - name, domain)
        invalidUserAccountTooShortEmailCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002n -> invalid user account creation test - too short password (7 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortPasswordTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short password (7 chars)
        invalidUserAccountTooShortPasswordCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002o -> invalid user account creation test - too short address (1 char) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortAddressTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short address (1 char)
        invalidUserAccountTooShortAddressCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002p -> invalid user account creation test - too short city (1 char) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortCityTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short city (1 char)
        invalidUserAccountTooShortCityCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002q -> invalid user account creation test - too short postal code (2 digits) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Postal Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortPostalCodeTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too short postal code (2 digits)
        invalidUserAccountTooShortPostalCodeCreationTest(registerSectionTooShortLongInputPage);
    }

    //too long singular input

    //Test 002r -> invalid user account creation test - too long first name (100 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long first name (100 chars)
        invalidUserAccountTooLongFirstNameCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002s -> invalid user account creation test - too long last name (110 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long last name (110 chars)
        invalidUserAccountTooLongLastNameCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002t -> invalid user account creation test - too long email (100 char - name) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long email (100 chars - name)
        invalidUserAccountTooLongEmailCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002u -> invalid user account creation test - too long password (75 chars) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongPasswordTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long password (75 chars)
        invalidUserAccountTooLongPasswordCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002v -> invalid user account creation test - too long address (100 chars) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongAddressTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long address (100 chars)
        invalidUserAccountTooLongAddressCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002w -> invalid user account creation test - too long city (100 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongCityTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long city (100 chars)
        invalidUserAccountTooLongCityCreationTest(registerSectionTooShortLongInputPage);
    }

    //Test 002x -> invalid user account creation test - too long postal code (50 digits) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Postal Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongPostalCodeTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage = new RegisterSectionTooShortLongInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - too long postal code (50 digits)
        invalidUserAccountTooLongPostalCodeCreationTest(registerSectionTooShortLongInputPage);
    }

    //invalid singular input format

    //Test 002y -> invalid user account creation test - invalid first name format (numbers and special symbols) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid First Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage = new RegisterSectionInvalidSingularInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - invalid first name format (numbers and special symbols)
        invalidUserAccountInvalidFirstNameCreationTest(registerSectionInvalidSingularInputPage);
    }

    //Test 002z -> invalid user account creation test - invalid last name format (numbers and special symbols) (user account has been created - test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Last Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage = new RegisterSectionInvalidSingularInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - invalid last name format (numbers and special symbols)
        invalidUserAccountInvalidLastNameCreationTest(registerSectionInvalidSingularInputPage);
    }

    //Test 002aa -> invalid user account creation test - invalid email address format (missing '@')
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Email Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage = new RegisterSectionInvalidSingularInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - invalid email address format (missing '@')
        invalidUserAccountInvalidEmailFormatCreationTest(registerSectionInvalidSingularInputPage);
    }

    //Test 002ab -> invalid user account creation test - existing email address (already used beforehand)
    @Test
    @DisplayName("Invalid User Account Creation Test - Existing Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Existing_Singular_Input")
    void invalidAccountCreationExistingEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage = new RegisterSectionInvalidSingularInputPage(driver);
        //navigate to login & register dashboard page
        navigateToLoginAndRegisterDashboardPageTest(homePage);
        //invalid user account creation test - existing email address format (already used beforehand)
        invalidUserAccountExistingEmailCreationTest(registerSectionInvalidSingularInputPage);
    }

}
