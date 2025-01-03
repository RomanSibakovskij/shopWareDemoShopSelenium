package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

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
    //used email error element
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    private WebElement usedEmailError;

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
    private String invalidEmailFormat;
    private String invalidAddressFormat;
    private String invalidCityFormat;
    private String invalidPostalCodeFormat;

    //existing email variable (sed beforehand in manual testing)
    private String existingEmail;

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

    //invalid user input data getter - invalid email format (missing '@')
    public void getInvalidUserInputInvalidEmailFormatData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "checkerfakemail.com";
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (invalid email format): " + "\n");

        logger.info("Valid user first name (invalid email format): " + firstName);
        logger.info("Valid user last name (invalid email format): " + lastName);
        logger.info("Invalid user email format: " + invalidEmailFormat);
        logger.info("Valid user password (invalid email format): " + password);
        logger.info("Valid user address (invalid email format): " + address);
        logger.info("Valid user city (invalid email format): " + city);
        logger.info("Valid user postal code (invalid email format): " + postalCode);
    }
    //invalid user register data input method - invalid email format (missing '@')
    public void inputInvalidEmailFormatIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionEmailInputField));
        registerSectionEmailInputField.sendKeys(invalidEmailFormat);
    }
    //invalid user input data getter - existing email address (the one already used in manual testing)
    public void getInvalidUserInputExistingEmailData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        existingEmail = "m0@example.com";
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (existing email): " + "\n");

        logger.info("Valid user first name (existing email): " + firstName);
        logger.info("Valid user last name (existing email): " + lastName);
        logger.info("Existing user email: " + existingEmail);
        logger.info("Valid user password (existing email): " + password);
        logger.info("Valid user address (existing email): " + address);
        logger.info("Valid user city (existing email): " + city);
        logger.info("Valid user postal code (existing email): " + postalCode);
    }
    //invalid user register data input method - existing email address (th one used beforehand in manual testing)
    public void inputExistingEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionEmailInputField));
        registerSectionEmailInputField.sendKeys(existingEmail);
    }

    //invalid user input data getter - invalid address format (special symbols only)
    public void getInvalidUserInputInvalidAddressFormatData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        invalidAddressFormat = "!@!@$##%%&&^(&)*()(&*^%^$%#@$#@!#!@$@#$%&^*&(*)(&*^&%";
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (invalid address format): " + "\n");

        logger.info("Valid user first name (invalid address format): " + firstName);
        logger.info("Valid user last name (invalid address format): " + lastName);
        logger.info("Valid user email (invalid address format): " + email);
        logger.info("Valid user password (invalid address format): " + password);
        logger.info("Invalid user address format: " + invalidAddressFormat);
        logger.info("Valid user city (invalid address format): " + city);
        logger.info("Valid user postal code (invalid address format): " + postalCode);
    }
    //invalid user register data input method - invalid address format (special symbols only)
    public void inputInvalidAddressFormatIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionAddressInputField));
        registerSectionAddressInputField.sendKeys(invalidAddressFormat);
    }

    //invalid user input data getter - invalid city format (special symbols only)
    public void getInvalidUserInputInvalidCityFormatData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        invalidCityFormat = "!@$%#$^*&(*&%$^%#$@#!$#%$^%";
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too long city): " + "\n");

        logger.info("Valid user first name (too long city): " + firstName);
        logger.info("Valid user last name (too long city): " + lastName);
        logger.info("Valid user email (too long city): " + email);
        logger.info("Valid user password (too long city): " + password);
        logger.info("Valid user address (too long city): " + address);
        logger.info("Invalid user city format: " + invalidCityFormat);
        logger.info("Valid user postal code (too long city): " + postalCode);
    }
    //invalid user register data input method - invalid city format (special symbols only)
    public void inputInvalidCityFormatIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionCityInputField));
        registerSectionCityInputField.sendKeys(invalidCityFormat);
    }

    //invalid user input data getter - invalid postal code format (special symbols only)
    public void getInvalidUserInputInvalidPostalCodeFormatData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        invalidPostalCodeFormat = "!#@#%#$%^&%^*&^%^";

        System.out.println("Generated user register input data (invalid postal code format): " + "\n");

        logger.info("Valid user first name (invalid postal code format): " + firstName);
        logger.info("Valid user last name (invalid postal code format): " + lastName);
        logger.info("Valid user email (invalid postal code format): " + email);
        logger.info("Valid user password (invalid postal code format): " + password);
        logger.info("Valid user address (invalid postal code format): " + address);
        logger.info("Valid user city (invalid postal code format): " + city);
        logger.info("Invalid user postal code format: " + invalidPostalCodeFormat);
    }
    //invalid user register data input method - invalid postal code format (special symbols only)
    public void inputInvalidPostalCodeFormatIntoPostCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPostalCodeInputField));
        registerSectionPostalCodeInputField.sendKeys(invalidPostalCodeFormat);
    }

    //used email error bar text getter
    public String getUsedEmailErrorText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(usedEmailError));
        return usedEmailError.getText();
    }
}
