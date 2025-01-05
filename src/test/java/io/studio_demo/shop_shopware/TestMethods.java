package io.studio_demo.shop_shopware;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //user navigation to login & register dashboard page test method
    protected void navigateToLoginAndRegisterDashboardPageTest(HomePage homePage){
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Accept Technical Cookies' button
        homePage.clickAcceptTechnicalCookies();
        //capture screenshot of the homepage before navigation
        captureScreenshot(driver, "HomePage Before Navigation To Login And Register Dashboard Page");
        //click 'User Account' dropdown menu
        homePage.clickUserAccountDropdownMenu();
        //click 'Sign Up' link
        homePage.clickSignUpLink();
        //assert the user gets onto login and register dashboard page
        assertEquals("I'm a customer already!", loginRegisterDashBoardLoginSectionPage.getLoginTitle(), "The login section title doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "User Navigation To Login And Register Dashboard Page Result");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test method
    protected void validUserAccountCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //valid user register input data getter
        loginRegisterDashboardRegisterSectionPage.getValidUserInputData();
        //capture screenshot before valid data input
        captureScreenshot(driver, "Valid User Account Creation Before Data Input");
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after valid data input
        captureScreenshot(driver, "Valid Male User Account Creation Data Input");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert user gets onto account overview
        assertEquals("Overview", accountOverviewPage.getAccountOverviewTitle(), "The account overview page title doesn't match expectations");
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //account overview web element assert
        isAccountOverviewPageWebElementDisplayed();
        //account overview page text element assert
        isAccountOverviewPageTextElementAsExpected();
        //log user account displayed data
        logAccountOverviewData();
        //capture screenshot after valid user account creation
        captureScreenshot(driver, "Valid Male User Account Creation Test Result");
    }
    //valid user account creation test method (female)
    protected void validFemaleUserAccountCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //valid user register input data getter
        loginRegisterDashboardRegisterSectionPage.getValidUserInputData();
        //capture screenshot before valid data input
        captureScreenshot(driver, "Valid User Account Creation Before Data Input");
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mrs.' option
        loginRegisterDashboardRegisterSectionPage.selectMrsSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after valid data input
        captureScreenshot(driver, "Valid Female User Account Creation Data Input");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert user gets onto account overview
        assertEquals("Overview", accountOverviewPage.getAccountOverviewTitle(), "The account overview page title doesn't match expectations");
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //account overview web element assert
        isAccountOverviewPageWebElementDisplayed();
        //account overview page text element assert
        isAccountOverviewPageTextElementAsExpected();
        //log user account displayed data
        logAccountOverviewData();
        //capture screenshot after valid user account creation
        captureScreenshot(driver, "Valid Female User Account Creation Test Result");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    //invalid user creation tests

    //no singular input

    //invalid user creation test method - no first name (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoFirstNameCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no first name)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoFirstNameData();
        //capture screenshot before invalid data input
        captureScreenshot(driver, "Invalid User Account Creation Before Data Input");
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //don't input first name
        loginRegisterDashboardRegisterSectionPage.inputNoFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - No First Name");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no first name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No First Name");
    }
    //invalid user creation test method - no last name (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoLastNameCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no last name)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoLastNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //don't input last name
        loginRegisterDashboardRegisterSectionPage.inputNoLastNameIntoLastNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Last Name");
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no last name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Last Name");
    }
    //invalid user creation test method - no email address (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoEmailCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no email address)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoEmailAddressData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //don't input email address
        loginRegisterDashboardRegisterSectionPage.inputNoEmailIntoEmailInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Email Address");
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no email address)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Email Address");
    }
    //invalid user creation test method - no password (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoPasswordCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no password)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoPasswordData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //don't input password
        loginRegisterDashboardRegisterSectionPage.inputNoPasswordIntoPasswordInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Password");
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no password)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Password");
    }
    //invalid user creation test method - no street address (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoAddressCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no street address)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoAddressData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //don't input address
        loginRegisterDashboardRegisterSectionPage.inputNoAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Street Address");
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no street address)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Street Address");
    }
    //invalid user creation test method - no city (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoCityCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no city)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoCityData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //don't input city
        loginRegisterDashboardRegisterSectionPage.inputNoCityIntoCityInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No City");
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no city)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No City");
    }
    //invalid user creation test method - no postal code (the form has no input display errors so the screenshots are being used as proof of the test run) (user account gets created)
    protected void invalidUserAccountNoPostalCodeCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (no postal code)
        loginRegisterDashboardRegisterSectionPage.getInvalidUserInputNoPostalCodeData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //don't input postal code
        loginRegisterDashboardRegisterSectionPage.inputNoPostalCodeIntoPostCodeInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Postal Code");
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no postal code)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Postal Code");
    }
    //invalid user account creation test method - no user country (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoCountryCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //valid user register input data getter
        loginRegisterDashboardRegisterSectionPage.getValidUserInputData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No Country");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no country)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Country");
    }
    //invalid user account creation test method - no user state (the form has no input display errors so the screenshots are being used as proof of the test run) (user account gets created)
    protected void invalidUserAccountNoStateCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //valid user register input data getter
        loginRegisterDashboardRegisterSectionPage.getValidUserInputData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        loginRegisterDashboardRegisterSectionPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        loginRegisterDashboardRegisterSectionPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        loginRegisterDashboardRegisterSectionPage.inputEmailIntoEmailInputField();
        //input valid password
        loginRegisterDashboardRegisterSectionPage.inputPasswordIntoPasswordInputField();
        //input valid address
        loginRegisterDashboardRegisterSectionPage.inputAddressIntoAddressInputField();
        //input valid city
        loginRegisterDashboardRegisterSectionPage.inputCityIntoCityInputField();
        //input valid postal code
        loginRegisterDashboardRegisterSectionPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - No State");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (no state)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No State");
    }

    //too short singular input

    //invalid user creation test method - too short first name (1 char) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortFirstNameCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short first name - 1 char)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortFirstNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input too short first name (1 char)
        registerSectionTooShortLongInputPage.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short First Name");
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short First Name");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short first name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short First Name");
    }
    //invalid user creation test method - too short last name (3 chars) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortLastNameCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short first name - 3 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortLastNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input too short last name (3 chars)
        registerSectionTooShortLongInputPage.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short Last Name");
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short Last Name");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short last name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Last Name");
    }
    //invalid user creation test method - too short email (1 char - name and domain) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortEmailCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short email - 1 char - name and domain)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortEmailData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input too short email address (1 char - name and domain)
        registerSectionTooShortLongInputPage.inputTooShortEmailIntoEmailInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short Email");
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short Email");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short email)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Email");
    }
    //invalid user creation test method - too short password (7 chars) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortPasswordCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short password - 7 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortPasswordData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input too short password (7 chars)
        registerSectionTooShortLongInputPage.inputTooShortPasswordIntoPasswordInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short Password");
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short Password");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short password)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Password");
    }
    //invalid user creation test method - too short address (1 char) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortAddressCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short address - 1 char)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortAddressData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input too short address (1 char)
        registerSectionTooShortLongInputPage.inputTooShortAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short Address");
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short Address");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short address)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Address");
    }
    //invalid user creation test method - too short city (1 char) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortCityCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short city - 1 char)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortCityData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input too short city (1 char)
        registerSectionTooShortLongInputPage.inputTooShortCityIntoCityInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short City");
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short City");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short city)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short City");
    }
    //invalid user creation test method - too short postal code (2 digits) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooShortPostalCodeCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short postal code - 2 digits)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooShortPostalCodeData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input too short postal code (2 digits)
        registerSectionTooShortLongInputPage.inputTooShortPostalCodeIntoPostCodeInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Short Postal Code");
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Short Postal Code");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too short postal code)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Postal Code");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //too long singular input tests

    //invalid user creation test method - too long first name (100 chars)
    protected void invalidUserAccountTooLongFirstNameCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too short first name - 100 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongFirstNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input too long first name (100 chars)
        registerSectionTooShortLongInputPage.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long First Name");
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long First Name");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert the expected error is displayed
        assertEquals("Unfortunately, something went wrong.", registerSectionTooShortLongInputPage.getAccountCreationErrorText(), "The account creation error text doesn't match expectations");
        //capture screenshot after invalid user account creation (too long first name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long First Name");
    }
    //invalid user creation test method - too long last name (110 chars)
    protected void invalidUserAccountTooLongLastNameCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long last name - 110 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongLastNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input too long last name (110 chars)
        registerSectionTooShortLongInputPage.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long Last Name");
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long Last Name");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert the expected error is displayed
        assertEquals("Unfortunately, something went wrong.", registerSectionTooShortLongInputPage.getAccountCreationErrorText(), "The account creation error text doesn't match expectations");
        //capture screenshot after invalid user account creation (too long last name)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Last Name");
    }
    //invalid user creation test method - too long email (100 chars - name) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooLongEmailCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long email - 100 chars - name)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongEmailData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input too long email address (100 chars - name)
        registerSectionTooShortLongInputPage.inputTooLongEmailIntoEmailInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long Email");
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long Email");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too long email)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Email");
    }
    //invalid user creation test method - too short password (75 chars) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooLongPasswordCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long password - 75 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongPasswordData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input too long password (75 chars)
        registerSectionTooShortLongInputPage.inputTooLongPasswordIntoPasswordInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long Password");
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long Password");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too long password)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Password");
    }
    //invalid user creation test method - too long address (100 chars) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooLongAddressCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long address - 100 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongAddressData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input too long address (100 chars)
        registerSectionTooShortLongInputPage.inputTooLongAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long Address");
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long Address");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too long address)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Address");
    }
    //invalid user creation test method - too long city (100 chars)
    protected void invalidUserAccountTooLongCityCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long city - 100 chars)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongCityData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input too long city (100 chars)
        registerSectionTooShortLongInputPage.inputTooLongCityIntoCityInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long City");
        //input valid postal code
        registerSectionTooShortLongInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long City");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert the expected error is displayed
        assertEquals("Unfortunately, something went wrong.", registerSectionTooShortLongInputPage.getAccountCreationErrorText(), "The account creation error text doesn't match expectations");
        //capture screenshot after invalid user account creation (too long city)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long City");
    }
    //invalid user creation test method - too short postal code (50 digits) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountTooLongPostalCodeCreationTest(RegisterSectionTooShortLongInputPage registerSectionTooShortLongInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (too long postal code - 50 digits)
        registerSectionTooShortLongInputPage.getInvalidUserInputTooLongPostalCodeData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionTooShortLongInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionTooShortLongInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionTooShortLongInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionTooShortLongInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionTooShortLongInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionTooShortLongInputPage.inputCityIntoCityInputField();
        //input too long postal code (50 digits)
        registerSectionTooShortLongInputPage.inputTooLongPostalCodeIntoPostCodeInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Too Long Postal Code");
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Too Long Postal Code");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (too long postal code)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Postal Code");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //invalid singular input format tests

    //invalid user creation test method - invalid first name format (numbers and special symbols) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidFirstNameCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid first name format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidFirstNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input invalid first name format (numbers and special symbols)
        registerSectionInvalidSingularInputPage.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid First Name Format");
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input valid email address
        registerSectionInvalidSingularInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid First Name Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid first name format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid First Name Format");
    }
    //invalid user creation test method - invalid last name format (numbers and special symbols) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidLastNameCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid last name format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidLastNameData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input invalid last name format (numbers and special symbols)
        registerSectionInvalidSingularInputPage.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid Last Name Format");
        //input valid email address
        registerSectionInvalidSingularInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid Last Name Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid last name format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Last Name Format");
    }
    //invalid user creation test method - invalid email address format (missing '@') (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidEmailFormatCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid email address format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidEmailFormatData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input invalid email address format (missing '@')
        registerSectionInvalidSingularInputPage.inputInvalidEmailFormatIntoEmailInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid Email Format");
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid Email Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid email address format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Email Format");
    }
    //invalid user creation test method - existing email address format (used before in manual testing)
    protected void invalidUserAccountExistingEmailCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (existing email address)
        registerSectionInvalidSingularInputPage.getInvalidUserInputExistingEmailData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input existing email address (the one used in manual testing)
        registerSectionInvalidSingularInputPage.inputExistingEmailIntoEmailInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Existing Email");
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Existing Email");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //assert the expected error is displayed
        assertEquals("This email address has already been registered.", registerSectionInvalidSingularInputPage.getUsedEmailErrorText(), "The already used email error text doesn't match expectations");
        //capture screenshot after invalid user account creation (existing email address)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Existing Email");
    }
    //invalid user creation test method - invalid address format (special symbols only) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidAddressFormatCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid address format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidAddressFormatData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input valid email
        registerSectionInvalidSingularInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input invalid address format (special symbols only)
        registerSectionInvalidSingularInputPage.inputInvalidAddressFormatIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid Address Format");
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid Address Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid address format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Address Format");
    }
    //invalid user creation test method - invalid city format (special symbols only) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidCityFormatCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid city format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidCityFormatData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input valid email
        registerSectionInvalidSingularInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input invalid city format (special symbols only)
        registerSectionInvalidSingularInputPage.inputInvalidCityFormatIntoCityInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid City Format");
        //input valid postal code
        registerSectionInvalidSingularInputPage.inputPostalCodeIntoPostCodeInputField();
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid City Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid city format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid City Format");
    }
    //invalid user creation test method - invalid postal code format (special symbols only) (the form has no input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountInvalidPostalCodeFormatCreationTest(RegisterSectionInvalidSingularInputPage registerSectionInvalidSingularInputPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user register input data getter (invalid postal code format)
        registerSectionInvalidSingularInputPage.getInvalidUserInputInvalidPostalCodeFormatData();
        //click 'Salutations' dropdown menu
        loginRegisterDashboardRegisterSectionPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        loginRegisterDashboardRegisterSectionPage.selectMrSalutation();
        //input valid first name
        registerSectionInvalidSingularInputPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name
        registerSectionInvalidSingularInputPage.inputLastNameIntoLastNameInputField();
        //input valid email
        registerSectionInvalidSingularInputPage.inputEmailIntoEmailInputField();
        //input valid password
        registerSectionInvalidSingularInputPage.inputPasswordIntoPasswordInputField();
        //input valid address
        registerSectionInvalidSingularInputPage.inputAddressIntoAddressInputField();
        //input valid city
        registerSectionInvalidSingularInputPage.inputCityIntoCityInputField();
        //input invalid postal code format (special symbols only)
        registerSectionInvalidSingularInputPage.inputInvalidPostalCodeFormatIntoPostCodeInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account Creation - Invalid Postal Code Format");
        //click country dropdown method
        loginRegisterDashboardRegisterSectionPage.clickCountryDropdownMenu();
        //select 'United States' option
        loginRegisterDashboardRegisterSectionPage.selectUSOption();
        //click state dropdown menu (appears after country selection)
        loginRegisterDashboardRegisterSectionPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        loginRegisterDashboardRegisterSectionPage.selectIllinoisOption();
        //capture screenshot after invalid data input
        captureScreenshot(driver, "Invalid Male User Account Creation Data Input - Invalid Postal Code Format");
        //click 'Continue' button
        loginRegisterDashboardRegisterSectionPage.clickContinueButton();
        //capture screenshot after invalid user account creation (invalid postal code format)
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Postal Code Format");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid logout test method
    protected void userLogoutTest(){
        HomePage homePage = new HomePage(driver);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //account overview web element assert
        isAccountOverviewPageWebElementDisplayed();
        //account overview page text element assert
        isAccountOverviewPageTextElementAsExpected();
        //click aside 'Logout' link
        accountOverviewPage.clickAsideLogoutLink();
        //assert the user gets the expected success message
        assertEquals("Successfully logged out.", accountOverviewPage.getLogoutSuccessMessage(), "The logout success message doesn't match expectations or the user failed to log out.");
        //capture screenshot of the test result
        captureScreenshot(driver, "User Logout Test Result");
    }

    //valid user login test method
    protected void validUserAccountLoginTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //valid user login input data getter
        loginRegisterDashBoardLoginSectionPage.getValidUserLoginInputData(loginRegisterDashboardRegisterSectionPage);
        //capture screenshot of the pre-input stage
        captureScreenshot(driver, "Valid User Login Test - Before Data Input");
        //input valid login email
        loginRegisterDashBoardLoginSectionPage.inputEmailIntoLoginEmailInputField();
        //input valid login password
        loginRegisterDashBoardLoginSectionPage.inputPasswordIntoLoginPasswordInputField();
        //input 'Login' button
        loginRegisterDashBoardLoginSectionPage.clickLoginButton();
        //assert the user gets onto account overview page after successful login
        assertEquals("Overview", accountOverviewPage.getAccountOverviewTitle(), "The account overview page title doesn't match expectations");
        //capture screenshot after test completion
        captureScreenshot(driver, "Valid User Login Test Result");
    }

    //invalid login tests

    //no singular input

    //invalid user login test method - no login email (the form has no singular input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoEmailLoginTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user login input data getter - no login email
        loginRegisterDashBoardLoginSectionPage.getInvalidUserLoginNoEmailInputData(loginRegisterDashboardRegisterSectionPage);
        //capture screenshot of the pre-input stage
        captureScreenshot(driver, "Invalid User Login Test - Before Data Input");
        //don't input login email
        loginRegisterDashBoardLoginSectionPage.inputNoEmailIntoLoginEmailInputField();
        //input valid login password
        loginRegisterDashBoardLoginSectionPage.inputPasswordIntoLoginPasswordInputField();
        //input 'Login' button
        loginRegisterDashBoardLoginSectionPage.clickLoginButton();
        //capture screenshot after invalid login attempt
        captureScreenshot(driver, "Invalid User Login Test Result - No Email");
    }
    //invalid user login test method - no login password (the form has no singular input display errors so the screenshots are being used as proof of the test run)
    protected void invalidUserAccountNoPasswordLoginTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user login input data getter - no login password
        loginRegisterDashBoardLoginSectionPage.getInvalidUserLoginNoPasswordInputData(loginRegisterDashboardRegisterSectionPage);
        //capture screenshot of the pre-input stage
        captureScreenshot(driver, "Invalid User Login Test - Before Data Input");
        //input valid login email
        loginRegisterDashBoardLoginSectionPage.inputEmailIntoLoginEmailInputField();
        //don't input login password
        loginRegisterDashBoardLoginSectionPage.inputNoPasswordIntoLoginPasswordInputField();
        //input 'Login' button
        loginRegisterDashBoardLoginSectionPage.clickLoginButton();
        //capture screenshot after invalid login attempt
        captureScreenshot(driver, "Invalid User Login Test Result - No Password");
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserAccountInvalidEmailLoginTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user login input data getter - invalid login email
        loginRegisterDashBoardLoginSectionPage.getInvalidUserLoginInvalidEmailInputData(loginRegisterDashboardRegisterSectionPage);
        //capture screenshot of the pre-input stage
        captureScreenshot(driver, "Invalid User Login Test - Before Data Input");
        //input invalid login email
        loginRegisterDashBoardLoginSectionPage.inputInvalidEmailIntoLoginEmailInputField();
        //input valid login password
        loginRegisterDashBoardLoginSectionPage.inputPasswordIntoLoginPasswordInputField();
        //input 'Login' button
        loginRegisterDashBoardLoginSectionPage.clickLoginButton();
        //assert the expected error is displayed
        assertEquals("Could not find an account that matches the given credentials.", loginRegisterDashBoardLoginSectionPage.getInvalidCredentialsError(), "The invalid credentials error doesn't match expectations");
        //capture screenshot after invalid login attempt
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Email");
    }
    //invalid user login test method - invalid login password
    protected void invalidUserAccountInvalidPasswordLoginTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
        HomePage homePage = new HomePage(driver);
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //login and register dashboard page web element assert
        isLoginRegisterDashboardPageWebElementDisplayed();
        //login and register dashboard page text element assert
        isLoginRegisterDashboardPageTextElementMatchExpectations();
        //invalid user login input data getter - invalid login password
        loginRegisterDashBoardLoginSectionPage.getInvalidUserLoginInvalidPasswordInputData(loginRegisterDashboardRegisterSectionPage);
        //capture screenshot of the pre-input stage
        captureScreenshot(driver, "Invalid User Login Test - Before Data Input");
        //input valid login email
        loginRegisterDashBoardLoginSectionPage.inputEmailIntoLoginEmailInputField();
        //input invalid login password
        loginRegisterDashBoardLoginSectionPage.inputInvalidPasswordIntoLoginPasswordInputField();
        //input 'Login' button
        loginRegisterDashBoardLoginSectionPage.clickLoginButton();
        //assert the expected error is displayed
        assertEquals("Could not find an account that matches the given credentials.", loginRegisterDashBoardLoginSectionPage.getInvalidCredentialsError(), "The invalid credentials error doesn't match expectations");
        //capture screenshot after invalid login attempt
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Password");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //singular product addition to cart tests

    //add 'Free Time & Electronics' product to cart test method (guest)
    protected void addFreeTimeAndElectronicsProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Technical Cookies' button
        homePage.clickAcceptTechnicalCookies();
        //click 'Free time & Electronics' nav link
        homePage.clickFreeTimeElectronicsLink();
        //assert the user gets onto correct category page
        assertEquals("Free time & electronics", productsDashboardPage.getProductDashboardPageTitle(), "The project dashboard page title doesn't match expectations or the user is on the wrong category page.");
        //log displayed product data
        logProductDashboardData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Product Dashboard Page (guest)");
        //click 'Add to Cart' button
        productsDashboardPage.clickSingleAddToCartButton();
        //assert the item gets added to shopping cart
        assertEquals("1 product added to your shopping cart.", productsDashboardPage.getProductAdditionSuccessMessage(), "The product addition success message doesn't match expectations or the product addition failed.");
        //aside shopping cart web element assert
        isAsideShoppingCartWebElementDisplayed();
        //aside shopping cart text element assert
        isAsideShoppingCartTextElementAsExpected();
        //log aside shopping cart data
        logAsideShoppingCartData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Aside Shopping Cart (guest)");
        //click 'Display shopping cart' link
        productsDashboardPage.clickDisplayShoppingCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time Electronics Test Result - Added Product to Cart (guest)");
    }
    //add 'Free Time & Electronics' product to cart test method (registered user)
    protected void addFreeTimeAndElectronicsProductToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Free time & Electronics' nav link
        homePage.clickFreeTimeElectronicsLink();
        //assert the user gets onto correct category page
        assertEquals("Free time & electronics", productsDashboardPage.getProductDashboardPageTitle(), "The project dashboard page title doesn't match expectations or the user is on the wrong category page.");
        //log displayed product data
        logProductDashboardData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Product Dashboard Page (registered user)");
        //click 'Add to Cart' button
        productsDashboardPage.clickSingleAddToCartButton();
        //assert the item gets added to shopping cart
        assertEquals("1 product added to your shopping cart.", productsDashboardPage.getProductAdditionSuccessMessage(), "The product addition success message doesn't match expectations or the product addition failed.");
        //aside shopping cart web element assert
        isAsideShoppingCartWebElementDisplayed();
        //aside shopping cart text element assert
        isAsideShoppingCartTextElementAsExpected();
        //log aside shopping cart data
        logAsideShoppingCartData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Aside Shopping Cart (registered user)");
        //click 'Display shopping cart' link
        productsDashboardPage.clickDisplayShoppingCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time Electronics Test Result - Added Product to Cart (registered user)");
    }
    //remove 'Free Time & Electronics' product from aside shopping cart test method (guest)
    protected void removeFreeTimeAndElectronicsProductFromAsideShoppingCartTest(){
        HomePage homePage = new HomePage(driver);
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Technical Cookies' button
        homePage.clickAcceptTechnicalCookies();
        //click 'Free time & Electronics' nav link
        homePage.clickFreeTimeElectronicsLink();
        //assert the user gets onto correct category page
        assertEquals("Free time & electronics", productsDashboardPage.getProductDashboardPageTitle(), "The project dashboard page title doesn't match expectations or the user is on the wrong category page.");
        //log displayed product data
        logProductDashboardData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Product Dashboard Page (guest)");
        //click 'Add to Cart' button
        productsDashboardPage.clickSingleAddToCartButton();
        //assert the item gets added to shopping cart
        assertEquals("1 product added to your shopping cart.", productsDashboardPage.getProductAdditionSuccessMessage(), "The product addition success message doesn't match expectations or the product addition failed.");
        //aside shopping cart web element assert
        isAsideShoppingCartWebElementDisplayed();
        //aside shopping cart text element assert
        isAsideShoppingCartTextElementAsExpected();
        //log aside shopping cart data
        logAsideShoppingCartData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Free Time Electronics Test - Aside Shopping Cart Before Product Removal (guest)");
        //click 'Remove product from aside shopping cart' button
        productsDashboardPage.clickSingleRemoveProductFromAsideCartButton();
        //assert the item gets removed from aside shopping cart
        assertEquals("Your shopping cart is empty.", productsDashboardPage.getProductRemovalSuccessMessage(), "The product removal success message doesn't match expectations or the product removal failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time Electronics Product Removal From Aside Shopping Cart Test Result (guest)");
    }

    //multiple products addition to cart tests

    //add 'Clothing' products to cart test method (guest)
    protected void addClothingProductsToCartTest(){
        HomePage homePage = new HomePage(driver);
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Technical Cookies' button
        homePage.clickAcceptTechnicalCookies();
        //click 'Clothing' nav link
        homePage.clickClothingLink();
        //assert the user gets onto correct category page
        assertEquals("Clothing", productsDashboardPage.getProductDashboardPageTitle(), "The project dashboard page title doesn't match expectations or the user is on the wrong category page.");
        //log displayed product data
        logProductDashboardData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Clothing Test - Product Dashboard Page (guest)");
        System.out.println("Size of productAddToCartButtonElements: " + productsDashboardPage.productAddToCartButtonElements.size());
        //add multiple products to cart button
        productsDashboardPage.clickAddToCart1Button();
        productsDashboardPage.clickAddToCart2Button();
//        productsDashboardPage.clickAddToCart3Button();
        //assert the item gets added to shopping cart
        assertEquals("1 product added to your shopping cart.", productsDashboardPage.getProductAdditionSuccessMessage(), "The product addition success message doesn't match expectations or the product addition failed.");
        //aside shopping cart web element assert
        isAsideShoppingCartWebElementDisplayed();
        //aside shopping cart text element assert
        isAsideShoppingCartTextElementAsExpected();
        //log aside shopping cart data
        logAsideShoppingCartData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Clothing Test - Aside Shopping Cart (guest)");
        //click 'Display shopping cart' link
        productsDashboardPage.clickDisplayShoppingCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Clothing Test Result - Added Products to Cart (guest)");
    }
    //add 'Clothing' products to cart test method (registered user)
    protected void addClothingProductsToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Clothing' nav link
        homePage.clickClothingLink();
        //assert the user gets onto correct category page
        assertEquals("Clothing", productsDashboardPage.getProductDashboardPageTitle(), "The project dashboard page title doesn't match expectations or the user is on the wrong category page.");
        //log displayed product data
        logProductDashboardData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Clothing Test - Product Dashboard Page (guest)");
        System.out.println("Size of productAddToCartButtonElements: " + productsDashboardPage.productAddToCartButtonElements.size());
        //add multiple products to cart button
        productsDashboardPage.clickAddToCart1Button();
        productsDashboardPage.clickAddToCart2Button();
