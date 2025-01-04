package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestNoSingularInputPage extends BasePage{

    //input form web elements
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='personalSalutation']")
    private WebElement salutationDropdownMenu;
    @FindBy(xpath = "//select[@id='personalSalutation']/option[@value='350f9afcc8fe42d887c17221531e0ff4']")
    private WebElement salutationMrOption;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalFirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalLastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalGuest']")
    private WebElement createCustomerAccountCheckbox;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalMail']")
    private WebElement emailInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//fieldset[@class='register-billing']/legend[@class='card-title']")
    private WebElement addressSubsectionTitle;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressStreet']")
    private WebElement streetAddressInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressCity']")
    private WebElement cityInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressZipcode']")
    private WebElement postalCodeInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='billingAddressAddressCountry']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountry']/option[@value='16b9ff986274403a9d8a6a74e5898687']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='billingAddressAddressCountryState']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountryState']/option[@value='e1071de80a9d491d9a24f1667a0fa483']")
    private WebElement illinoisStateOption;

    //valid guest user data getter
    private String guestFirstName;
    private String guestLastName;
    private String guestEmail;
    private String guestAddress;
    private String guestCity;
    private int guestPostalCode;

    //no singular input data
    private String noGuestFirstName;
    private String noGuestLastName;
    private String noGuestEmail;
    private String noGuestAddress;
    private String noGuestCity;
    private String noGuestPostalCode;

    public CheckoutGuestNoSingularInputPage(WebDriver driver) {super(driver);}

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

    //no singular input methods

    public void getInvalidGuestUserNoFirstNameData(){

        noGuestFirstName = "";
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (no first name): " + "\n");

        logger.info("No guest first name: " + guestFirstName);
        logger.info("Valid guest last name (no first name): " + guestLastName);
        logger.info("Valid guest email (no first name): " + guestEmail);
        logger.info("Valid guest address (no first name): " + guestAddress);
        logger.info("Valid guest city (no first name): " + guestCity);
        logger.info("Valid guest postal code (no first name): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - no first name
    public void inputNoFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noGuestFirstName);
    }


}
