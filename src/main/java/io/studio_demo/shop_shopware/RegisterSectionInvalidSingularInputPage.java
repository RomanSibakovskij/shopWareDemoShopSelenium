package io.studio_demo.shop_shopware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSectionInvalidSingularInputPage extends BasePage{

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

    //invalid singular input data variables
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;

    public RegisterSectionInvalidSingularInputPage(WebDriver driver) {super(driver);}

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

    //invalid singular input format methods

    //invalid user input data getter - invalid first name format (numbers and special symbols)
    public void getInvalidUserInputInvalidFirstNameData(){
        invalidFirstNameFormat = "123#$#@$%#$^#$%#$@2323";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (invalid first name format): " + "\n");

        logger.info("Invalid user first name format: " + invalidFirstNameFormat);
        logger.info("Valid user last name (invalid first name format): " + lastName);
        logger.info("Valid user email (invalid first name format): " + email);
        logger.info("Valid user password (invalid first name format): " + password);
        logger.info("Valid user address (invalid first name format): " + address);
        logger.info("Valid user city (invalid first name format): " + city);
        logger.info("Valid user postal code (invalid first name format): " + postalCode);
    }
    //invalid user register data input method - invalid first name format (numbers and special symbols)
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionFirstNameInputField));
        registerSectionFirstNameInputField.sendKeys(invalidFirstNameFormat);
    }

    //invalid user input data getter - invalid last name format (numbers and special symbols)
    public void getInvalidUserInputInvalidLastNameData(){
        firstName = TestDataGenerator.getRandomFirstName();
        invalidLastNameFormat = "65756%^^$%$%^$2312312313&%^&*()*(";
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (invalid last name format): " + "\n");

        logger.info("Valid user first name (invalid last name format): " + firstName);
        logger.info("Invalid user last name format: " + invalidLastNameFormat);
        logger.info("Valid user email (invalid last name format): " + email);
        logger.info("Valid user password (invalid last name format): " + password);
        logger.info("Valid user address (invalid last name format): " + address);
        logger.info("Valid user city (invalid last name format): " + city);
        logger.info("Valid user postal code (invalid last name format): " + postalCode);
    }
    //invalid user register data input method - invalid last name format (numbers and special symbols)
    public void inputInvalidLastNameFormatIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionLastNameInputField));
        registerSectionLastNameInputField.sendKeys(invalidLastNameFormat);
    }

}