//        productsDashboardPage.clickAddToCart3Button();
        //assert the item gets added to shopping cart
        assertEquals("1 product added to your shopping cart." , productsDashboardPage.getProductAdditionSuccessMessage(), "The product addition success message doesn't match expectations or the product addition failed.");
        //aside shopping cart web element assert
        isAsideShoppingCartWebElementDisplayed();
        //aside shopping cart text element assert
        isAsideShoppingCartTextElementAsExpected();
        //log aside shopping cart data
        logAsideShoppingCartData();
        //capture screenshot of the dashboard page
        captureScreenshot(driver, "Clothing Test - Aside Shopping Cart (registered user)");
        //click 'Display shopping cart' link
        productsDashboardPage.clickDisplayShoppingCartLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Clothing Test Result - Added Products to Cart (registered user)");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //singular product addition to check out tests

    //add 'Free Time & Electronics' product to check out test method (guest) (guest and registered user share this method as it's the same for both parties)
    protected void addProductToCheckoutTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click 'Shipping details' link
        shoppingCartPage.clickShippingDetailsLink();
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //assert shopping cart shipping country dropdown menu is displayed (registered user doesn't have this menu)
        assertTrue(shoppingCartPage.isShippingCountryDropdownMenuDisplayed(), "The shopping cart shipping country dropdown menu isn't displayed");
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed();
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected();
        //capture screenshot of the shopping cart page
        captureScreenshot(driver, "Free Time And Electronics Test - Shopping Cart Page");
        //log shopping cart page data
        logShoppingCartProductData();
        //click country dropdown menu
        shoppingCartPage.clickShippingDetailsCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUSCountryOption();
        //click 'Shipping details' link
        shoppingCartPage.clickShippingDetailsLink();
        //click 'Go to Checkout' button
        shoppingCartPage.clickGoToCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time And Electronics Test Result - Added Product To Checkout (guest)");
    }
    //remove 'Free Time & Electronics' product from cart page test method (guest)
    protected void removeFreeTimeAndElectronicsProductFromCartPageTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click 'Shipping details' link
        shoppingCartPage.clickShippingDetailsLink();
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //assert shopping cart shipping country dropdown menu is displayed (registered user doesn't have this menu)
        assertTrue(shoppingCartPage.isShippingCountryDropdownMenuDisplayed(), "The shopping cart shipping country dropdown menu isn't displayed");
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed();
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected();
        //capture screenshot of the shopping cart page
        captureScreenshot(driver, "Free Time And Electronics Test - Shopping Cart Page");
        //log shopping cart page data
        logShoppingCartProductData();
        //click single product remove button
        shoppingCartPage.clickSingleProductRemoveButton();
        //assert the user gets the success message
        assertEquals("Your shopping cart is empty.", shoppingCartPage.getProductRemovalSuccessMessage(), "The product removal success message doesn't match expectations or the product removal failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time And Electronics Test Result - Product Removed From Cart");
    }
    //add 'Free Time & Electronics' product to check out test method (guest) (guest and registered user share this method as it's the same for both parties)
    protected void addProductToCheckoutRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click 'Shipping details' link
        shoppingCartPage.clickShippingDetailsLink();
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed();
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected();
        //capture screenshot of the shopping cart page
        captureScreenshot(driver, "Free Time And Electronics Test - Shopping Cart Page (registered user)");
        //log shopping cart page data
        logShoppingCartProductData();
        //click 'Go to Checkout' button
        shoppingCartPage.clickGoToCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Free Time And Electronics Test Result - Added Product To Checkout (registered user)");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid guest checkout tests (shipping address input)

    //valid guest checkout test method
    protected void validGuestProductCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before data input (guest)
        captureScreenshot(driver, "Valid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //valid guest user data getter
        checkoutGuestPage.getValidGuestUserData();
        //input valid first name
        checkoutGuestPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Guest Product Checkout Test Result - Product Has Checked Out");
    }

    //invalid guest checkout tests (shipping address input) - guest branch is only tested, the registered user goes straight for order confirmation omitting shipping address block

    //no singular input

    //invalid guest checkout (shipping address input) test method - no first name (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoFirstNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no first name
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoFirstNameData();
        //don't input first name
        checkoutGuestNoSingularInputPage.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No First Name");
        //input valid last name
        checkoutGuestNoSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestNoSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestNoSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestNoSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestNoSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No First Name");
    }
    //invalid guest checkout (shipping address input) test method - no last name (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoLastNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no last name
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoLastNameData();
        //input valid first name
        checkoutGuestNoSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //don't input last name
        checkoutGuestNoSingularInputPage.inputNoLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No Last Name");
        //input valid email
        checkoutGuestNoSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestNoSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestNoSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestNoSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No Last Name");
    }
    //invalid guest checkout (shipping address input) test method - no email (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoEmailCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no email
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoEmailData();
        //input valid first name
        checkoutGuestNoSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestNoSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //don't input email
        checkoutGuestNoSingularInputPage.inputNoEmailIntoEmailInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No Email");
        //input valid address
        checkoutGuestNoSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestNoSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestNoSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No Email");
    }
    //invalid guest checkout (shipping address input) test method - no guest address (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoAddressCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no guest address
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoAddressData();
        //input valid first name
        checkoutGuestNoSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestNoSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestNoSingularInputPage.inputGuestEmailIntoEmailInputField();
        //don't input address
        checkoutGuestNoSingularInputPage.inputNoAddressIntoAddressInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No Address");
        //input valid city
        checkoutGuestNoSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestNoSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No Address");
    }
    //invalid guest checkout (shipping address input) test method - no guest city (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoCityCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no guest city
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoCityData();
        //input valid first name
        checkoutGuestNoSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestNoSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestNoSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestNoSingularInputPage.inputGuestAddressIntoAddressInputField();
        //don't input city
        checkoutGuestNoSingularInputPage.inputNoCityIntoCityInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No City");
        //input valid postal code
        checkoutGuestNoSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No City");
    }
    //invalid guest checkout (shipping address input) test method - no guest postal code (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoPostalCodeCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestNoSingularInputPage checkoutGuestNoSingularInputPage = new CheckoutGuestNoSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - no guest postal code
        checkoutGuestNoSingularInputPage.getInvalidGuestUserNoPostalCodeData();
        //input valid first name
        checkoutGuestNoSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestNoSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestNoSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestNoSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestNoSingularInputPage.inputGuestCityIntoCityInputField();
        //don't input postal code
        checkoutGuestNoSingularInputPage.inputNoPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - No Postal Code");
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No Postal Code");
    }
    //invalid guest checkout (shipping address input) test method - no country/state (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductNoCountryCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //valid guest user data getter
        checkoutGuestPage.getValidGuestUserData();
        //input valid first name
        checkoutGuestPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - No Country And State");
    }

    //too short singular input tests

    //invalid guest checkout (shipping address input) test method - too short first name (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortFirstNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short first name (1 char)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortFirstNameData();
        //input too short first name
        checkoutGuestTooShortLongInputPage.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short First Name");
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short first name input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short First Name");
    }
    //invalid guest checkout (shipping address input) test method - too short first name (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortLastNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short last name (3 chars)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortLastNameData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input too short last name (3 chars)
        checkoutGuestTooShortLongInputPage.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short Last Name");
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short last name input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short Last Name");
    }
    //invalid guest checkout (shipping address input) test method - too short email (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortEmailCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short email address (1 char - name, domain)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortEmailData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input too short email
        checkoutGuestTooShortLongInputPage.inputTooShortEmailIntoEmailInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short Email");
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short email address input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short Email");
    }
    //invalid guest checkout (shipping address input) test method - too short address (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortAddressCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short street address (1 char)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortAddressData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input too short address (1 char)
        checkoutGuestTooShortLongInputPage.inputTooShortAddressIntoAddressInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short Address");
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short address input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short Address");
    }
    //invalid guest checkout (shipping address input) test method - too short city (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortCityCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short city (1 char)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortCityData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input too short city (1 char)
        checkoutGuestTooShortLongInputPage.inputTooShortCityIntoCityInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short City");
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short city input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short City");
    }
    //invalid guest checkout (shipping address input) test method - too short postal code (this form has no missing singular input errors, screenshots will serve as proof of the test run)
    protected void invalidGuestProductTooShortPostalCodeCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too short postal code (2 digits)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooShortPostalCodeData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input too short postal code
        checkoutGuestTooShortLongInputPage.inputTooShortPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Short Postal Code");
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too short postal code input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Short Postal Code");
    }

    //too long singular input tests

    //invalid guest checkout (shipping address input) test method - too long first name
    protected void invalidGuestProductTooLongFirstNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long first name (100 chars)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongFirstNameData();
        //input too short first name (100 chars)
        checkoutGuestTooShortLongInputPage.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long First Name");
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long first name input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long First Name");
    }
    //invalid guest checkout (shipping address input) test method - too long last name
    protected void invalidGuestProductTooLongLastNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long last name (110 chars)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongLastNameData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input too long last name (110 chars)
        checkoutGuestTooShortLongInputPage.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long Last Name");
        //input valid email
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long last name input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long Last Name");
    }
    //invalid guest checkout (shipping address input) test method - too long email address (checkout doesn't get aborted)
    protected void invalidGuestProductTooLongEmailCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long email address (100 chars - name)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongEmailData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input too long email address (100 chars)
        checkoutGuestTooShortLongInputPage.inputTooLongEmailIntoEmailInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long Email");
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long email address input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long Email");
    }
    //invalid guest checkout (shipping address input) test method - too long street address (checkout doesn't get aborted)
    protected void invalidGuestProductTooLongAddressCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long street address (100 chars)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongAddressData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input too long address (100 chars)
        checkoutGuestTooShortLongInputPage.inputTooLongAddressIntoAddressInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long Address");
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long street address input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long Address");
    }
    //invalid guest checkout (shipping address input) test method - too long city
    protected void invalidGuestProductTooLongCityCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long city (100 chars)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongCityData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input too long city (100 chars)
        checkoutGuestTooShortLongInputPage.inputTooLongCityIntoCityInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long City");
        //input valid postal code
        checkoutGuestTooShortLongInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long city input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long City");
    }
    //invalid guest checkout (shipping address input) test method - too long postal code (the checkout doesn't get aborted)
    protected void invalidGuestProductTooLongPostalCodeCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestTooShortLongInputPage checkoutGuestTooShortLongInputPage = new CheckoutGuestTooShortLongInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - too long postal code (50 digits)
        checkoutGuestTooShortLongInputPage.getInvalidGuestUserTooLongPostalCodeData();
        //input valid first name
        checkoutGuestTooShortLongInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestTooShortLongInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestTooShortLongInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestTooShortLongInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestTooShortLongInputPage.inputGuestCityIntoCityInputField();
        //input too long postal code (50 digits)
        checkoutGuestTooShortLongInputPage.inputTooLongPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Too Long Postal Code");
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestTooShortLongInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for too long postal code input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Too Long Postal Code");
    }

    //invalid singular input format tests

    //invalid guest checkout (shipping address input) test method - invalid first name format (checkout doesn't get aborted)
    protected void invalidGuestProductInvalidFirstNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestInvalidSingularInputPage checkoutGuestInvalidSingularInputPage = new CheckoutGuestInvalidSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - invalid first name format (numbers and special symbols)
        checkoutGuestInvalidSingularInputPage.getInvalidGuestUserInvalidFirstNameData();
        //input invalid first name format (numbers and symbols)
        checkoutGuestInvalidSingularInputPage.inputInvalidFirstNameIntoFirstNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Invalid First Name Format");
        //input valid last name
        checkoutGuestInvalidSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email
        checkoutGuestInvalidSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestInvalidSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestInvalidSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestInvalidSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestInvalidSingularInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for invalid first name format input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Invalid First Name Format");
    }
    //invalid guest checkout (shipping address input) test method - invalid last name format (checkout doesn't get aborted)
    protected void invalidGuestProductInvalidLastNameCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestInvalidSingularInputPage checkoutGuestInvalidSingularInputPage = new CheckoutGuestInvalidSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - invalid last name format (numbers and special symbols)
        checkoutGuestInvalidSingularInputPage.getInvalidGuestUserInvalidLastNameData();
        //input valid first name format
        checkoutGuestInvalidSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input invalid last name format (numbers and special symbols)
        checkoutGuestInvalidSingularInputPage.inputInvalidLastNameIntoLastNameInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Invalid Last Name Format");
        //input valid email
        checkoutGuestInvalidSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input valid address
        checkoutGuestInvalidSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestInvalidSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestInvalidSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestInvalidSingularInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for invalid last name format input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Invalid Last Name Format");
    }
    //invalid guest checkout (shipping address input) test method - invalid email address format (this form doesn't have an invalid email address input error, so the screenshots are being used as proof for the test run)
    protected void invalidGuestProductInvalidEmailCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestInvalidSingularInputPage checkoutGuestInvalidSingularInputPage = new CheckoutGuestInvalidSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - invalid email address format (missing '@')
        checkoutGuestInvalidSingularInputPage.getInvalidGuestUserInvalidEmailData();
        //input valid first name format
        checkoutGuestInvalidSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name format
        checkoutGuestInvalidSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input invalid email format (missing '@)
        checkoutGuestInvalidSingularInputPage.inputInvalidEmailIntoEmailInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Invalid Email Format");
        //input valid address
        checkoutGuestInvalidSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestInvalidSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestInvalidSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Invalid Email Format");
    }
    //invalid guest checkout (shipping address input) test method - existing email address (this form doesn't have an invalid email address input error, so the screenshots are being used as proof for the test run) (checkout doesn't get aborted)
    protected void invalidGuestProductExistingEmailCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestInvalidSingularInputPage checkoutGuestInvalidSingularInputPage = new CheckoutGuestInvalidSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - existing email address (used in manual testing)
        checkoutGuestInvalidSingularInputPage.getInvalidGuestUserExistingEmailData();
        //input valid first name format
        checkoutGuestInvalidSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name format
        checkoutGuestInvalidSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input existing email address (used in manual testing beforehand)
        checkoutGuestInvalidSingularInputPage.inputExistingEmailIntoEmailInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Existing Email Address");
        //input valid address
        checkoutGuestInvalidSingularInputPage.inputGuestAddressIntoAddressInputField();
        //input valid city
        checkoutGuestInvalidSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestInvalidSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestInvalidSingularInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for existing email address input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Existing Email Address");
    }
    //invalid guest checkout (shipping address input) test method - invalid street address format (this form doesn't have an invalid email address input error, so the screenshots are being used as proof for the test run) (checkout doesn't get aborted)
    protected void invalidGuestProductInvalidAddressCheckout(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        CheckoutGuestInvalidSingularInputPage checkoutGuestInvalidSingularInputPage = new CheckoutGuestInvalidSingularInputPage(driver);
        //check out (guest) page web element assert
        isCheckoutGuestPageWebElementDisplayed();
        //check out (guest) text element assert
        isCheckoutGuestTextElementAsExpected();
        //log check out page product data
        logCheckoutGuestPageProductData();
        //capture screenshot of the checkout page before invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Checkout Guest Page (before data input)");
        //click salutation dropdown menu
        checkoutGuestPage.clickSalutationDropdownMenu();
        //select 'Mr.' option
        checkoutGuestPage.selectMrSalutation();
        //invalid guest user data getter - invalid street address (special symbols only)
        checkoutGuestInvalidSingularInputPage.getInvalidGuestUserInvalidAddressData();
        //input valid first name format
        checkoutGuestInvalidSingularInputPage.inputGuestFirstNameIntoFirstNameInputField();
        //input valid last name format
        checkoutGuestInvalidSingularInputPage.inputGuestLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestInvalidSingularInputPage.inputGuestEmailIntoEmailInputField();
        //input invalid street address format (special symbols only)
        checkoutGuestInvalidSingularInputPage.inputInvalidAddressIntoAddressInputField();
        //capture screenshot of the checkout page after invalid data input (guest)
        captureScreenshot(driver, "Invalid Guest Product Checkout Test - Invalid Street Address Format");
        //input valid city
        checkoutGuestInvalidSingularInputPage.inputGuestCityIntoCityInputField();
        //input valid postal code
        checkoutGuestInvalidSingularInputPage.inputGuestPostalCodeIntoPostCodeInputField();
        //click country dropdown menu
        checkoutGuestPage.clickGuestCountryDropdownMenu();
        //select 'United States' option
        checkoutGuestPage.selectUSOption();
        //click state dropdown menu
        checkoutGuestPage.clickGuestStateDropdownMenu();
        //select 'Illinois' option
        checkoutGuestPage.selectIllinoisOption();
        //click 'Continue' button
        checkoutGuestPage.clickContinueButton();
        //assert the user gets an expected error, log the issue if it doesn't appear
        try {
            assertEquals("Unfortunately, something went wrong.", checkoutGuestInvalidSingularInputPage.getInvalidSingularInputError(), "The invalid singular input error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("There's no invalid input error message for invalid street address format input", e);
        }
        //capture screenshot of the invalid test result
        captureScreenshot(driver, "Invalid Guest Product Checkout Test Result - Invalid Street Address Format");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method(all pages have the (header/footer) same ones except for checkout page)
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //assert header language dropdown menu is displayed
        assertTrue(homePage.isLanguageDropdownMenuDisplayed(), "The header language dropdown menu isn't displayed");
        //assert header currency dropdown menu is displayed
        assertTrue(homePage.isCurrencyDropdownMenuDisplayed(), "The header currency dropdown menu isn't displayed");
        //assert header language dropdown menu is displayed
        assertTrue(homePage.isLanguageDropdownMenuDisplayed(), "The language dropdown menu isn't displayed");
        //assert header store logo link is displayed
        assertTrue(homePage.isHomePageLogoDisplayed(), "The header logo link isn't displayed");
        //assert header search bar is displayed
        assertTrue(homePage.isHomePageSearchBarDisplayed(), "The header search bar isn't displayed");
        //assert header search button is displayed
        assertTrue(homePage.isHomePageSearchButtonDisplayed(), "The header search button isn't displayed");
        //assert header user account dropdown menu is displayed
        assertTrue(homePage.isHomePageUserAccountDropdownMenuDisplayed(), "The header user account dropdown menu isn't displayed");
        //assert header shopping cart icon button is displayed
        assertTrue(homePage.isHomePageShoppingCartIconButtonDisplayed(), "The header shopping cart icon button isn't displayed");
        //assert home page nav link is displayed
        assertTrue(homePage.isHomePageNavLinkDisplayed(), "The home page nav link isn't displayed");
        //assert home page sweets nav link is displayed
        //assertTrue(homePage.isHomePageSweetsLinkDisplayed(), "The sweets page nav link isn't displayed");
        //assert home page bakery nav link is displayed
        //assertTrue(homePage.isHomePageBakeryLinkDisplayed(), "The bakery page nav link isn't displayed");
        //assert clothing nav link is displayed
        assertTrue(homePage.isHomePageClothingLinkDisplayed(), "The clothing nav link isn't displayed");
        //assert free time & electronics nav link is displayed
        assertTrue(homePage.isHomePageFreeTimeElectronicsLinkDisplayed(), "The free time & electronics nav link isn't displayed");
        //assert footer service hotline title is displayed
        assertTrue(homePage.isShopServiceTitleDisplayed(), "The footer shop service hotline title isn't displayed");
        //assert footer service hotline description is displayed
        assertTrue(homePage.isShopServiceDescriptionDisplayed(), "The footer shop service hotline description isn't displayed");
        //assert footer shop service phone number link is displayed
        assertTrue(homePage.isShopServiceNumberLinkDisplayed(), "The footer shop service phone number link isn't displayed");
        //assert footer shop service contact form link is displayed
        assertTrue(homePage.isShopServiceContactFormLinkDisplayed(), "The footer shop service contact form link isn't displayed");
        //assert footer VAT description is displayed
        assertTrue(homePage.isFooterVATDescriptionDisplayed(), "The footer VAT description isn't displayed");
        //assert footer VAT link is displayed
        assertTrue(homePage.isFooterVATLinkDisplayed(), "The footer VAT link isn't displayed");
        //assert footer design (copyright) text is displayed
        assertTrue(homePage.isFooterDesignTextDisplayed(), "The footer design text isn't displayed");
    }

    //homepage web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page logo is displayed
        assertTrue(homePage.isHomePageLogoImageDisplayed(), "The home page logo image isn't displayed");
    }

    //login and register page web element assert test method
    protected void isLoginRegisterDashboardPageWebElementDisplayed(){
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //assert login section title is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionTitleDisplayed(), "The login section title isn't displayed");
        //assert login section description is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionDescriptionDisplayed(), "The login section description isn't displayed");
        //assert login section email input field is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionEmailInputFieldDisplayed(), "The login section email input field isn't displayed");
        //assert login section password input field is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionPasswordInputFieldDisplayed(), "The login section password input field isn't displayed");
        //assert login section forgot password link is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionForgotPasswordLinkDisplayed(), "The login section forgot password link isn't displayed");
        //assert login section login button is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginSectionButtonDisplayed(), "The login section 'login' button isn't displayed");
        //assert login section login advantages description is displayed
        assertTrue(loginRegisterDashBoardLoginSectionPage.isLoginAdvantagesDescriptionDisplayed(), "The login section login advantages description isn't displayed");
        //assert register section title is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionTitleDisplayed(), "The register section title isn't displayed");
        //assert register section salutation dropdown menu is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionSalutationDropdownMenuDisplayed(), "The register section salutation dropdown menu isn't displayed");
        //assert register section first name input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionFirstNameInputFieldDisplayed(), "The register section first name input field isn't displayed");
        //assert register section last name input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionLastNameInputFieldDisplayed(), "The register section last name input field isn't displayed");
        //assert register section email input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionEmailInputFieldDisplayed(), "The register section email input field isn't displayed");
        //assert register section password input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionPasswordInputFieldDisplayed(), "The register section first name input field isn't displayed");
        //assert register section password input hint is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionPasswordHintDisplayed(), "The register section password input hint isn't displayed");
        //assert register section address title is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionAddressTitleDisplayed(), "The register section address title isn't displayed");
        //assert register section address input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionAddressInputFieldDisplayed(), "The register section address input field isn't displayed");
        //assert register section city input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionCityInputFieldDisplayed(), "The register section city input field isn't displayed");
        //assert register section postal code input field is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionPostalCodeInputFieldDisplayed(), "The register section postal code input field isn't displayed");
        //assert register section country dropdown menu is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionCountryDropdownMenuDisplayed(), "The register section country dropdown menu isn't displayed");
        //assert register section address shipping/billing address mismatch checkbox is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionShippingCheckboxDisplayed(), "The register section shipping/billing address mismatch checkbox isn't displayed");
        //assert register section privacy policy description is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionPrivacyPolicyDescriptionDisplayed(), "The register section privacy policy description isn't displayed");
        //assert register section data protection link is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionDataProtectionLinkDisplayed(), "The register section data protection link isn't displayed");
        //assert register section general terms link is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionGeneralTermsLinkDisplayed(), "The register section general terms link isn't displayed");
        //assert register section continue button is displayed
        assertTrue(loginRegisterDashboardRegisterSectionPage.isRegisterSectionContinueButtonDisplayed(), "The register section continue button isn't displayed");
    }

    //account overview page web element assert test method
    protected void isAccountOverviewPageWebElementDisplayed(){
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //assert aside section title is displayed
        assertTrue(accountOverviewPage.isAsideSectionTitleDisplayed(), "The aside section title isn't displayed");
        //assert aside overview link is displayed
        assertTrue(accountOverviewPage.isAsideOverviewLinkDisplayed(), "The aside overview link isn't displayed");
        //assert aside profile link is displayed
        assertTrue(accountOverviewPage.isAsideProfileLinkDisplayed(), "The aside profile link isn't displayed");
        //assert aside addresses link is displayed
        assertTrue(accountOverviewPage.isAsideAddressesLinkDisplayed(), "The aside addresses link isn't displayed");
        //assert aside payment methods link is displayed
        assertTrue(accountOverviewPage.isAsidePaymentMethodsLinkDisplayed(), "The aside payment methods link isn't displayed");
        //assert aside orders link is displayed
        assertTrue(accountOverviewPage.isAsideOrdersLinkDisplayed(), "The aside orders link isn't displayed");
        //assert aside logout link is displayed
        assertTrue(accountOverviewPage.isAsideLogOutLinkDisplayed(), "The aside logout link isn't displayed");
        //assert account overview title is displayed
        assertTrue(accountOverviewPage.isAccountOverviewTitleDisplayed(), "The account overview title isn't displayed");
        //assert account overview description is displayed
        assertTrue(accountOverviewPage.isAccountOverviewDescriptionDisplayed(), "The account overview description isn't displayed");
        //assert account personal data subsection title is displayed
        assertTrue(accountOverviewPage.isAccountPersonalDataSubsectionTitleDisplayed(), "The account personal data subsection title isn't displayed");
        //assert account personal data is displayed
        assertTrue(accountOverviewPage.isAccountPersonalDataDisplayed(), "The account personal data isn't displayed");
        //assert account default payment method subsection title is displayed
        assertTrue(accountOverviewPage.isAccountDefaultPaymentMethodSubsectionTitleDisplayed(), "The account default payment method subsection title isn't displayed");
        //assert account default payment method is displayed
        assertTrue(accountOverviewPage.isAccountDefaultPaymentMethodDisplayed(), "The account default payment method isn't displayed");
        //assert account default payment description is displayed
        assertTrue(accountOverviewPage.isAccountDefaultPaymentDescriptionDisplayed(), "The account default payment description isn't displayed");
        //assert account newsletter subsection title is displayed
        assertTrue(accountOverviewPage.isAccountNewsletterSubsectionTitleDisplayed(), "The account newsletter subsection title isn't displayed");
        //assert account newsletter checkbox is displayed
        assertTrue(accountOverviewPage.isAccountNewsletterCheckboxDisplayed(), "The account newsletter checkbox isn't displayed");
        //assert account newsletter checkbox description is displayed
        assertTrue(accountOverviewPage.isAccountNewsletterCheckboxDescriptionDisplayed(), "The account newsletter checkbox description isn't displayed");
        //assert account default billing address subsection title is displayed
        assertTrue(accountOverviewPage.isAccountDefaultBillingAddressSubsectionTitleDisplayed(), "The account default billing address subsection title isn't displayed");
        //assert account default billing address is displayed
        assertTrue(accountOverviewPage.isAccountDefaultBillingAddressDisplayed(), "The account default billing address isn't displayed");
        //assert account default shipping address subsection title is displayed
        assertTrue(accountOverviewPage.isAccountDefaultShippingAddressSubsectionTitleDisplayed(), "The account default shipping address subsection title isn't displayed");
        //assert account default shipping address is displayed
        assertTrue(accountOverviewPage.isAccountDefaultShippingAddressDisplayed(), "The account default shipping address isn't displayed");
    }

    //product dashboard page web element assert test method
    protected void isProductDashboardPageWebElementDisplayed(){
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //assert product dashboard title link is displayed
        assertTrue(productsDashboardPage.isProductsDashboardTitleLinkDisplayed(), "The product dashboard title link isn't displayed");
        //assert product dashboard manufacturer dropdown menu is displayed
        assertTrue(productsDashboardPage.isProductsDashboardManufacturerDropdownMenuDisplayed(), "The manufacturer dropdown menu isn't displayed");
        //assert product dashboard materials dropdown menu is displayed
        assertTrue(productsDashboardPage.isProductsDashboardMaterialsDropdownMenuDisplayed(), "The materials dropdown menu isn't displayed");
        //assert product dashboard target group dropdown menu is displayed
        assertTrue(productsDashboardPage.isProductsDashboardTargetGroupDropdownMenuDisplayed(), "The target group dropdown menu isn't displayed");
        //assert product dashboard price dropdown menu is displayed
        assertTrue(productsDashboardPage.isProductsDashboardPriceDropdownMenuDisplayed(), "The price dropdown menu isn't displayed");
        //assert product dashboard free shipping checkbox is displayed
        assertTrue(productsDashboardPage.isProductsDashboardFreeShippingCheckboxDisplayed(), "The free shipping checkbox isn't displayed");
        //assert product dashboard sort by dropdown menu is displayed
        assertTrue(productsDashboardPage.isProductsDashboardSortByDropdownMenuDisplayed(), "The sort by dropdown menu isn't displayed");
        //assert product dashboard product card (as a list) is displayed
        assertTrue(productsDashboardPage.isProductCardDisplayed(), "The product card isn't displayed");
        //assert product dashboard product image placeholder (as a list) is displayed
        assertTrue(productsDashboardPage.isProductCardImagePlaceholderDisplayed(), "The product image placeholder isn't displayed");
        //assert product dashboard product title link (as a list) is displayed
        assertTrue(productsDashboardPage.isProductTitleLinkDisplayed(), "The product title link isn't displayed");
        //assert product dashboard product description (as a list) is displayed
        assertTrue(productsDashboardPage.isProductDescriptionDisplayed(), "The product description isn't displayed");
        //assert product dashboard product unit price(as a list) is displayed
        assertTrue(productsDashboardPage.isProductCardUnitPriceDisplayed(), "The product unit price isn't displayed");
        //assert product dashboard product 'Add to Cart' button (as a list) is displayed
        assertTrue(productsDashboardPage.isProductCardAddToCartButtonDisplayed(), "The product 'Add to Cart' button isn't displayed");
    }

    //aside shopping cart web element assert test method
    protected void isAsideShoppingCartWebElementDisplayed(){
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //assert product dashboard product 'continue shopping' link is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartContinueShoppingLinkDisplayed(), "The aside shopping cart 'continue shopping' link isn't displayed");
        //assert aside shopping cart title is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartTitleDisplayed(), "The aside shopping cart title isn't displayed");
        //assert aside shopping cart item quantity is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartItemQuantityDisplayed(), "The aside shopping cart item quantity isn't displayed");
        //assert aside shopping cart title is displayed
        assertTrue(productsDashboardPage.isProductCardAddToCartButtonDisplayed(), "The aside shopping cart title isn't displayed");
        //assert aside shopping cart item remove button is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartRemoveButtonDisplayed(), "The aside shopping cart item remove button isn't displayed");
        //assert aside shopping cart product image placeholder is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartProductImagePlaceholderDisplayed(), "The aside shopping cart product image placeholder isn't displayed");
        //assert aside shopping cart product title link is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartProductTitleLinkDisplayed(), "The aside shopping cart product title link isn't displayed");
        //assert aside shopping cart product description is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartProductDescriptionDisplayed(), "The aside shopping cart product description isn't displayed");
        //assert aside shopping cart product quantity input field is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartProductQtyInputFieldDisplayed(), "The aside shopping cart product qty input field isn't displayed");
        //assert aside shopping cart product total price is displayed (as a list)
        assertTrue(productsDashboardPage.isAsideShoppingCartProductTotalPriceDisplayed(), "The aside shopping cart product total price isn't displayed");
        //assert aside shopping cart product subtotal price is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartProductSubtotalPriceDisplayed(), "The aside shopping cart product subtotal price isn't displayed");
        //assert aside shopping cart product shipping price is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartProductShippingPriceDisplayed(), "The aside shopping cart product shipping price isn't displayed");
        //assert aside shopping cart product prices hint is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartProductPricesHintDisplayed(), "The aside shopping cart product prices hint isn't displayed");
        //assert aside shopping cart product coupon code input field is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartProductCouponCodeInputFieldDisplayed(), "The aside shopping cart product coupon input field isn't displayed");
        //assert aside shopping cart accept coupon button is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartAcceptCouponButtonDisplayed(), "The aside shopping cart accept coupon button isn't displayed");
        //assert aside shopping cart 'Go To Checkout' button is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartGoToCheckoutButtonDisplayed(), "The aside shopping cart 'Go To Checkout' button isn't displayed");
        //assert aside shopping cart display shopping cart link is displayed
        assertTrue(productsDashboardPage.isAsideShoppingCartDisplayShoppingCartLinkDisplayed(), "The aside shopping cart display shopping cart link isn't displayed");
    }

    //shopping cart page web element assert test method
    protected void isShoppingCartPageWebElementDisplayed(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //assert shopping cart title is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageTitleDisplayed(), "The shopping cart page title isn't displayed");
        //assert shopping cart table product image placeholder is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductImgDisplayed(), "The shopping cart table product image placeholder isn't displayed");
        //assert shopping cart table product description is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductDescriptionDisplayed(), "The shopping cart table product description isn't displayed");
        //assert shopping cart table product qty decrease button is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductQtyMinusBtnDisplayed(), "The shopping cart table product quantity decrease button isn't displayed");
        //assert shopping cart table product qty input field is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductQtyInputFieldDisplayed(), "The shopping cart table product quantity input field isn't displayed");
        //assert shopping cart table product qty increase button is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductQtyPlusBtnDisplayed(), "The shopping cart table product quantity increase button isn't displayed");
        //assert shopping cart table product unit price is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductUnitPriceDisplayed(), "The shopping cart table product unit price isn't displayed");
        //assert shopping cart table product subtotal price is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductSubtotalPriceDisplayed(), "The shopping cart table product sub total price isn't displayed");
        //assert shopping cart table product remove button is displayed (as a list) is displayed
        assertTrue(shoppingCartPage.isShoppingCartTableProductRemoveButtonDisplayed(), "The shopping cart table product remove button isn't displayed");
        //assert shopping cart table product summary total price is displayed
        assertTrue(shoppingCartPage.isSummaryTotalPriceDisplayed(), "The shopping cart summary product total price isn't displayed");
        //assert shopping cart table product summary shipping price is displayed
        assertTrue(shoppingCartPage.isSummaryShippingPriceDisplayed(), "The shopping cart summary product shipping price isn't displayed");
        //assert shopping cart table product summary grand total price is displayed
        assertTrue(shoppingCartPage.isSummaryGrandTotalPriceDisplayed(), "The shopping cart summary product grand total price isn't displayed");
        //assert shopping cart table product summary total price is displayed
        assertTrue(shoppingCartPage.isSummaryTotalPriceDisplayed(), "The shopping cart summary product total price isn't displayed");
        //assert shopping cart table product summary net total price is displayed
        assertTrue(shoppingCartPage.isSummaryNetTotalPriceDisplayed(), "The shopping cart summary product net total price isn't displayed");
        //assert shopping cart table product summary VAT price is displayed
        assertTrue(shoppingCartPage.isSummaryVATPriceDisplayed(), "The shopping cart summary product VAT price isn't displayed");
        //assert shopping cart table product coupon input field is displayed
        assertTrue(shoppingCartPage.isSummaryCouponCodeInputFieldDisplayed(), "The shopping cart summary product coupon code isn't displayed");
        //assert shopping cart table product accept coupon is displayed
        assertTrue(shoppingCartPage.isSummaryAcceptCouponButtonDisplayed(), "The shopping cart summary product accept coupon button isn't displayed");
        //assert shopping cart 'Go to Checkout' button is displayed
        assertTrue(shoppingCartPage.isGoToCheckoutButtonDisplayed(), "The shopping cart 'Go to Checkout' button isn't displayed");
        //assert shopping cart product number input field is displayed
        assertTrue(shoppingCartPage.isProductNumberInputFieldDisplayed(), "The shopping cart product number input field isn't displayed");
        //assert shopping cart accept product number button is displayed
        assertTrue(shoppingCartPage.isProductNumberAcceptButtonDisplayed(), "The shopping cart product number accept button isn't displayed");
        //assert shopping cart shipping details link is displayed
        assertTrue(shoppingCartPage.isShippingDetailsLinkDisplayed(), "The shopping cart shipping details link isn't displayed");
        //assert shopping cart shipping payment method dropdown menu is displayed
        assertTrue(shoppingCartPage.isShippingPaymentMethodDropdownMenuDisplayed(), "The shopping cart shipping payment method dropdown menu isn't displayed");
        //assert shopping cart shipping method dropdown menu is displayed
        assertTrue(shoppingCartPage.isShippingMethodDropdownMenuDisplayed(), "The shopping cart shipping method dropdown menu isn't displayed");
    }

    //guest checkout page web element assert test method
    protected void isCheckoutGuestPageWebElementDisplayed(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        //assert login link is displayed
        assertTrue(checkoutGuestPage.isLoginLinkDisplayed(), "The login link isn't displayed");
        //assert shipping info section title is displayed
        assertTrue(checkoutGuestPage.isShippingInfoSectionTitleDisplayed(), "The shipping info section title isn't displayed");
        //assert your info subsection title is displayed
        assertTrue(checkoutGuestPage.isYourInfoSubsectionTitleDisplayed(), "The your info subsection title isn't displayed");
        //assert salutation dropdown menu is displayed
        assertTrue(checkoutGuestPage.isSalutationDropdownMenuDisplayed(), "The salutation dropdown menu isn't displayed");
        //assert first name input field is displayed
        assertTrue(checkoutGuestPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(checkoutGuestPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert email input field is displayed
        assertTrue(checkoutGuestPage.isEmailInputFieldDisplayed(), "The email input field isn't displayed");
        //assert 'create customer account' checkbox is displayed
        assertTrue(checkoutGuestPage.isCreateCustomerAccountCheckboxDisplayed(), "The 'create customer account' checkbox isn't displayed");
        //assert address subsection title is displayed
        assertTrue(checkoutGuestPage.isAddressSubsectionTitleDisplayed(), "The address subsection title isn't displayed");
        //assert address input field is displayed
        assertTrue(checkoutGuestPage.isStreetAddressInputFieldDisplayed(), "The address input field isn't displayed");
        //assert city input field is displayed
        assertTrue(checkoutGuestPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        //assert postal code input field is displayed
        assertTrue(checkoutGuestPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        //assert country dropdown menu is displayed
        assertTrue(checkoutGuestPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        //assert shipping/billing address mismatch checkbox is displayed
        assertTrue(checkoutGuestPage.isShippingBillingAddressMismatchCheckboxDisplayed(), "The shipping billing address mismatch checkbox isn't displayed");
        //assert privacy subsection title is displayed
        assertTrue(checkoutGuestPage.isPrivacySubsectionTitleDisplayed(), "The privacy subsection title isn't displayed");
        //assert data protection information link is displayed
        assertTrue(checkoutGuestPage.isDataProtectionInformationLinkDisplayed(), "The data information protection link isn't displayed");
        //assert general terms link is displayed
        assertTrue(checkoutGuestPage.isGeneralTermsLinkDisplayed(), "The general terms link isn't displayed");
        //assert privacy text is displayed
        assertTrue(checkoutGuestPage.isPrivacyTextDisplayed(), "The privacy text isn't displayed");
        //assert 'Continue' button is displayed
        assertTrue(checkoutGuestPage.isContinueButtonDisplayed(), "The 'Continue' button isn't displayed");
        //assert summary section title is displayed
        assertTrue(checkoutGuestPage.isSummarySectionTitleDisplayed(), "The summary section title isn't displayed");
        //assert summary total price is displayed
        assertTrue(checkoutGuestPage.isSummaryTotalPriceDisplayed(), "The summary total price isn't displayed");
        //assert summary shipping cost is displayed
        assertTrue(checkoutGuestPage.isSummaryShippingCostDisplayed(), "The summary shipping cost isn't displayed");
        //assert summary grand total is displayed
        assertTrue(checkoutGuestPage.isSummaryGrandTotalPriceDisplayed(), "The summary grand total price isn't displayed");
        //assert summary net total price is displayed
        assertTrue(checkoutGuestPage.isSummaryNetTotalPriceDisplayed(), "The summary net total price isn't displayed");
        //assert summary VAT price is displayed
        assertTrue(checkoutGuestPage.isSummaryVATPriceDisplayed(), "The summary VAT price isn't displayed");
        //assert shopping cart section title is displayed
        assertTrue(checkoutGuestPage.isShoppingCartSectionTitleDisplayed(), "The shopping cart section title isn't displayed");
        //assert shopping cart product image placeholder (as a list) is displayed
        assertTrue(checkoutGuestPage.isShoppingCartProductImagePlaceholderDisplayed(), "The shopping cart product image placeholder isn't displayed");
        //assert shopping cart product remove button (as a list) is displayed
        assertTrue(checkoutGuestPage.isShoppingCartProductRemoveButtonDisplayed(), "The shopping cart product remove button isn't displayed");
        //assert shopping cart product title link (as a list) is displayed
        assertTrue(checkoutGuestPage.isShoppingCartProductTitleLinkDisplayed(), "The shopping cart product title link isn't displayed");
        //assert shopping cart product description (as a list) is displayed
        assertTrue(checkoutGuestPage.isShoppingCartProductDescriptionDisplayed(), "The shopping cart product description isn't displayed");
        //assert shopping cart product quantity (as a list) is displayed
        assertTrue(checkoutGuestPage.isShoppingCartProductQuantityDisplayed(), "The shopping cart product quantity isn't displayed");
        //assert shopping cart product unit price (as a list) is displayed //not every product has them
        //assertTrue(checkoutGuestPage.isShoppingCartProductUnitPriceDisplayed(), "The shopping cart product unit price isn't displayed");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert method
    protected void isGeneralPageTextElementAsExpected(HomePage homePage){
        //assert shop service hotline title matches expectations
        assertEquals("Service hotline", homePage.getShopServiceHotlineTitle(), "The shop service hotline title doesn't match expectations");
        //assert shop service hotline description matches expectations
        assertEquals("Support and counselling via:\n" +
                "0180 - 000000\n" +
                "Mon-Fri, 9 am - 5 pm", homePage.getShopServiceDescription(), "The shop service hotline description doesn't match expectations");
        //assert footer VAT description matches expectations
        assertEquals("* All prices incl. VAT plus shipping costs and possible delivery charges, if not stated otherwise.", homePage.getVATDescription(), "The footer VAT description doesn't match expectations");
        //assert footer design text matches expectations
        assertEquals("Realised with Shopware", homePage.getDesignText(), "The footer design text doesn't match expectations");
    }

    //login and register dashboard page text element assert method
    protected void isLoginRegisterDashboardPageTextElementMatchExpectations(){
        LoginRegisterDashBoardLoginSectionPage loginRegisterDashBoardLoginSectionPage = new LoginRegisterDashBoardLoginSectionPage(driver);
        LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage = new LoginRegisterDashboardRegisterSectionPage(driver);
        //assert login section title matches expectations
        assertEquals("I'm a customer already!", loginRegisterDashBoardLoginSectionPage.getLoginTitle(), "The login section title doesn't match expectations");
        //assert login section description matches expectations
        assertEquals("Log in with email address and password", loginRegisterDashBoardLoginSectionPage.getLoginDescription(), "The login section description doesn't match expectations");
        //assert login advantages description matches expectations
        assertEquals("Login advantages:\n" + "Express shopping\n" + "Save your data and settings\n" + "Order overview and shipping information\n" + "Manage your newsletter subscription", loginRegisterDashBoardLoginSectionPage.getLoginAdvantagesDescription(), "The login advantages description doesn't match expectations");
        //assert register section title matches expectations
        assertEquals("I'm a new customer!", loginRegisterDashboardRegisterSectionPage.getRegisterSectionTitle(), "The register section title doesn't match expectations");
        //assert register section password hint matches expectations
        assertEquals("Passwords must have a minimum length of 8 characters.", loginRegisterDashboardRegisterSectionPage.getPasswordHint(), "The register section password hint doesn't match expectations");
        //assert register section address subsection title matches expectations
        assertEquals("Your address", loginRegisterDashboardRegisterSectionPage.getAddressSubsectionTitle(), "The address subsection title doesn't match expectations");
        //assert register section privacy policy description matches expectations
        assertEquals("Privacy\n" + "\n" + "By selecting continue you confirm that you have read our data protection information and accepted our general terms and conditions.", loginRegisterDashboardRegisterSectionPage.getPrivacyPolicyDescription(), "The privacy policy description doesn't match expectations");
    }

    //account overview page text element assert test method
    protected void isAccountOverviewPageTextElementAsExpected(){
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        //assert account overview title matches expectations
        assertEquals("Overview", accountOverviewPage.getAccountOverviewTitle(), "The account overview page title doesn't match expectations");
        //assert account overview description matches expectations
        assertEquals("Directly access your profile information, the default payment method and given addresses.", accountOverviewPage.getAccountOverviewDescription(), "The account overview page description doesn't match expectations");
        //assert personal data subsection title matches expectations
        assertEquals("Personal data", accountOverviewPage.getPersonalDataSubsectionTitle(), "The personal data subsection title doesn't match expectations");
        //assert default payment method subsection title matches expectations
        assertEquals("Default payment method", accountOverviewPage.getDefaultPaymentMethodSubsectionTitle(), "The default payment method subsection title doesn't match expectations");
        //assert default payment method description matches expectations
        assertEquals("Payment upon receipt of goods.", accountOverviewPage.getDefaultPaymentMethodDescription(), "The default payment method description doesn't match expectations");
        //assert newsletter subsection title matches expectations
        assertEquals("Newsletter subscription", accountOverviewPage.getNewsletterSubsectionTitle(), "The newsletter subsection title doesn't match expectations");
        //assert newsletter checkbox description matches expectations
        assertEquals("Yes, I would like to subscribe to the free Shopware 6 Demo newsletter. (I may unsubscribe at any time.)", accountOverviewPage.getNewsletterCheckboxDescription(), "The newsletter checkbox description doesn't match expectations");
        //assert default billing address subsection title matches expectations
        assertEquals("Default billing address", accountOverviewPage.getDefaultBillingAddressSubsectionTitle(), "The default billing address subsection title doesn't match expectations");
        //assert default shipping address subsection title matches expectations
        assertEquals("Default shipping address", accountOverviewPage.getDefaultShippingAddressSubsectionTitle(), "The default shipping address subsection title doesn't match expectations");
    }

    //aside shopping cart text element assert method
    protected void isAsideShoppingCartTextElementAsExpected(){
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        //assert aside shopping cart title matches expectations
        assertEquals("Shopping cart", productsDashboardPage.getAsideShoppingCartTitle(), "The aside shopping cart title doesn't match expectations");
        //assert aside shopping cart prices hint matches expectations
        assertEquals("* Prices incl. VAT plus shipping costs", productsDashboardPage.getAsideShoppingCartPricesHint(), "The aside shopping cart prices hint doesn't match expectations");
    }

    //shopping cart page text element assert method
    protected void isShoppingCartPageTextElementAsExpected(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //assert aside shopping cart title matches expectations
        assertEquals("Shopping cart", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations");
        //assert aside summary subsection title matches expectations
        assertEquals("Summary", shoppingCartPage.getSummarySubsectionTitle(), "The summary subsection title doesn't match expectations");
    }

    //guest checkout page text element assert method
    protected void isCheckoutGuestTextElementAsExpected(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);
        //assert shipping info section title matches expectations
        assertEquals("Shipping information", checkoutGuestPage.getShippingInfoSectionTitle(), "The shipping information section title doesn't match expectations");
        //assert your info subsection title matches expectations
        assertEquals("Your personal details", checkoutGuestPage.getYourInfoSubsectionTitle(), "The your information subsection title doesn't match expectations");
        //assert address subsection title matches expectations
        assertEquals("Your address", checkoutGuestPage.getAddressInfoSubsectionTitle(), "The address subsection title doesn't match expectations");
        //assert privacy subsection title matches expectations
        assertEquals("Privacy", checkoutGuestPage.getPrivacySubsectionTitle(), "The privacy subsection title doesn't match expectations");
        //assert privacy text matches expectations
        assertEquals("By selecting continue you confirm that you have read our data protection information and accepted our general terms and conditions.", checkoutGuestPage.getPrivacyText(), "The privacy text doesn't match expectations");
        //assert summary section title matches expectations
        assertEquals("Summary", checkoutGuestPage.getSummarySectionTitle(), "The summary section title doesn't match expectations");
        //assert shopping cart section title matches expectations
        assertEquals("Shopping cart", checkoutGuestPage.getShoppingCartSectionTitle(), "The shopping cart section title doesn't match expectations");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //account overview data logger method
    protected void logAccountOverviewData(){
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver);
        System.out.println("Account overview displayed data:" + "\n");

        logger.info("Aside subsection title: " + accountOverviewPage.getAsideSubsectionTitle() + "\n");
        logger.info("Personal account data: " + accountOverviewPage.getPersonalData() + "\n");
        logger.info("Default billing address: " + accountOverviewPage.getDefaultBillingAddress() + "\n");
        logger.info("Default shipping address: " + accountOverviewPage.getDefaultShippingAddress() + "\n");
        logger.info("Default payment method: " + accountOverviewPage.getDefaultPaymentMethod() + "\n");
    }

    //product dashboard page data logger method
    protected void logProductDashboardData(){
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        System.out.println("Product dashboard displayed data:" + "\n");

        logger.info("Product title(s): " + productsDashboardPage.getProductTitle() + "\n");
        logger.info("Product description(s): " + productsDashboardPage.getProductDescription() + "\n");
        logger.info("Product unit price: " + productsDashboardPage.getProductUnitPrice() + "\n");

        System.out.println("\n");
    }

    //aside shopping cart (on product dashboard) data logger method
    protected void logAsideShoppingCartData(){
        ProductsDashboardPage productsDashboardPage = new ProductsDashboardPage(driver);
        System.out.println("Aside shopping cart displayed data:" + "\n");

        logger.info("Aside shopping cart item quantity: " + productsDashboardPage.getItemQuantity() + "\n");
        logger.info("Aside shopping cart product title(s): " + productsDashboardPage.getProductTitleText() + "\n");
        logger.info("Aside shopping cart product description(s): " + productsDashboardPage.getProductDescriptionText() + "\n");
        logger.info("Aside shopping cart product total price(s): " + productsDashboardPage.getProductTotalPriceText() + "\n");
        logger.info("Aside shopping cart product subtotal price: " + productsDashboardPage.getProductSubtotalPrice() + "\n");
        logger.info("Aside shopping cart product shipping costs: " + productsDashboardPage.getProductShippingCosts() + "\n");

        System.out.println("\n");
    }

    //shopping cart page data logger
    protected void logShoppingCartProductData(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        System.out.println("Shopping cart page displayed data:" + "\n");

        logger.info("Shopping cart table product description(s): " + shoppingCartPage.getTableProductDescription() + "\n");
        logger.info("Shopping cart table product quantity(ies): " + shoppingCartPage.getTableProductQuantity() + "\n");
        logger.info("Shopping cart table product unit price(s): " + shoppingCartPage.getTableProductUnitPrice() + "\n");
        logger.info("Shopping cart table product subtotal price(s): " + shoppingCartPage.getTableProductSubtotalPrice() + "\n");
        logger.info("Summary total price: " + shoppingCartPage.getSummaryTotalPrice() + "\n");
        logger.info("Summary shipping price: " + shoppingCartPage.getSummaryShippingPrice() + "\n");
        logger.info("Summary grand total price: " + shoppingCartPage.getSummaryGrandTotalPrice() + "\n");
        logger.info("Summary net total price: " + shoppingCartPage.getSummaryNetTotalPrice() + "\n");
        logger.info("Summary VAT price: " + shoppingCartPage.getSummaryVATPrice() + "\n");
    }

    //guest checkout page product data logger method
    protected void logCheckoutGuestPageProductData(){
        CheckoutGuestPage checkoutGuestPage = new CheckoutGuestPage(driver);

        System.out.println("Checkout guest page displayed product data:" + "\n");

        logger.info("Checkout (guest) summary total price: " + checkoutGuestPage.getSummaryTotalPrice() + "\n");
        logger.info("Checkout (guest) summary shipping price: " + checkoutGuestPage.getSummaryShippingPrice() + "\n");
        logger.info("Checkout (guest) summary grand total price: " + checkoutGuestPage.getSummaryGrandTotalPrice() + "\n");
        logger.info("Checkout (guest) summary net total price: " + checkoutGuestPage.getSummaryNetTotalPrice() + "\n");
        logger.info("Checkout (guest) summary VAT price: " + checkoutGuestPage.getSummaryVATPrice() + "\n");

        System.out.println("Shopping cart section data: " + "\n");

        logger.info("Checkout (guest) shopping cart product title(s): " + checkoutGuestPage.getProductTitle() + "\n");
        logger.info("Checkout (guest) shopping cart product description(s): " + checkoutGuestPage.getProductDescription() + "\n");
        logger.info("Checkout (guest) shopping cart product quantity(ies): " + checkoutGuestPage.getProductQuantity() + "\n");
        logger.info("Checkout (guest) shopping cart product unit price(s): " + checkoutGuestPage.getProductUnitPrice() + "\n");
        logger.info("Checkout (guest) shopping cart total price(s): " + checkoutGuestPage.getProductTotalPrice() + "\n");

        System.out.println("\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliJ Selenium projects\\shopWareDemoShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
