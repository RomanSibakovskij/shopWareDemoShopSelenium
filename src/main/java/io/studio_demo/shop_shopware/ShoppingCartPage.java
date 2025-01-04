package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    @FindBy(xpath = "//div[@class='checkout-main']//h1")
    private WebElement shoppingCartPageTitle;
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

    public ShoppingCartPage(WebDriver driver) {super(driver);}


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
}
