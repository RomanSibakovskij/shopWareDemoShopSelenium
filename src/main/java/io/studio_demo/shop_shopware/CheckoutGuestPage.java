package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class CheckoutGuestPage extends BasePage{

    //checkout guest page web elements
    @FindBy(xpath = "//a[@class='login-collapse-toggle']")
    private WebElement loginLink;

    //shipping information section title
    @FindBy(xpath = "//div[@class='checkout-main']//h1[@class='address-main-header']")
    private WebElement shippingInfoSectionTitle;
    @FindBy(xpath = "//div[@class='checkout-main']//h1[@class='card-title']")
    private WebElement yourInfoSubsectionTitle;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='personalSalutation']")
    private WebElement salutationDropdownMenu;
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
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='differentShippingAddress']")
    private WebElement shippingBillingAddressMismatchCheckbox;
    @FindBy(xpath = "//div[@class='checkout-main']//fieldset[@class='form-text privacy-notice']/legend")
    private WebElement privacySubsectionTitle;
    @FindBy(xpath = "//div[@class='data-protection-information']//a[1]")
    private WebElement dataProtectionInfoLink;
    @FindBy(xpath = "//div[@class='data-protection-information']//a[2]")
    private WebElement termsConditionsLink;
    @FindBy(xpath = "//div[@class='data-protection-information']")
    private WebElement privacyText;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
    private WebElement continueButton;
    //summary section web elements
    @FindBy(xpath = "//div[@class='checkout-aside ']//h2[@class='checkout-aside-summary-header']")
    private WebElement summarySectionTitle;
    @FindBy(xpath = "//div[@class='checkout-aside ']//dl/dd[1]")
    private WebElement summaryTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside ']//dl/dd[2]")
    private WebElement summaryShippingCost;
    @FindBy(xpath = "//div[@class='checkout-aside ']//dl/dd[3]")
    private WebElement summaryGrandTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside ']//dl/dd[4]")
    private WebElement summaryNetTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside ']//dl/dd[5]")
    private WebElement summaryVATPrice;
    //shopping cart section web elements (for order logging purposes)
    @FindBy(xpath = "//div[@class='checkout-aside-products']//h2")
    private WebElement shoppingCartSectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-img-container']//img")
    private List<WebElement> shoppingCartProductImagePlaceholderElements;

    private List<WebElement> shoppingCartProductRemoveButtonElements = driver.findElements(By.xpath("//div[@class='line-item line-item-product is-offcanvas js-cart-item']//button"));

    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-details-container']/a")
    private List<WebElement> shoppingCartProductTitleLinkElements;
    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-details-container']")
    private List<WebElement> shoppingCartProductDescriptionElements;
    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-quantity-select-wrapper']")
    private List<WebElement> shoppingCartProductQuantityElements;
    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-total-price-value']")
    private List<WebElement> shoppingCartProductTotalPriceElements;
    @FindBy(xpath = "//div[@class='line-item line-item-product is-offcanvas js-cart-item']//div[@class='line-item-unit-price-value']")
    private List<WebElement> shoppingCartProductUnitPriceElements;

    public CheckoutGuestPage(WebDriver driver) {super(driver);}


    //checkout guest page web element assert test methods
    public boolean isLoginLinkDisplayed() {return loginLink.isDisplayed();}
    public boolean isShippingInfoSectionTitleDisplayed() {return shippingInfoSectionTitle.isDisplayed();}
    public boolean isYourInfoSubsectionTitleDisplayed() {return yourInfoSubsectionTitle.isDisplayed();}
    public boolean isSalutationDropdownMenuDisplayed() {return salutationDropdownMenu.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed() {return emailInputField.isDisplayed();}
    public boolean isCreateCustomerAccountCheckboxDisplayed() {return createCustomerAccountCheckbox.isDisplayed();}
    public boolean isAddressSubsectionTitleDisplayed() {return addressSubsectionTitle.isDisplayed();}
    public boolean isStreetAddressInputFieldDisplayed() {return streetAddressInputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed() {return cityInputField.isDisplayed();}
    public boolean isPostalCodeInputFieldDisplayed() {return postalCodeInputField.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isShippingBillingAddressMismatchCheckboxDisplayed() {return shippingBillingAddressMismatchCheckbox.isDisplayed();}
    public boolean isPrivacySubsectionTitleDisplayed() {return privacySubsectionTitle.isDisplayed();}
    public boolean isDataProtectionInformationLinkDisplayed(){return dataProtectionInfoLink.isDisplayed();}
    public boolean isGeneralTermsLinkDisplayed(){return termsConditionsLink.isDisplayed();}
    public boolean isPrivacyTextDisplayed(){return privacyText.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}
    public boolean isSummarySectionTitleDisplayed() {return summarySectionTitle.isDisplayed();}
    public boolean isSummaryTotalPriceDisplayed() {return summaryTotalPrice.isDisplayed();}
    public boolean isSummaryShippingCostDisplayed() {return summaryShippingCost.isDisplayed();}
    public boolean isSummaryGrandTotalPriceDisplayed() {return summaryGrandTotalPrice.isDisplayed();}
    public boolean isSummaryNetTotalPriceDisplayed() {return summaryNetTotalPrice.isDisplayed();}
    public boolean isSummaryVATPriceDisplayed() {return summaryVATPrice.isDisplayed();}
    public boolean isShoppingCartSectionTitleDisplayed() {return shoppingCartSectionTitle.isDisplayed();}

    public boolean isShoppingCartProductImagePlaceholderDisplayed(){
        for (WebElement element : shoppingCartProductImagePlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductRemoveButtonDisplayed(){
        for (WebElement element : shoppingCartProductRemoveButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductTitleLinkDisplayed(){
        for (WebElement element : shoppingCartProductTitleLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductDescriptionDisplayed(){
        for (WebElement element : shoppingCartProductDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductQuantityDisplayed(){
        for (WebElement element : shoppingCartProductQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductTotalPriceDisplayed(){
        for (WebElement element : shoppingCartProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductUnitPriceDisplayed(){
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
