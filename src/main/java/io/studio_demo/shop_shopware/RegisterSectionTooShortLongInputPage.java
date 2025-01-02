package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

public class RegisterSectionTooShortLongInputPage extends BasePage{

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

    public RegisterSectionTooShortLongInputPage(WebDriver driver) {super(driver);}

}
