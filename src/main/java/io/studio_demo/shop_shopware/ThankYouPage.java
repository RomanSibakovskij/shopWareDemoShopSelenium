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

    //shipping address section title getter
    public String getShippingAddressSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(shippingAddressSectionTitle));
        return shippingAddressSectionTitle.getText();
    }
    //billing address section title getter
    public String getBillingAddressSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(billingAddressSectionTitle));
        return billingAddressSectionTitle.getText();
    }
    //information section title getter
    public String getInformationSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(informationSectionTitle));
        return informationSectionTitle.getText();
    }
    //summary section title getter
    public String getSummarySectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summarySectionTitle));
        return summarySectionTitle.getText();
    }

    //thank you page data getters

    //order confirmation message getter
    public String getThankYouPageOrderConfirmation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(thankYouPageConfirmationMessage));
        return thankYouPageConfirmationMessage.getText();
    }
    //order number message getter
    public String getThankYouPageOrderNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(thankYouPageOrderNumber));
        return thankYouPageOrderNumber.getText();
    }
    //order confirmation report getter
    public String getThankYouPageOrderConfirmationReport() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(thankYouPageOrderConfirmationEmailReport));
        return thankYouPageOrderConfirmationEmailReport.getText();
    }
    //order confirmation message getter
    public String getShippingAddressData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(shippingAddressData));
        return shippingAddressData.getText();
    }
    //billing address data getter
    public String getBillingAddressData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(billingAddressData));
        return billingAddressData.getText();
    }
    //payment method data getter
    public String getPaymentMethodData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(paymentMethodData));
        return paymentMethodData.getText();
    }
    //shipping method data getter
    public String getShippingMethodData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(shippingMethodData));
        return shippingMethodData.getText();
    }

    //product title link getter
    public List<String> getProductTitleLink() {
        List<String> productTitle = new ArrayList<>();
        for (WebElement element : productTableTitleLinkElements) {
            productTitle.add(element.getText());
        }
        return productTitle;
    }
    //product title description getter
    public List<String> getProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : productTableDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    //product quantity getter
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productTableQuantityElements) {
            productQuantity.add(element.getText());
        }
        return productQuantity;
    }
    //product VAT price getter
    public List<String> getProductVATPrice() {
        List<String> productVATPrice = new ArrayList<>();
        for (WebElement element : productTableVATPriceElements) {
            productVATPrice.add(element.getText());
        }
        return productVATPrice;
    }
    //product sub total price getter
    public List<String> getProductSubtotalPrice() {
        List<String> productSubtotalPrice = new ArrayList<>();
        for (WebElement element : productTableSubtotalPriceElements) {
            productSubtotalPrice.add(element.getText().replace("*", ""));
        }
        return productSubtotalPrice;
    }

    //summary total price getter
    public String getSummaryTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryTotalPrice));
        return summaryTotalPrice.getText().replace("*", "");
    }
    //summary shipping price getter
    public String getSummaryShippingPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryShippingPrice));
        return summaryShippingPrice.getText().replace("*", "");
    }
    //summary grand total price getter
    public String getSummaryGrandTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryGrandTotalPrice));
        return summaryGrandTotalPrice.getText().replace("*", "");
    }
    //summary net total price getter
    public String getSummaryNetTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryNetTotalPrice));
        return summaryNetTotalPrice.getText();
    }
    //summary VAT price getter
    public String getSummaryVATPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryVATPrice));
        return summaryVATPrice.getText();
    }

    //thank you page web element assert methods
    public boolean isThankYouPageConfirmationMessageDisplayed() {return thankYouPageConfirmationMessage.isDisplayed();}
    public boolean isThankYouPageOrderNumberDisplayed() {return thankYouPageOrderNumber.isDisplayed();}
    public boolean isThankYouOrderConfirmationEmailReportDisplayed() {return thankYouPageOrderConfirmationEmailReport.isDisplayed();}
    public boolean isShippingAddressSectionTitleDisplayed() {return shippingAddressSectionTitle.isDisplayed();}
    public boolean isShippingAddressDataDisplayed() {return shippingAddressData.isDisplayed();}
    public boolean isBillingAddressSectionTitleDisplayed() {return billingAddressSectionTitle.isDisplayed();}
    public boolean isBillingAddressDataDisplayed() {return billingAddressData.isDisplayed();}
    public boolean isInformationSectionTitleDisplayed() {return informationSectionTitle.isDisplayed();}
    public boolean isPaymentMethodDataDisplayed() {return paymentMethodData.isDisplayed();}
    public boolean isShippingMethodDataDisplayed() {return shippingMethodData.isDisplayed();}

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
    public boolean isThankYouPageTableProductDescriptionDisplayed() {
        for (WebElement element : productTableDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isThankYouPageTableProductQuantityDisplayed() {
        for (WebElement element : productTableQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isThankYouPageTableProductVATPriceDisplayed() {
        for (WebElement element : productTableVATPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isThankYouPageTableProductSubtotalPriceDisplayed() {
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
