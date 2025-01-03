package io.studio_demo.shop_shopware;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

import java.util.*;

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
        //capture screenshot after valid user account creation
        captureScreenshot(driver, "Valid Male User Account Creation Test Result");
    }
    //valid user account creation test method (female)
    protected void validFemaleUserAccountCreationTest(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage){
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
