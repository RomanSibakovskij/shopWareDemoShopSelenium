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
        //capture screenshot of the test result
        captureScreenshot(driver, "User Navigation To Login And Register Dashboard Page Result");
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\IntelliJ Selenium projects\\shopWareDemoShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
