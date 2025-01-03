package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

public class AccountOverviewPage extends BasePage{

    //account aside page elements
    @FindBy(xpath = "//div[@class='card account-menu-inner']/div[@class='card-header account-aside-header']")
    private WebElement asideSectionTitle;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[2]/a[1]")
    private WebElement asideOverviewLink;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[2]/a[2]")
    private WebElement asideProfileLink;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[2]/a[3]")
    private WebElement asideAddressesLink;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[2]/a[4]")
    private WebElement asidePaymentMethodsLink;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[2]/a[5]")
    private WebElement asideOrdersLink;
    @FindBy(xpath = "//div[@class='account-aside']/div/div[3]/a")
    private WebElement asideLogOutLink;
    //main section elements
    @FindBy(xpath = "//div[@class='account-welcome']/h1")
    private WebElement accountOverviewTitle;
    @FindBy(xpath = "//div[@class='account-welcome']/p")
    private WebElement accountOverviewDescription;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card account-overview-profile']//h2")
    private WebElement accountPersonalDataSubsectionTitle;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card account-overview-profile']//p")
    private WebElement accountPersonalData;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card account-overview-payment']//h2")
    private WebElement accountDefaultPaymentMethodSubsectionTitle;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card account-overview-payment']//strong")
    private WebElement accountDefaultPaymentMethod;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card account-overview-payment']//p")
    private WebElement accountDefaultPaymentDescription;
    @FindBy(xpath = "//div[@class='account-overview-card account-overview-newsletter']//h2")
    private WebElement accountNewsletterSubsectionTitle;
    @FindBy(xpath = "//div[@class='account-overview-card account-overview-newsletter']//input")
    private WebElement accountNewsletterCheckbox;
    @FindBy(xpath = "//div[@class='account-overview-card account-overview-newsletter']//label")
    private WebElement accountNewsletterCheckboxDescription;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card overview-billing-address']//h2")
    private WebElement accountDefaultBillingAddressSubsectionTitle;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card overview-billing-address']//div[@class='address']")
    private WebElement accountDefaultBillingAddress;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card overview-shipping-address']//h2")
    private WebElement accountDefaultShippingAddressSubsectionTitle;
    @FindBy(xpath = "//div[@class='col-lg-6 card-col account-overview-card overview-shipping-address']//p")
    private WebElement accountDefaultShippingAddress;

    public AccountOverviewPage(WebDriver driver) {super(driver);}

    //account overview page web element assert methods
    public boolean isAsideSectionTitleDisplayed() {return asideSectionTitle.isDisplayed();}
    public boolean isAsideOverviewLinkDisplayed() {return asideOverviewLink.isDisplayed();}
    public boolean isAsideProfileLinkDisplayed() {return asideProfileLink.isDisplayed();}
    public boolean isAsideAddressesLinkDisplayed() {return asideAddressesLink.isDisplayed();}
    public boolean isAsidePaymentMethodsLinkDisplayed() {return asidePaymentMethodsLink.isDisplayed();}
    public boolean isAsideOrdersLinkDisplayed() {return asideOrdersLink.isDisplayed();}
    public boolean isAsideLogOutLinkDisplayed() {return asideLogOutLink.isDisplayed();}
    public boolean isAccountOverviewTitleDisplayed() {return accountOverviewTitle.isDisplayed();}
    public boolean isAccountOverviewDescriptionDisplayed() {return accountOverviewDescription.isDisplayed();}
    public boolean isAccountOverviewPersonalDataSubsectionTitleDisplayed() {return accountPersonalDataSubsectionTitle.isDisplayed();}
    public boolean isAccountPersonalDataDisplayed() {return accountPersonalData.isDisplayed();}
    public boolean isAccountDefaultPaymentMethodSubsectionTitleDisplayed() {return accountDefaultPaymentMethodSubsectionTitle.isDisplayed();}
    public boolean isAccountDefaultPaymentMethodDisplayed() {return accountDefaultPaymentMethod.isDisplayed();}
    public boolean isAccountDefaultPaymentDescriptionDisplayed() {return accountDefaultPaymentDescription.isDisplayed();}
    public boolean isAccountNewsletterDisplayed() {return accountNewsletterSubsectionTitle.isDisplayed();}
    public boolean isAccountNewsletterCheckboxDisplayed() {return accountNewsletterCheckbox.isDisplayed();}
    public boolean isAccountNewsletterCheckboxDescriptionDisplayed() {return accountNewsletterCheckboxDescription.isDisplayed();}
    public boolean isAccountDefaultBillingAddressSubsectionTitleDisplayed() {return accountDefaultBillingAddressSubsectionTitle.isDisplayed();}
    public boolean isAccountDefaultBillingAddressDisplayed() {return accountDefaultBillingAddress.isDisplayed();}
    public boolean isAccountDefaultShippingAddressSubsectionTitleDisplayed() {return accountDefaultShippingAddressSubsectionTitle.isDisplayed();}
    public boolean isAccountDefaultShippingAddressDisplayed() {return accountDefaultShippingAddress.isDisplayed();}


}
