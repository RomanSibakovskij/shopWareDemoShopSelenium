package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ThankYouPage extends BasePage{

    //thank you page web elements
    @FindBy(xpath = "//div[@class='checkout-container']//h1")
    private WebElement thankYouPageConfirmationMessage;
    @FindBy(xpath = "//div[@class='checkout-container']//p[@class='finish-ordernumber']")
    private WebElement thankYouPageOrderNumber;
    @FindBy(xpath = "//div[@class='checkout-container']//p[@class='finish-teaser']")
    private WebElement thankYouPageOrderConfirmationEmailReport;
    //shipping address section web elements
    @FindBy(xpath = "//div[@class='col-sm-6'][1]//div[@class='card-title']")
    private WebElement shippingAddressSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6'][1]//div[@class='finish-address-shipping']")
    private WebElement shippingAddressData;
    //billing address section web elements
    @FindBy(xpath = "//div[@class='col-sm-6'][2]//div[@class='card-title']")
    private WebElement billingAddressSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6'][2]//div[@class='finish-address-billing']")
    private WebElement billingAddressData;
    //information section title
    @FindBy(xpath = "//div[@class='col-md-4 finish-order-details']//div[@class='card-title']")
    private WebElement informationSectionTitle;
    @FindBy(xpath = "//div[@class='col-md-4 finish-order-details']//p[1]")
    private WebElement paymentMethodData;
    @FindBy(xpath = "//div[@class='col-md-4 finish-order-details']//p[2]")
    private WebElement shippingMethodData;
    //product list elements
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-img-container']//img")
    private List<WebElement> productTableImgPlaceholderElements;
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-details-container']/a")
    private List<WebElement> productTableTitleLinkElements;
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-details-container']")
    private List<WebElement> productTableDescriptionElements;
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-quantity-select-wrapper']")
    private List<WebElement> productTableQuantityElements;
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-tax-price']")
    private List<WebElement> productTableVATPriceElements;
    @FindBy(xpath = "//div[@class='card checkout-product-table']//div[@class='line-item-total-price-value']")
    private List<WebElement> productTableSubtotalPriceElements;
    //summary section web elements
    @FindBy(xpath = "//div[@class='checkout-aside-container']//h2")
    private WebElement summarySectionTitle;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[1]")
    private WebElement summaryTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[2]")
    private WebElement summaryShippingPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[3]")
    private WebElement summaryGrandTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[4]")
    private WebElement summaryNetTotalPrice;
    @FindBy(xpath = "//div[@class='checkout-aside-container']//dl/dd[5]")
    private WebElement summaryVATPrice;


    public ThankYouPage(WebDriver driver) {super(driver);}

    //thank you page web element assert methods
    public boolean isThankYouPageConfirmationMessageDisplayed() {return thankYouPageConfirmationMessage.isDisplayed();}
    public boolean isThankYouPageOrderNumberDisplayed() {return thankYouPageOrderNumber.isDisplayed();}
    public boolean isThankYouOrderConfirmationEmailReportDisplayed() {return thankYouPageOrderConfirmationEmailReport.isDisplayed();}
    public boolean isShippingAddressSectionTitleDisplayed() {return shippingAddressSectionTitle.isDisplayed();}
    public boolean isShippingAddressDataDisplayed() {return shippingAddressData.isDisplayed();}
    public boolean isBillingAddressSectionTitleDisplayed() {return billingAddressSectionTitle.isDisplayed();}
    public boolean isBillingAddressDataDisplayed() {return billingAddressData.isDisplayed();}
    public boolean isInformationSectionTitleDisplayed() {return informationSectionTitle.isDisplayed();}
    public boolean isPaymentMethodDisplayed() {return paymentMethodData.isDisplayed();}
    public boolean isShippingMethodDisplayed() {return shippingMethodData.isDisplayed();}

    public boolean isThankYouPageTableProductImgPlaceholderDisplayed() {
        for (WebElement element : productTableImgPlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isThankYouPageTableProductTitleLinkDisplayed() {
        for (WebElement element : productTableTitleLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isTankYouTableProductDescriptionDisplayed() {
        for (WebElement element : productTableDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isTankYouTableProductQuantityDisplayed() {
        for (WebElement element : productTableQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isTankYouTableProductVATPriceDisplayed() {
        for (WebElement element : productTableVATPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isTankYouTableProductSubtotalPriceDisplayed() {
        for (WebElement element : productTableSubtotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSummarySectionTitleDisplayed() {return summarySectionTitle.isDisplayed();}
    public boolean isSummaryTotalPriceDisplayed() {return summaryTotalPrice.isDisplayed();}
    public boolean isSummaryShippingPriceDisplayed() {return summaryShippingPrice.isDisplayed();}
    public boolean isSummaryGrandTotalPriceDisplayed() {return summaryGrandTotalPrice.isDisplayed();}
    public boolean isSummaryNetTotalPriceDisplayed() {return summaryNetTotalPrice.isDisplayed();}
    public boolean isSummaryVATPriceDisplayed() {return summaryVATPrice.isDisplayed();}
}
