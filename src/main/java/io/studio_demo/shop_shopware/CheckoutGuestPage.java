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

    //valid guest user data getter
    private String guestFirstName;
    private String guestLastName;
    private String guestEmail;
    private String guestAddress;
    private String guestCity;
    private int guestPostalCode;

    public CheckoutGuestPage(WebDriver driver) {super(driver);}

    //valid input guest data getter
    public void getValidGuestUserData(){
        guestFirstName = TestDataGenerator.getRandomFirstName();
        guestLastName = TestDataGenerator.getRandomLastName();
        guestEmail = TestDataGenerator.generateRandomEmailAddress(10);
        guestAddress = TestDataGenerator.generateRandomAddress(7);
        guestCity = TestDataGenerator.getRandomCity();
        guestPostalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid guest user data: " + "\n");

        logger.info("Valid guest first name: " + guestFirstName);
        logger.info("Valid guest last name: " + guestLastName);
        logger.info("Valid guest email: " + guestEmail);
        logger.info("Valid guest address: " + guestAddress);
        logger.info("Valid guest city: " + guestCity);
        logger.info("Valid guest postal code: " + guestPostalCode + "\n");
    }

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

    //click country dropdown menu method
    public void clickGuestCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", countryDropdownMenu);
        jsExecutor.executeScript("arguments[0].click();", countryDropdownMenu); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    //select 'United States' option method
    public void selectUSOption(){usCountryOption.click();}

    //click state dropdown menu method
    public void clickGuestStateDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", stateDropdownMenu); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    //select 'Illinois' option method
    public void selectIllinoisOption(){illinoisStateOption.click();}

    //click 'Continue' button
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", continueButton); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }

    //click 'Salutation' dropdown menu method
    public void clickSalutationDropdownMenu(){salutationDropdownMenu.click();}
    //select 'Mr.' option method
    public void selectMrSalutation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(salutationMrOption));
        salutationMrOption.click();
    }

    //shipping info section title getter
    public String getShippingInfoSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shippingInfoSectionTitle));
        return shippingInfoSectionTitle.getText();
    }
    //your info subsection title getter
    public String getYourInfoSubsectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(yourInfoSubsectionTitle));
        return yourInfoSubsectionTitle.getText();
    }
    //address info subsection title getter
    public String getAddressInfoSubsectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(addressSubsectionTitle));
        return addressSubsectionTitle.getText();
    }
    //privacy subsection title getter
    public String getPrivacySubsectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(privacySubsectionTitle));
        return privacySubsectionTitle.getText();
    }
    //privacy text getter
    public String getPrivacyText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(privacyText));
        return privacyText.getText();
    }
    //summary section title getter
    public String getSummarySectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySectionTitle));
        return summarySectionTitle.getText();
    }
    //shopping cart section title getter
    public String getShoppingCartSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartSectionTitle));
        return shoppingCartSectionTitle.getText();
    }

    //summary / shopping cart data getters
    public String getSummaryTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summaryTotalPrice));
        return summaryTotalPrice.getText();
    }
    public String getSummaryShippingPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summaryShippingCost));
        return summaryShippingCost.getText();
    }
    public String getSummaryGrandTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summaryGrandTotalPrice));
        return summaryGrandTotalPrice.getText();
    }
    public String getSummaryNetTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summaryNetTotalPrice));
        return summaryNetTotalPrice.getText();
    }
    public String getSummaryVATPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summaryVATPrice));
        return summaryVATPrice.getText();
    }

    public List<String> getProductTitle() {
        List<String> productTitle = new ArrayList<>();
        for (WebElement element : shoppingCartProductTitleLinkElements) {
            productTitle.add(element.getText());
        }
        return productTitle;
    }
    public List<String> getProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : shoppingCartProductDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : shoppingCartProductQuantityElements) {
            productQuantity.add(element.getText());
        }
        return productQuantity;
    }
    public List<String> getProductUnitPrice() { //not every product has them displayed
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }
    public List<String> getProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : shoppingCartProductTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }


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
