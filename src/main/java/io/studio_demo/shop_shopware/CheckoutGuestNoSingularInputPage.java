package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestNoSingularInputPage extends BasePage{

    //input form web elements
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='personalSalutation']")
    private WebElement salutationDropdownMenu;
    @FindBy(xpath = "//select[@id='personalSalutation']/option[@value='350f9afcc8fe42d887c17221531e0ff4']")
    private WebElement salutationMrOption;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalFirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalLastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalGuest']")
    private WebElement createCustomerAccountCheckbox;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='personalMail']")
    private WebElement emailInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//fieldset[@class='register-billing']/legend[@class='card-title']")
    private WebElement addressSubsectionTitle;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressStreet']")
    private WebElement streetAddressInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressCity']")
    private WebElement cityInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='billingAddressAddressZipcode']")
    private WebElement postalCodeInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='billingAddressAddressCountry']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountry']/option[@value='16b9ff986274403a9d8a6a74e5898687']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='billingAddressAddressCountryState']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//select[@id='billingAddressAddressCountryState']/option[@value='e1071de80a9d491d9a24f1667a0fa483']")
    private WebElement illinoisStateOption;

    public CheckoutGuestNoSingularInputPage(WebDriver driver) {super(driver);}


}
