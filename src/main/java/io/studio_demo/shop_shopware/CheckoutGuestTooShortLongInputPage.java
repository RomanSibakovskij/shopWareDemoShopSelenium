package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestTooShortLongInputPage extends BasePage{

    //input form web elements
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalFirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalLastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalMail']")
    private WebElement emailInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressStreet']")
    private WebElement streetAddressInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressCity']")
    private WebElement cityInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressZipcode']")
    private WebElement postalCodeInputField;

    //valid guest user data
    private String guestFirstName;
    private String guestLastName;
    private String guestEmail;
    private String guestAddress;
    private String guestCity;
    private int guestPostalCode;

    //too short singular input data
    private String tooShortGuestFirstName;

    public CheckoutGuestTooShortLongInputPage(WebDriver driver) {super(driver);}

    //valid guest user data input methods
    public void inputGuestFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(guestFirstName);
    }
    public void inputGuestLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(guestLastName);
    }
    public void inputGuestEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(guestEmail);
    }
    public void inputGuestAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(streetAddressInputField));
        streetAddressInputField.sendKeys(guestAddress);
    }
    public void inputGuestCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(guestCity);
    }
    public void inputGuestPostalCodeIntoPostCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(String.valueOf(guestPostalCode));
    }

    //too short singular input methods

    public void getInvalidGuestUserTooShortFirstNameData(){
        tooShortGuestFirstName = "";
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (too short first name): " + "\n");

        logger.info("Too short guest first name: " + tooShortGuestFirstName);
        logger.info("Valid guest last name (too short first name): " + guestLastName);
        logger.info("Valid guest email (too short first name): " + guestEmail);
        logger.info("Valid guest address (too short first name): " + guestAddress);
        logger.info("Valid guest city (too short first name): " + guestCity);
        logger.info("Valid guest postal code (too short first name): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - too short first name
    public void inputTooShortFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortGuestFirstName);
    }


}
