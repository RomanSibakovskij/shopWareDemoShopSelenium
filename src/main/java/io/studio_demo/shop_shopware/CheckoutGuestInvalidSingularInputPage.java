package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestInvalidSingularInputPage extends BasePage{

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
    //invalid singular input error message web element
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement invalidSingularInputError;

    //valid guest user data
    private String guestFirstName;
    private String guestLastName;
    private String guestEmail;
    private String guestAddress;
    private String guestCity;
    private int guestPostalCode;

    //invalid singular input data format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;
    private String invalidEmailFormat;


    public CheckoutGuestInvalidSingularInputPage(WebDriver driver) {super(driver);}

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

    //invalid singular input error getter
    public String getInvalidSingularInputError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(invalidSingularInputError));
        return invalidSingularInputError.getText();
    }

    //invalid singular input format methods

    public void getInvalidGuestUserInvalidFirstNameData(){
        invalidFirstNameFormat = "123#$#@$%#$^#$%#$@2323";
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (invalid first name format): " + "\n");

        logger.info("Invalid guest first name format: " + invalidFirstNameFormat);
        logger.info("Valid guest last name (invalid first name format): " + guestLastName);
        logger.info("Valid guest email (invalid first name format): " + guestEmail);
        logger.info("Valid guest address (invalid first name format): " + guestAddress);
        logger.info("Valid guest city (invalid first name format): " + guestCity);
        logger.info("Valid guest postal code (invalid first name format): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - invalid first name format (numbers and special symbols)
    public void inputInvalidFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(invalidFirstNameFormat);
    }

    public void getInvalidGuestUserInvalidLastNameData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        invalidLastNameFormat = "65756%^^$%$%^$2312312313&%^&*()*(";
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (invalid last name format): " + "\n");

        logger.info("Valid guest first name (invalid last name format): " + guestFirstName);
        logger.info("Invalid guest last name format: " + invalidLastNameFormat);
        logger.info("Valid guest email (invalid last name format): " + guestEmail);
        logger.info("Valid guest address (invalid last name format): " + guestAddress);
        logger.info("Valid guest city (invalid last name format): " + guestCity);
        logger.info("Valid guest postal code (invalid last name format): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - invalid last name format (numbers and special symbols)
    public void inputInvalidLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(invalidLastNameFormat);
    }

    public void getInvalidGuestUserInvalidEmailData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "maker343yahoo.com";
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (invalid email address format): " + "\n");

        logger.info("Valid guest first name (invalid email address format): " + guestFirstName);
        logger.info("Valid guest last name (invalid email address format): " + guestLastName);
        logger.info("Invalid guest email format: " + invalidEmailFormat);
        logger.info("Valid guest address (invalid email address format): " + guestAddress);
        logger.info("Valid guest city (invalid email address format): " + guestCity);
        logger.info("Valid guest postal code (invalid email address format): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - invalid email format (missing '@')
    public void inputInvalidEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(invalidEmailFormat);
    }

}
