package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginRegisterDashboardRegisterSectionPage extends BasePage{


    //register section web elements
    @FindBy(xpath = "//div[@class='card register-card']//h1")
    private WebElement registerSectionTitle;
    @FindBy(xpath = "//div[@class='card register-card']//select[@id='personalSalutation']")
    private WebElement registerSectionSalutationDropdownMenu;
    @FindBy(xpath = "//select[@id='personalSalutation']/option[@value='ed782347cdec4e82a78f0eaf864b6725']")
    private WebElement salutationMrsOption;
    @FindBy(xpath = "//select[@id='personalSalutation']/option[@value='350f9afcc8fe42d887c17221531e0ff4']")
    private WebElement salutationMrOption;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalFirstName']")
    private WebElement registerSectionFirstNameInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalLastName']")
    private WebElement registerSectionLastNameInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalMail']")
    private WebElement registerSectionEmailInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='personalPassword']")
    private WebElement registerSectionPasswordInputField;
    @FindBy(xpath = "//div[@class='card register-card']//small")
    private WebElement registerSectionPasswordHint;
    @FindBy(xpath = "//div[@class='card register-card']//fieldset[@class='register-billing']/legend[@class='card-title']")
    private WebElement registerSectionAddressTitle;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressStreet']")
    private WebElement registerSectionAddressInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressCity']")
    private WebElement registerSectionCityInputField;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='billingAddressAddressZipcode']")
    private WebElement registerSectionPostalCodeInputField;
    @FindBy(xpath = "//div[@class='card register-card']//select[@id='billingAddressAddressCountry']")
    private WebElement registerSectionCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountry']/option[@value='16b9ff986274403a9d8a6a74e5898687']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//div[@class='card register-card']//select[@id='billingAddressAddressCountryState']")
    private WebElement registerSectionStateDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountryState']/option[@value='e1071de80a9d491d9a24f1667a0fa483']")
    private WebElement illinoisStateOption;
    @FindBy(xpath = "//div[@class='card register-card']//input[@id='differentShippingAddress']")
    private WebElement registerSectionShippingBillingAddressMismatchCheckbox;
    @FindBy(xpath = "//div[@class='card register-card']//fieldset[@class='form-text privacy-notice']")
    private WebElement registerSectionPrivacyPolicyDescription;
    @FindBy(xpath = "//div[@class='card register-card']//fieldset[@class='form-text privacy-notice']//a[1]")
    private WebElement registerSectionDataProtectionLink;
    @FindBy(xpath = "//div[@class='card register-card']//fieldset[@class='form-text privacy-notice']//a[2]")
    private WebElement registerSectionGeneralTermsLink;
    @FindBy(xpath = "//div[@class='card register-card']//button")
    private WebElement registerSectionContinueButton;

    //valid register data variables
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String city;
    private int postalCode;

    //missing singular input
    private String noFirstName;
    private String noLastName;
    private String noEmail;
    private String noPassword;
    private String noAddress;
    private String noCity;
    private String noPostalCode;


    public LoginRegisterDashboardRegisterSectionPage(WebDriver driver) {super(driver);}

    //valid user input data getter
    public void getValidUserInputData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Valid generated user register input data: " + "\n");

        logger.info("Valid user first name: " + firstName);
        logger.info("Valid user last name: " + lastName);
        logger.info("Valid user email: " + email);
        logger.info("Valid user password: " + password);
        logger.info("Valid user address: " + address);
        logger.info("Valid user city: " + city);
        logger.info("Valid user postal code: " + postalCode);

        System.out.println("\n");
    }

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

    //no singular input

    //invalid user input data getter - no first name
    public void getInvalidUserInputNoFirstNameData(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (no first name): " + "\n");

        logger.info("No first name: " + noFirstName);
        logger.info("Valid user last name (no first name): " + lastName);
        logger.info("Valid user email (no first name): " + email);
        logger.info("Valid user password (no first name): " + password);
        logger.info("Valid user address (no first name): " + address);
        logger.info("Valid user city (no first name): " + city);
        logger.info("Valid user postal code (no first name): " + postalCode);
    }
    //invalid user register data input method - no first name
    public void inputNoFirstNameIntoFirstNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionFirstNameInputField));
        registerSectionFirstNameInputField.sendKeys(noFirstName);
    }

    //invalid user input data getter
    public void getInvalidUserInputNoLastNameData(){
        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data(no last name): " + "\n");

        logger.info("Valid user first name (no last name): " + firstName);
        logger.info("No last name: " + noLastName);
        logger.info("Valid user email (no last name): " + email);
        logger.info("Valid user password (no last name): " + password);
        logger.info("Valid user address (no last name): " + address);
        logger.info("Valid user city (no last name): " + city);
        logger.info("Valid user postal code (no last name): " + postalCode);
    }
    //invalid user register data input method - no last name
    public void inputNoLastNameIntoLastNameInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionLastNameInputField));
        registerSectionLastNameInputField.sendKeys(noLastName);
    }

    //invalid user input data getter - no email address
    public void getInvalidUserInputNoEmailAddressData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmail = "";
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (no email address): " + "\n");

        logger.info("Valid user first name (no email address): " + firstName);
        logger.info("Valid user last name (no email address): " + lastName);
        logger.info("No user email: " + noEmail);
        logger.info("Valid user password (no email address): " + password);
        logger.info("Valid user address (no email address): " + address);
        logger.info("Valid user city (no email address): " + city);
        logger.info("Valid user postal code (no email address): " + postalCode);
    }
    //invalid user register data input method - no email address
    public void inputNoEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionEmailInputField));
        registerSectionEmailInputField.sendKeys(noEmail);
    }

    //valid user input data getter - no password
    public void getInvalidUserInputNoPasswordData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        noPassword = "";
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (no password): " + "\n");

        logger.info("Valid user first name (no password): " + firstName);
        logger.info("Valid user last name (no password): " + lastName);
        logger.info("Valid user email (no password): " + email);
        logger.info("No password: " + noPassword);
        logger.info("Valid user address (no password): " + address);
        logger.info("Valid user city (no password): " + city);
        logger.info("Valid user postal code (no password): " + postalCode);
    }
    //invalid user register data input method - no password
    public void inputNoPasswordIntoPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPasswordInputField));
        registerSectionPasswordInputField.sendKeys(noPassword);
    }

    //invalid user input data getter - no street address
    public void getInvalidUserInputNoAddressData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        noAddress = "";
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (no street address): " + "\n");

        logger.info("Valid user first name (no street address): " + firstName);
        logger.info("Valid user last name (no street address): " + lastName);
        logger.info("Valid user email (no street address): " + email);
        logger.info("Valid user password (no street address): " + password);
        logger.info("No address (no street address): " + noAddress);
        logger.info("Valid user city (no street address): " + city);
        logger.info("Valid user postal code (no street address): " + postalCode);
    }
    //invalid user register data input method - no street address
    public void inputNoAddressIntoAddressInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionAddressInputField));
        registerSectionAddressInputField.sendKeys(noAddress);
    }

    //invalid user input data getter - no city
    public void getInvalidUserInputNoCityData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        noCity = "";
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated user register input data (no city): " + "\n");

        logger.info("Valid user first name (no city): " + firstName);
        logger.info("Valid user last name (no city): " + lastName);
        logger.info("Valid user email (no city): " + email);
        logger.info("Valid user password (no city): " + password);
        logger.info("Valid user address (no city): " + address);
        logger.info("No city: " + noCity);
        logger.info("Valid user postal code (no city): " + postalCode);
    }
    //invalid user register data input method - no city
    public void inputNoCityIntoCityInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionCityInputField));
        registerSectionCityInputField.sendKeys(noCity);
    }

    //invalid user input data getter - no postal code
    public void getInvalidUserInputNoPostalCodeData(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        noPostalCode = "";

        System.out.println("Generated user register input data (no postal code): " + "\n");

        logger.info("Valid user first name (no postal code): " + firstName);
        logger.info("Valid user last name (no postal code): " + lastName);
        logger.info("Valid user email (no postal code): " + email);
        logger.info("Valid user password (no postal code): " + password);
        logger.info("Valid user address (no postal code): " + address);
        logger.info("Valid user city (no postal code): " + city);
        logger.info("No postal code: " + noPostalCode);
    }
    //invalid user register data input method - no postal code
    public void inputNoPostalCodeIntoPostCodeInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPostalCodeInputField));
        registerSectionPostalCodeInputField.sendKeys(noPostalCode);
    }

    //click 'Salutation' dropdown menu method
    public void clickSalutationDropdownMenu(){registerSectionSalutationDropdownMenu.click();}
    //select 'Mr.' option method
    public void selectMrSalutation(){salutationMrOption.click();}
    //select 'Mrs.' option method
    public void selectMrsSalutation(){salutationMrsOption.click();}

    //click country dropdown menu method
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(registerSectionCountryDropdownMenu));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", registerSectionCountryDropdownMenu);
        jsExecutor.executeScript("arguments[0].click();", registerSectionCountryDropdownMenu); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    //select 'United States' option method
    public void selectUSOption(){usCountryOption.click();}

    //click state dropdown menu method
    public void clickStateDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(registerSectionStateDropdownMenu));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", registerSectionStateDropdownMenu); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    //select 'Illinois' option method
    public void selectIllinoisOption(){illinoisStateOption.click();}

    //click 'Continue' button
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(registerSectionContinueButton));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", registerSectionContinueButton); //js click (common click fails throws ElementClickInterceptedException for some reason)

    }

    //register section title getter
    public String getRegisterSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(registerSectionTitle));
        return registerSectionTitle.getText();
    }
    //register section password hint getter
    public String getPasswordHint() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPasswordHint));
        return registerSectionPasswordHint.getText();
    }
    //register section address subsection getter
    public String getAddressSubsectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(registerSectionAddressTitle));
        return registerSectionAddressTitle.getText();
    }
    //register section privacy policy description getter
    public String getPrivacyPolicyDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(registerSectionPrivacyPolicyDescription));
        return registerSectionPrivacyPolicyDescription.getText();
    }

    //login data private getters
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    //register section web element assert method
    public boolean isRegisterSectionTitleDisplayed(){return registerSectionTitle.isDisplayed();}
    public boolean isRegisterSectionSalutationDropdownMenuDisplayed(){return registerSectionSalutationDropdownMenu.isDisplayed();}
    public boolean isRegisterSectionFirstNameInputFieldDisplayed(){return registerSectionFirstNameInputField.isDisplayed();}
    public boolean isRegisterSectionLastNameInputFieldDisplayed(){return registerSectionLastNameInputField.isDisplayed();}
    public boolean isRegisterSectionEmailInputFieldDisplayed(){return registerSectionEmailInputField.isDisplayed();}
    public boolean isRegisterSectionPasswordInputFieldDisplayed(){return registerSectionPasswordInputField.isDisplayed();}
    public boolean isRegisterSectionPasswordHintDisplayed(){return registerSectionPasswordHint.isDisplayed();}
    public boolean isRegisterSectionAddressTitleDisplayed(){return registerSectionAddressTitle.isDisplayed();}
    public boolean isRegisterSectionAddressInputFieldDisplayed(){return registerSectionAddressInputField.isDisplayed();}
    public boolean isRegisterSectionCityInputFieldDisplayed(){return registerSectionCityInputField.isDisplayed();}
    public boolean isRegisterSectionPostalCodeInputFieldDisplayed() {return registerSectionPostalCodeInputField.isDisplayed();}
    public boolean isRegisterSectionCountryDropdownMenuDisplayed() {return registerSectionCountryDropdownMenu.isDisplayed();}
    public boolean isRegisterSectionShippingCheckboxDisplayed() {return registerSectionShippingBillingAddressMismatchCheckbox.isDisplayed();}
    public boolean isRegisterSectionPrivacyPolicyDescriptionDisplayed() {return registerSectionPrivacyPolicyDescription.isDisplayed();}
    public boolean isRegisterSectionDataProtectionLinkDisplayed() {return registerSectionDataProtectionLink.isDisplayed();}
    public boolean isRegisterSectionGeneralTermsLinkDisplayed() {return registerSectionGeneralTermsLink.isDisplayed();}
    public boolean isRegisterSectionContinueButtonDisplayed() {return registerSectionContinueButton.isDisplayed();}
}
