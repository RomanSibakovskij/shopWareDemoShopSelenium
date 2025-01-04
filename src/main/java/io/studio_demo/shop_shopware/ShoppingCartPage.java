package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    @FindBy(xpath = "//div[@class='checkout-main']//h1")
    private WebElement shoppingCartPageTitle;
    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement shoppingCartSingleProductRemoveButton;
    //shopping cart table list elements
    @FindBy(xpath = "//div[@class='row line-item-row']//div[@class='line-item-img-container']//img")
    private List<WebElement> shoppingCartProductImagePlaceholderElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//div[@class='line-item-details']")
    private List<WebElement> shoppingCartProductDescriptionElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//button[@aria-label='Decrease quantity']")
    private List<WebElement> shoppingCartProductQtyDecreaseButtonElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//input[@name='quantity']")
    private List<WebElement> shoppingCartProductQtyInputFieldElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//button[@aria-label='Increase quantity']")
    private List<WebElement> shoppingCartProductQtyIncreaseButtonElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//div[@class='line-item-unit-price-value']")
    private List<WebElement> shoppingCartProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//div[@class='line-item-total-price-value']")
    private List<WebElement> shoppingCartProductSubtotalPriceElements;
    @FindBy(xpath = "//div[@class='row line-item-row']//button[@title='Remove']")
    private List<WebElement> shoppingCartProductRemoveButtonElements;
    //summary subsection web elements
    @FindBy(xpath = "//div[@class='checkout-aside-container']//h2")
    private WebElement summarySubsectionTitle;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[1]")
    private WebElement summarySubsectionTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[2]")
    private WebElement summarySubsectionShippingPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[3]")
    private WebElement summarySubsectionGrandTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[4]")
    private WebElement summarySubsectionNetTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[5]")
    private WebElement summarySubsectionVATPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//input[@id='addPromotionInput']")
    private WebElement summarySubsectionCouponCodeInputField;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//button[@id='addPromotion']")
    private WebElement summarySubsectionAcceptCouponButton;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg begin-checkout-btn']")
    private WebElement shoppingCartGoToCheckoutButton;
    //product number elements
    @FindBy(xpath = "//div[@class='checkout-main']//input[@id='addProductInput']")
    private WebElement productNumberInputField;
    @FindBy(xpath = "//div[@class='checkout-main']//button[@id='addProductButton']")
    private WebElement productNumberAcceptButton;
    //shipping details elements
    @FindBy(xpath = "//div[@class='checkout-main']//a[@class='btn btn-link cart-shipping-costs-btn']")
    private WebElement shippingDetailsLink;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='countryId']")
    private WebElement shippingDetailsCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='countryId']/option[@value='16b9ff986274403a9d8a6a74e5898687']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='paymentMethodId']")
    private WebElement shippingDetailsPaymentMethodDropdownMenu;
    @FindBy(xpath = "//div[@class='checkout-main']//select[@id='shippingMethodId']")
    private WebElement shippingDetailsShippingMethodDropdownMenu;
    //shopping cart product removed confirmation message
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement productRemovalSuccessMessage;

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //click 'Shipping details' link method
    public void clickShippingDetailsLink(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", shippingDetailsLink);
        jsExecutor.executeScript("arguments[0].click();",shippingDetailsLink);//js click (common click fails throws ElementClickInterceptedException for some reason)
    }

    //click shipping country dropdown menu
    public void clickShippingDetailsCountryDropdownMenu(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();",shippingDetailsCountryDropdownMenu);//js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    //select 'United States' option
    public void selectUSCountryOption(){usCountryOption.click();}

    //click 'Go to Checkout' button method
    public void clickGoToCheckoutButton(){shoppingCartGoToCheckoutButton.click();}

    //click single remove product button method
    public void clickSingleProductRemoveButton(){shoppingCartSingleProductRemoveButton.click();}

    //shopping cart page title getter
    public String getShoppingCartPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartPageTitle));
        return shoppingCartPageTitle.getText();
    }
    //summary subsection title getter
    public String getSummarySubsectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionTitle));
        return summarySubsectionTitle.getText();
    }

    //shopping cart table data getters
    public List<String> getTableProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : shoppingCartProductDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    public List<String> getTableProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : shoppingCartProductQtyInputFieldElements) {
            productQuantity.add(element.getDomAttribute("value"));
        }
        return productQuantity;
    }
    public List<String> getTableProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            productUnitPrice.add(element.getText().replace("*", ""));
        }
        return productUnitPrice;
    }
    public List<String> getTableProductSubtotalPrice() {
        List<String> productSubtotalPrice = new ArrayList<>();
        for (WebElement element : shoppingCartProductSubtotalPriceElements) {
            productSubtotalPrice.add(element.getText().replace("*", ""));
        }
        return productSubtotalPrice;
    }

    //summary subsection data getters
    public String getSummaryTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionTotalPrice));
        return summarySubsectionTotalPrice.getText().replace("*", "");
    }
    public String getSummaryShippingPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionShippingPrice));
        return summarySubsectionShippingPrice.getText().replace("*", "");
    }
    public String getSummaryGrandTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionGrandTotalPrice));
        return summarySubsectionGrandTotalPrice.getText().replace("*", "");
    }
    public String getSummaryNetTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionNetTotalPrice));
        return summarySubsectionNetTotalPrice.getText().replace("*", "");
    }
    public String getSummaryVATPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(summarySubsectionVATPrice));
        return summarySubsectionVATPrice.getText().replace("*", "");
    }

    //product removal success message getter
    public String getProductRemovalSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(productRemovalSuccessMessage));
        return productRemovalSuccessMessage.getText();
    }

    //shopping cart page web element assert methods
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}

    public boolean isShoppingCartTableProductImgDisplayed() {
        for (WebElement element : shoppingCartProductImagePlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductDescriptionDisplayed() {
        for (WebElement element : shoppingCartProductDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductQtyMinusBtnDisplayed() {
        for (WebElement element : shoppingCartProductQtyDecreaseButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductQtyInputFieldDisplayed() {
        for (WebElement element : shoppingCartProductQtyInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductQtyPlusBtnDisplayed() {
        for (WebElement element : shoppingCartProductQtyIncreaseButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductUnitPriceDisplayed() {
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductSubtotalPriceDisplayed() {
        for (WebElement element : shoppingCartProductSubtotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartTableProductRemoveButtonDisplayed() {
        for (WebElement element : shoppingCartProductRemoveButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSummarySubsectionTitleDisplayed() {return summarySubsectionTitle.isDisplayed();}
    public boolean isSummaryTotalPriceDisplayed() {return summarySubsectionTotalPrice.isDisplayed();}
    public boolean isSummaryShippingPriceDisplayed() {return summarySubsectionShippingPrice.isDisplayed();}
    public boolean isSummaryGrandTotalPriceDisplayed() {return summarySubsectionGrandTotalPrice.isDisplayed();}
    public boolean isSummaryNetTotalPriceDisplayed() {return summarySubsectionNetTotalPrice.isDisplayed();}
    public boolean isSummaryVATPriceDisplayed() {return summarySubsectionVATPrice.isDisplayed();}
    public boolean isSummaryCouponCodeInputFieldDisplayed() {return summarySubsectionCouponCodeInputField.isDisplayed();}
    public boolean isSummaryAcceptCouponButtonDisplayed() {return summarySubsectionAcceptCouponButton.isDisplayed();}
    public boolean isGoToCheckoutButtonDisplayed() {return shoppingCartGoToCheckoutButton.isDisplayed();}
    public boolean isProductNumberInputFieldDisplayed() {return productNumberInputField.isDisplayed();}
    public boolean isProductNumberAcceptButtonDisplayed() {return productNumberAcceptButton.isDisplayed();}
    public boolean isShippingDetailsLinkDisplayed() {return shippingDetailsLink.isDisplayed();}
    public boolean isShippingCountryDropdownMenuDisplayed() {return shippingDetailsCountryDropdownMenu.isDisplayed();}
    public boolean isShippingPaymentMethodDropdownMenuDisplayed() {return shippingDetailsPaymentMethodDropdownMenu.isDisplayed();}
    public boolean isShippingMethodDropdownMenuDisplayed() {return shippingDetailsShippingMethodDropdownMenu.isDisplayed();}
}
