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
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement accountCreationErrorBar;

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
    private String tooShortAddress;
    private String tooShortCity;
    private int tooShortPostalCode;

    //too long singular input data
    private String tooLongFirstName;
    private String tooLongLastName;

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

    //too short singular input

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

    //invalid user input data getter - too short last name (3 chars)
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

    //invalid user input data getter - too short address (1 char)
    public void getInvalidUserInputTooShortAddressData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        tooShortAddress = "H";
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short address): " + "\n");

        logger.info("Valid user first name (too short address): " + firstName);
        logger.info("Valid user last name (too short address): " + lastName);
        logger.info("Valid user email (too short address): " + email);
        logger.info("Valid user password (too short address): " + password);
        logger.info("Too short user address: " + tooShortAddress);
        logger.info("Valid user city (too short address): " + city);
        logger.info("Valid user postal code (too short address): " + postalCode);
    }
    //invalid user register data input method - too short address (1 char)
    public void inputTooShortAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionAddressInputField));
        registerSectionAddressInputField.sendKeys(tooShortAddress);
    }

    //invalid user input data getter - too short city (1 char)
    public void getInvalidUserInputTooShortCityData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        tooShortCity = "Z";
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too short city): " + "\n");

        logger.info("Valid user first name (too short city): " + firstName);
        logger.info("Valid user last name (too short city): " + lastName);
        logger.info("Valid user email (too short city): " + email);
        logger.info("Valid user password (too short city): " + password);
        logger.info("Valid user address (too short city): " + address);
        logger.info("Too short user city: " + tooShortCity);
        logger.info("Valid user postal code (too short city): " + postalCode);
    }
    //invalid user register data input method - too short city (1 char)
    public void inputTooShortCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionCityInputField));
        registerSectionCityInputField.sendKeys(tooShortCity);
    }

    //invalid user input data getter - too short postal code (2 digits)
    public void getInvalidUserInputTooShortPostalCodeData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        tooShortPostalCode = 21;

        System.out.println("Generated user register input data (too short postal code): " + "\n");

        logger.info("Valid user first name (too short postal code): " + firstName);
        logger.info("Valid user last name (too short postal code): " + lastName);
        logger.info("Valid user email (too short postal code): " + email);
        logger.info("Valid user password (too short postal code): " + password);
        logger.info("Valid user address (too short postal code): " + address);
        logger.info("Valid user city (too short postal code): " + city);
        logger.info("Too short user postal code: " + tooShortPostalCode);
    }
    //invalid user register data input method - too short postal code (2 digits)
    public void inputTooShortPostalCodeIntoPostCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPostalCodeInputField));
        registerSectionPostalCodeInputField.sendKeys(String.valueOf(tooShortPostalCode));
    }

    //too long singular input

    //invalid user input data getter - too long first name (100 chars)
    public void getInvalidUserInputTooLongFirstNameData(){
        tooLongFirstName = "Rsfssdfsdfsretrjyuloipvlmjhkjhnxvdfsadfsdfhjyuooipkuyjhtgrfsdeghfgjjlhjnbfbvddfhggkjuiuyfdrtyujgdffg";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too long first name): " + "\n");

        logger.info("Too long user first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long first name): " + lastName);
        logger.info("Valid user email (too long first name): " + email);
        logger.info("Valid user password (too long first name): " + password);
        logger.info("Valid user address (too long first name): " + address);
        logger.info("Valid user city (too long first name): " + city);
        logger.info("Valid user postal code (too long first name): " + postalCode);
    }
    //invalid user register data input method - too short first name (100 char is usually too long)
    public void inputTooLongFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionFirstNameInputField));
        registerSectionFirstNameInputField.sendKeys(tooLongFirstName);
    }

    //invalid user input data getter - too long last name (110 chars)
    public void getInvalidUserInputTooLongLastNameData(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "Vhgghghkuiksfssdfsdfsretrjyuloipvlmjhkjhnxvdfsadfsdfhjyuooipkuyjhtgrfsdeghfgjjlhjnbfbvddfhggkjuiuyfdrtyujgdffg";
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (too long last name): " + "\n");

        logger.info("Valid user first name (too long last name): " + firstName);
        logger.info("Too long user last name: " + tooLongLastName);
        logger.info("Valid user email (too long last name): " + email);
        logger.info("Valid user password (too long last name): " + password);
        logger.info("Valid user address (too long last name): " + address);
        logger.info("Valid user city (too long last name): " + city);
        logger.info("Valid user postal code (too long last name): " + postalCode);
    }
    //invalid user register data input method - too short last name (110 char is usually too long)
    public void inputTooLongLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionLastNameInputField));
        registerSectionLastNameInputField.sendKeys(tooLongLastName);
    }

    //account creation error bar text getter
    public String getAccountCreationErrorText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(accountCreationErrorBar));
        return accountCreationErrorBar.getText();
    }
}
