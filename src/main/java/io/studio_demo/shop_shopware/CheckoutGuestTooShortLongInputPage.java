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
    private String tooShortGuestLastName;
    private String tooShortGuestEmail;
    private String tooShortGuestAddress;
    private String tooShortGuestCity;

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
        tooShortGuestFirstName = "G";
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
    //invalid guest user data input method - too short first name (1 char)
    public void inputTooShortFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortGuestFirstName);
    }

    public void getInvalidGuestUserTooShortLastNameData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        tooShortGuestLastName = "Ghd";
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (too short last name): " + "\n");

        logger.info("Valid guest first name (too short last name): " + guestFirstName);
        logger.info("Too short guest last name: " + tooShortGuestLastName);
        logger.info("Valid guest email (too short last name): " + guestEmail);
        logger.info("Valid guest address (too short last name): " + guestAddress);
        logger.info("Valid guest city (too short last name): " + guestCity);
        logger.info("Valid guest postal code (too short last name): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - too short last name (3 chars)
    public void inputTooShortLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooShortGuestLastName);
    }

    public void getInvalidGuestUserTooShortEmailData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        tooShortGuestEmail = "j@g.com";
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (too short email address): " + "\n");

        logger.info("Valid guest first name (too short email address): " + guestFirstName);
        logger.info("Valid guest last name (too short email address): " + tooShortGuestLastName);
        logger.info("Too short guest email: " + tooShortGuestEmail);
        logger.info("Valid guest address (too short email address): " + guestAddress);
        logger.info("Valid guest city (too short email address): " + guestCity);
        logger.info("Valid guest postal code (too short email address): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - too short last name (1 char - name, domain)
    public void inputTooShortEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(tooShortGuestEmail);
    }

    public void getInvalidGuestUserTooShortAddressData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        tooShortGuestAddress = "F";
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (too short street address): " + "\n");

        logger.info("Valid guest first name (too short street address): " + guestFirstName);
        logger.info("Valid guest last name (too short street address): " + tooShortGuestLastName);
        logger.info("Valid guest email (too short street address): " + guestEmail);
        logger.info("Too short guest address: " + tooShortGuestAddress);
        logger.info("Valid guest city (too short street address): " + guestCity);
        logger.info("Valid guest postal code (too short street address): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - too short address (1 char)
    public void inputTooShortAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(streetAddressInputField));
        streetAddressInputField.sendKeys(tooShortGuestAddress);
    }

    public void getInvalidGuestUserTooShortCityData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        tooShortGuestCity = "X";
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (too short city): " + "\n");

        logger.info("Valid guest first name (too short city): " + guestFirstName);
        logger.info("Valid guest last name (too short city): " + tooShortGuestLastName);
        logger.info("Valid guest email (too short city): " + guestEmail);
        logger.info("Valid guest address (too short city): " + guestAddress);
        logger.info("Too short guest city: " + tooShortGuestCity);
        logger.info("Valid guest postal code (too short city): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - too short city (1 char)
    public void inputTooShortCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooShortGuestCity);
    }


}
