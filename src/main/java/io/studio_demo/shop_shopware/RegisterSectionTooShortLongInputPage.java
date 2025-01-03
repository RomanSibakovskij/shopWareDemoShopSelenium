package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class RegisterSectionTooShortLongInputPage extends BasePage{

    //register section web elements
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalFirstName']")
    private WebElement registerSectionFirstNameInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalLastName']")
    private WebElement registerSectionLastNameInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalMail']")
    private WebElement registerSectionEmailInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalPassword']")
    private WebElement registerSectionPasswordInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressStreet']")
    private WebElement registerSectionAddressInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressCity']")
    private WebElement registerSectionCityInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressZipcode']")
    private WebElement registerSectionPostalCodeInputField;

    //valid register data variables
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String city;
    private int postalCode;

    //too short singular input data
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortEmail;
    private String tooShortPassword;

    public RegisterSectionTooShortLongInputPage(WebDriver driver) {super(driver);}

    //valid user register data input methods
    public void inputFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionFirstNameInputField));
        registerSectionFirstNameInputField.sendKeys(firstName);
    }
    public void inputLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionLastNameInputField));
        registerSectionLastNameInputField.sendKeys(lastName);
    }
    public void inputEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionEmailInputField));
        registerSectionEmailInputField.sendKeys(email);
    }
    public void inputPasswordIntoPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPasswordInputField));
        registerSectionPasswordInputField.sendKeys(password);
    }
    public void inputAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionAddressInputField));
        registerSectionAddressInputField.sendKeys(address);
    }
    public void inputCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionCityInputField));
        registerSectionCityInputField.sendKeys(city);
    }
    public void inputPostalCodeIntoPostCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPostalCodeInputField));
        registerSectionPostalCodeInputField.sendKeys(String.valueOf(postalCode));
    }

    //invalid user input data getter - too short first name (1 char)
    public void getInvalidUserInputTooShortFirstNameData(){
        tooShortFirstName = "Q";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short first name): " + "\n");

        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short first name): " + lastName);
        logger.info("Valid user email (too short first name): " + email);
        logger.info("Valid user password (too short first name): " + password);
        logger.info("Valid user address (too short first name): " + address);
        logger.info("Valid user city (too short first name): " + city);
        logger.info("Valid user postal code (too short first name): " + postalCode);
    }
    //invalid user register data input method - too short first name (1 char is usually too short)
    public void inputTooShortFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionFirstNameInputField));
        registerSectionFirstNameInputField.sendKeys(tooShortFirstName);
    }

    //invalid user input data getter - too short first name (3 chars)
    public void getInvalidUserInputTooShortLastNameData(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "Kgr";
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short last name): " + "\n");

        logger.info("Valid user first name (too short last name): " + firstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user email (too short last name): " + email);
        logger.info("Valid user password (too short last name): " + password);
        logger.info("Valid user address (too short last name): " + address);
        logger.info("Valid user city (too short last name): " + city);
        logger.info("Valid user postal code (too short last name): " + postalCode);
    }
    //invalid user register data input method - too short last name (3 chars is usually too short)
    public void inputTooShortLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionLastNameInputField));
        registerSectionLastNameInputField.sendKeys(tooShortLastName);
    }

    //invalid user input data getter - too short email (1 char) (name and domain)
    public void getInvalidUserInputTooShortEmailData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortEmail = "s@f.org";
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short email): " + "\n");

        logger.info("Valid user first name (too short email): " + firstName);
        logger.info("Valid user last name (too short email): " + lastName);
        logger.info("Too short user email: " + tooShortEmail);
        logger.info("Valid user password (too short email): " + password);
        logger.info("Valid user address (too short email): " + address);
        logger.info("Valid user city (too short email): " + city);
        logger.info("Valid user postal code (too short email): " + postalCode);
    }
    //invalid user register data input method - too short email (1 char - name, domain)
    public void inputTooShortEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionEmailInputField));
        registerSectionEmailInputField.sendKeys(tooShortEmail);
    }

    //invalid user input data getter - too short password (7 chars)
    public void getInvalidUserInputTooShortPasswordData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        tooShortPassword = "KjnG67#";
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short password): " + "\n");

        logger.info("Valid user first name (too short password): " + firstName);
        logger.info("Valid user last name (too short password): " + lastName);
        logger.info("Valid user email (too short password): " + email);
        logger.info("Too short user password: " + tooShortPassword);
        logger.info("Valid user address (too short password): " + address);
        logger.info("Valid user city (too short password): " + city);
        logger.info("Valid user postal code (too short password): " + postalCode);
    }
    //invalid user register data input method - too short password (7 chars)
    public void inputTooShortPasswordIntoPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPasswordInputField));
        registerSectionPasswordInputField.sendKeys(tooShortPassword);
    }

}
