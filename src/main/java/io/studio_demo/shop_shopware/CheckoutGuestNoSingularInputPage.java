package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestNoSingularInputPage extends BasePage{

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

    public void getInvalidGuestUserNoLastNameData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        noGuestLastName = "";
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (no last name): " + "\n");

        logger.info("Valid guest first name (no last name): " + guestFirstName);
        logger.info("No guest last name: " + noGuestLastName);
        logger.info("Valid guest email (no last name): " + guestEmail);
        logger.info("Valid guest address (no last name): " + guestAddress);
        logger.info("Valid guest city (no last name): " + guestCity);
        logger.info("Valid guest postal code (no last name): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - no last name
    public void inputNoLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noGuestLastName);
    }

    public void getInvalidGuestUserNoEmailData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        noGuestEmail = "";
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (no email): " + "\n");

        logger.info("Valid guest first name (no email): " + guestFirstName);
        logger.info("Valid guest last name (no email): " + guestLastName);
        logger.info("No guest email: " + noGuestEmail);
        logger.info("Valid guest address (no email): " + guestAddress);
        logger.info("Valid guest city (no email): " + guestCity);
        logger.info("Valid guest postal code (no email): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - no email
    public void inputNoEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(noGuestEmail);
    }

    public void getInvalidGuestUserNoAddressData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        noGuestAddress = "";
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (no guest address): " + "\n");

        logger.info("Valid guest first name (no guest address): " + guestFirstName);
        logger.info("Valid guest last name (no guest address): " + guestLastName);
        logger.info("Valid guest email (no guest address): " + guestEmail);
        logger.info("No guest address: " + noGuestAddress);
        logger.info("Valid guest city (no guest address): " + guestCity);
        logger.info("Valid guest postal code (no guest address): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - no address
    public void inputNoAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(streetAddressInputField));
        streetAddressInputField.sendKeys(noGuestAddress);
    }

    public void getInvalidGuestUserNoCityData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        noGuestCity = "";
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (no guest city): " + "\n");

        logger.info("Valid guest first name (no guest city): " + guestFirstName);
        logger.info("Valid guest last name (no guest city): " + guestLastName);
        logger.info("Valid guest email (no guest city): " + guestEmail);
        logger.info("Valid guest address (no guest city): " + guestAddress);
        logger.info("No guest city: " + noGuestCity);
        logger.info("Valid guest postal code (no guest city): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - no city
    public void inputNoCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(noGuestCity);
    }

    public void getInvalidGuestUserNoPostalCodeData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        noGuestPostalCode = "";

        System.out.println("Generated invalid guest user data (no guest postal code): " + "\n");

        logger.info("Valid guest first name (no guest postal code): " + guestFirstName);
        logger.info("Valid guest last name (no guest postal code): " + guestLastName);
        logger.info("Valid guest email (no guest postal code): " + guestEmail);
        logger.info("Valid guest address (no guest postal code): " + guestAddress);
        logger.info("Valid guest city (no guest postal code): " + guestCity);
        logger.info("No guest postal code: " + noGuestPostalCode + "\n");
    }
    //invalid guest user data input method - no postal code
    public void inputNoPostalCodeIntoPostalCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(noGuestPostalCode);
    }


}
