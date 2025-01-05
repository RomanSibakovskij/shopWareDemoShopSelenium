package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CheckoutConfirmationPage extends BasePage {

    //checkout confirmation page web elements
    @FindBy(xpath = "//header[@class='header-minimal']//div[@class='col-md-4 header-minimal-contact']")
    private WebElement headerContactText;
    @FindBy(xpath = "//header[@class='header-minimal']//div[@class='col-md-4 header-minimal-contact']//a")
    private WebElement headerContactNumberLink;
    @FindBy(xpath = "//header[@class='header-minimal']//a[@class='btn btn-outline-primary header-minimal-back-to-shop-button']")
    private WebElement headerBackToShopButton;
    @FindBy(xpath = "//div[@class='container-main']//h1")
    private WebElement checkoutConfirmPageTitle;
    //terms and conditions and cancellations policy section web elements
    @FindBy(xpath = "//div[@class='confirm-tos']//div[@class='card-title']")
    private WebElement termsConditionsSectionTitle;
    @FindBy(xpath = "//div[@class='confirm-tos']//p")
    private WebElement termsConditionsCancellationPolicyDescText;
    @FindBy(xpath = "//div[@class='confirm-tos']//a[@title='Cancellation policy']")
    private WebElement termsConditionsCancellationPolicyLink;
    @FindBy(xpath = "//div[@class='confirm-tos']//input[@id='tos']")
    private WebElement termsConditionsCheckbox;
    @FindBy(xpath = "//div[@class='confirm-tos']//label")
    private WebElement termsConditionsDescriptionText;
    @FindBy(xpath = "//div[@class='confirm-tos']//a[@title='general terms and conditions']")
    private WebElement termsConditionsLink;
    //shipping address section web elements
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-shipping-address']//div[@class='card-title']")
    private WebElement shippingAddressSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-shipping-address']//div[@class='confirm-address-shipping']")
    private WebElement shippingAddressData;
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-shipping-address']//a[@title='Change shipping address']")
    private WebElement changeShippingAddressButton;
    //billing address section web elements
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-billing-address']//div[@class='card-title']")
    private WebElement billingAddressSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-billing-address']//div[@class='confirm-address-billing']")
    private WebElement billingAddressData;
    @FindBy(xpath = "//div[@class='col-sm-6 card-col confirm-billing-address']//a[@title='Change billing address']")
    private WebElement changeBillingAddressButton;
    //payment method section web elements
    @FindBy(xpath = "//div[@class='col-sm-6 confirm-payment']//div[@class='card-title']")
    private WebElement paymentMethodSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6 confirm-payment']//div[@class='payment-method']")
    private WebElement paymentMethodData;
    //shipping method section web elements
    @FindBy(xpath = "//div[@class='col-sm-6 confirm-shipping']//div[@class='card-title']")
    private WebElement shippingMethodSectionTitle;
    @FindBy(xpath = "//div[@class='col-sm-6 confirm-shipping']//div[@class='shipping-method']")
    private WebElement shippingMethodData;
    //product table list elements
    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-img-container']//img")
    private List<WebElement> checkoutProductImagePlaceholderElements;
    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-details-container']/a")
    private List<WebElement> checkoutProductTitleLinkElements;
    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-details-container']")
    private List<WebElement> checkoutProductDescriptionElements;

    private List<WebElement> checkoutProductQtyDecreaseButtonElements = driver.findElements(By.xpath("//div[@class='confirm-product']//button[1]"));

    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-quantity']//input[@name='quantity']")
    private List<WebElement> checkoutProductQtyInputFieldElements;

    private List<WebElement> checkoutProductQTYIncreaseButtonElements = driver.findElements(By.xpath("//div[@class='confirm-product']//div[@class='line-item-quantity']//button[2]"));

    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-tax-price']")
    private List<WebElement> checkoutProductPriceWithVATElements;
    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-total-price line-item-price']")
    private List<WebElement> checkoutProductSubtotalPriceElements;
    @FindBy(xpath = "//div[@class='confirm-product']//div[@class='line-item-remove']//button")
    private List<WebElement> checkoutProductRemoveButtonElements;
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
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
    private WebElement submitOrderButton;

    public CheckoutConfirmationPage(WebDriver driver) {super(driver);}

    //header contact text getter
    public String getHeaderContactText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(headerContactText));
        return headerContactText.getText();
    }
    //checkout confirmation page title getter
    public String getCheckoutConfirmationPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(checkoutConfirmPageTitle));
        return checkoutConfirmPageTitle.getText();
    }
    //terms and conditions section title getter
    public String getTermsConditionsSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(termsConditionsSectionTitle));
        return termsConditionsSectionTitle.getText();
    }
    //terms and conditions policy text getter
    public String getTermsConditionsPolicyTextDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(termsConditionsCancellationPolicyDescText));
        return termsConditionsCancellationPolicyDescText.getText();
    }
    //terms and conditions description getter
    public String getTermsConditionsDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(termsConditionsDescriptionText));
        return termsConditionsDescriptionText.getText();
    }
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
    //payment method section title getter
    public String getPaymentMethodSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(paymentMethodSectionTitle));
        return paymentMethodSectionTitle.getText();
    }
    //shipping method section title getter
    public String getShippingMethodSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(shippingMethodSectionTitle));
        return shippingMethodSectionTitle.getText();
    }



    //shipping address data getter
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
    //checkout confirmation page title getter
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
        for (WebElement element : checkoutProductTitleLinkElements) {
            productTitle.add(element.getText());
        }
        return productTitle;
    }
    //product description getter
    public List<String> getProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : checkoutProductDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    //product quantity getter
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : checkoutProductQtyInputFieldElements) {
            productQuantity.add(element.getDomAttribute("value"));
        }
        return productQuantity;
    }
    //product price with VAT getter
    public List<String> getProductPriceWithVAT() {
        List<String> productPriceWithVAT = new ArrayList<>();
        for (WebElement element : checkoutProductPriceWithVATElements) {
            productPriceWithVAT.add(element.getText());
        }
        return productPriceWithVAT;
    }
    //product sub total price getter
    public List<String> getProductSubTotalPrice() {
        List<String> productSubTotalPrice = new ArrayList<>();
        for (WebElement element : checkoutProductSubtotalPriceElements) {
            productSubTotalPrice.add(element.getText().replace("*", ""));
        }
        return productSubTotalPrice;
    }

    //order summary total getter
    public String getSummaryTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryTotalPrice));
        return summaryTotalPrice.getText().replace("*", "");
    }
    //order shipping price getter
    public String getSummaryShippingPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryShippingPrice));
        return summaryShippingPrice.getText().replace("*", "");
    }
    //order summary grand total price getter
    public String getSummaryGrandTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryGrandTotalPrice));
        return summaryGrandTotalPrice.getText().replace("*", "");
    }
    //order summary net total price getter
    public String getSummaryNetTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryNetTotalPrice));
        return summaryNetTotalPrice.getText().replace("*", "");
    }
    //order summary price with VAT getter
    public String getSummaryPriceWithVAT() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(summaryVATPrice));
        return summaryVATPrice.getText().replace("*", "");
    }

    //click 'Terms and conditions' checkbox method
    public void clickTermsConditionsCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(termsConditionsCheckbox));
        termsConditionsCheckbox.click();
    }

    //click 'Submit order' button method
    public void clickSubmitOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(submitOrderButton));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", submitOrderButton); //js click (common click fails throws ElementClickInterceptedException for some reason)
    }

    //checkout page web element assert methods
    public boolean isHeaderContactTextDisplayed() {return headerContactText.isDisplayed();}
    public boolean isHeaderContactNumberLinkDisplayed() {return headerContactNumberLink.isDisplayed();}
    public boolean isHeaderBackToShopButtonDisplayed() {return headerBackToShopButton.isDisplayed();}
    public boolean isCheckoutConfirmationTitleDisplayed(){return checkoutConfirmPageTitle.isDisplayed();}
    public boolean isTermsConditionsSectionTitleDisplayed() {return termsConditionsSectionTitle.isDisplayed();}
    public boolean isTermsConditionsCancellationPolicyTextDescDisplayed(){return termsConditionsCancellationPolicyDescText.isDisplayed();}
    public boolean isTermsConditionsCancellationPolicyLinkDisplayed() {return termsConditionsCancellationPolicyLink.isDisplayed();}
    public boolean isTermsConditionsLinkDisplayed() {return termsConditionsLink.isDisplayed();}
    public boolean isTermsConditionsCheckboxDisplayed() {return termsConditionsCheckbox.isDisplayed();}
    public boolean isTermsConditionsDescriptionTextDisplayed() {return termsConditionsDescriptionText.isDisplayed();}
    public boolean isShippingAddressSectionTitleDisplayed() {return shippingAddressSectionTitle.isDisplayed();}
    public boolean isShippingAddressDataDisplayed() {return shippingAddressData.isDisplayed();}
    public boolean isChangeShippingAddressButtonDisplayed() {return changeShippingAddressButton.isDisplayed();}
    public boolean isBillingAddressSectionTitleDisplayed() {return billingAddressSectionTitle.isDisplayed();}
    public boolean isBillingAddressDataDisplayed() {return billingAddressData.isDisplayed();}
    public boolean isChangeBillingAddressButtonDisplayed() {return changeBillingAddressButton.isDisplayed();}
    public boolean isPaymentMethodSectionTitleDisplayed() {return paymentMethodSectionTitle.isDisplayed();}
    public boolean isPaymentMethodDataDisplayed() {return paymentMethodData.isDisplayed();}
    public boolean isShippingMethodSectionTitleDisplayed() {return shippingMethodSectionTitle.isDisplayed();}
    public boolean isShippingMethodDataDisplayed() {return shippingMethodData.isDisplayed();}

    public boolean isCheckoutProductImgPlaceholderDisplayed() {
        for (WebElement element : checkoutProductImagePlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductTitleLinkDisplayed() {
        for (WebElement element : checkoutProductTitleLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductDescriptionDisplayed() {
        for (WebElement element : checkoutProductDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductQtyDecreaseButtonDisplayed() {
        for (WebElement element : checkoutProductQtyDecreaseButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductQtyInputFieldDisplayed() {
        for (WebElement element : checkoutProductQtyInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductQtyIncreaseButtonDisplayed() {
        for (WebElement element : checkoutProductQTYIncreaseButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductPriceWithVATDisplayed() {
        for (WebElement element : checkoutProductPriceWithVATElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductSubtotalPriceDisplayed() {
        for (WebElement element : checkoutProductSubtotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductRemoveButtonDisplayed() {
        for (WebElement element : checkoutProductRemoveButtonElements) {
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
    public boolean isSubmitOrderButtonDisplayed() {return submitOrderButton.isDisplayed();}

}
