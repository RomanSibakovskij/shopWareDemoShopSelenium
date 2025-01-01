package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginRegisterDashboardRegisterSectionPage extends BasePage{


    //register section web elements
    @FindBy(xpath = "//div[@class='card register-card']//h1")
    private WebElement registerSectionTitle;
    @FindBy(xpath = "//div[@class='card register-card']//select[@id='personalSalutation']")
    private WebElement registerSectionSalutationDropdownMenu;
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



    public LoginRegisterDashboardRegisterSectionPage(WebDriver driver) {super(driver);}

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
