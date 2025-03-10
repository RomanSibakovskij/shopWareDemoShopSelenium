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
    private String invalidAddressFormat;
    private String invalidCityFormat;
    private String invalidPostalCodeFormat;

    //existing email input
    private String existingEmail;


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

    public void getInvalidGuestUserExistingEmailData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        existingEmail = "m0@example.com";
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (existing email address): " + "\n");

        logger.info("Valid guest first name (existing email address): " + guestFirstName);
        logger.info("Valid guest last name (existing email address): " + guestLastName);
        logger.info("Existing email address: " + existingEmail);
        logger.info("Valid guest address (existing email address): " + guestAddress);
        logger.info("Valid guest city (existing email address): " + guestCity);
        logger.info("Valid guest postal code (existing email address): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - existing email (already used in manual testing)
    public void inputExistingEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(existingEmail);
    }

    public void getInvalidGuestUserInvalidAddressData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        invalidAddressFormat = "!@!@$##%%&&^(&)*()(&*^%^$%#@$#@!#!@$@#$%&^*&(*)(&*^&%";
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (invalid street address format): " + "\n");

        logger.info("Valid guest first name (invalid street address format): " + guestFirstName);
        logger.info("Valid guest last name (invalid street address format): " + guestLastName);
        logger.info("Valid guest email (invalid street address format): " + guestEmail);
        logger.info("Invalid guest address: " + invalidAddressFormat);
        logger.info("Valid guest city (invalid street address format): " + guestCity);
        logger.info("Valid guest postal code (invalid street address format): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - invalid street address format (special symbols only)
    public void inputInvalidAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(streetAddressInputField));
        streetAddressInputField.sendKeys(invalidAddressFormat);
    }

    public void getInvalidGuestUserInvalidCityData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        invalidCityFormat = "!@$%#$^*&(*&%$^%#$@#!$#%$^%";
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid guest user data (invalid city format): " + "\n");

        logger.info("Valid guest first name (invalid city format): " + guestFirstName);
        logger.info("Valid guest last name (invalid city format): " + guestLastName);
        logger.info("Valid guest email (invalid city format): " + guestEmail);
        logger.info("Valid guest address (invalid city format): " + guestAddress);
        logger.info("Invalid guest city format: " + invalidCityFormat);
        logger.info("Valid guest postal code (invalid city format): " + guestPostalCode + "\n");
    }
    //invalid guest user data input method - invalid city format (special symbols only)
    public void inputInvalidCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(invalidCityFormat);
    }

    public void getInvalidGuestUserInvalidPostalCodeData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        invalidPostalCodeFormat = "!#@#%#$%^&%^*&^%^";

        System.out.println("Generated invalid guest user data (invalid postal code format): " + "\n");

        logger.info("Valid guest first name (invalid postal code format): " + guestFirstName);
        logger.info("Valid guest last name (invalid postal code format): " + guestLastName);
        logger.info("Valid guest email (invalid postal code format): " + guestEmail);
        logger.info("Valid guest address (invalid postal code format): " + guestAddress);
        logger.info("Valid guest city (invalid postal code format): " + guestCity);
        logger.info("Invalid guest postal code format: " + invalidPostalCodeFormat + "\n");
    }
    //invalid guest user data input method - invalid postal code format (special symbols only)
    public void inputInvalidPostalCodeIntoPostalCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(invalidPostalCodeFormat);
    }

}
