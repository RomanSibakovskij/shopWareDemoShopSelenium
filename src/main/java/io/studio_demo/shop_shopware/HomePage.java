package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomePage extends BasePage{

    //home page web elements
    @FindBy(xpath = "//button[@id='languagesDropdown-top-bar']")
    private WebElement homePageLanguageDropdownMenu;
    @FindBy(xpath = "//button[@id='currenciesDropdown-top-bar']")
    private WebElement homePageCurrencyDropdownMenu;
    //header elements
    @FindBy(xpath = "//a[@class='header-logo-main-link']")
    private WebElement homePageLogo;
    @FindBy(xpath = "//input[@class='form-control header-search-input']")
    private WebElement homePageSearchBar;
    @FindBy(xpath = "//button[@class='btn header-search-btn']")
    private WebElement homePageSearchButton;
    @FindBy(xpath = "//button[@class='btn account-menu-btn header-actions-btn']")
    private WebElement homePageUserAccountIconButtonDropdownMenu;
    @FindBy(xpath = "//a[@class='btn header-cart-btn header-actions-btn']")
    private WebElement homePageShoppingCartIconButton;
    //navbar elements
    @FindBy(xpath = "//nav[@class='nav main-navigation-menu']/a[1]")
    private WebElement homePageNavLink;
    @FindBy(xpath = "//nav[@class='nav main-navigation-menu']/a[2]")
    private WebElement homePageClothingLink;
    @FindBy(xpath = "//nav[@class='nav main-navigation-menu']/a[3]")
    private WebElement homePageFreeTimeElectronicsLink;
    //main page elements
    @FindBy(xpath = "//div[@class='cms-sections']//img")
    private WebElement homePageLogoImage;
    //footer elements
    @FindBy(xpath = "//footer//div[@id='collapseFooterHotlineTitle']")
    private WebElement shopServiceHotlineTitle;
    @FindBy(xpath = "//footer//p[@class='footer-contact-hotline']")
    private WebElement shopServiceHotlineDescription;
    @FindBy(xpath = "//footer//div[@class='footer-column-content-inner']//a")
    private WebElement shopServiceHotlineNumberLink;
    @FindBy(xpath = "//footer//div[@class='footer-contact-form']/a")
    private WebElement shopServiceHotlineContactFormLink;
    @FindBy(xpath = "//footer//div[@class='footer-vat']/p")
    private WebElement footerVATDescription;
    @FindBy(xpath = "//footer//div[@class='footer-vat']//a")
    private WebElement footerVATLink;
    @FindBy(xpath = "//footer//div[@class='footer-copyright']/span")
    private WebElement footerDesignText;

    public HomePage(WebDriver driver) {super(driver);}


    //home page shop section title getter
    public String getShopServiceHotlineTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shopServiceHotlineTitle));
        return shopServiceHotlineTitle.getText();
    }
    //home page shop section description getter
    public String getShopServiceDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shopServiceHotlineDescription));
        return shopServiceHotlineDescription.getText();
    }
    //home page shop section phone number link getter
    public String getShopServiceNumberLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(shopServiceHotlineNumberLink));
        return shopServiceHotlineNumberLink.getText();
    }
    //home page footer VAT description getter
    public String getVATDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(footerVATDescription));
        return footerVATDescription.getText();
    }
    //home page footer VAT description getter
    public String getDesignText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(footerDesignText));
        return footerDesignText.getText();
    }

    //home page web element assert methods
    public boolean isLanguageDropdownMenuDisplayed(){return homePageLanguageDropdownMenu.isDisplayed();}
    public boolean isCurrencyDropdownMenuDisplayed(){return homePageCurrencyDropdownMenu.isDisplayed();}
    public boolean isHomePageLogoDisplayed(){return homePageLogo.isDisplayed();}
    public boolean isHomePageSearchBarDisplayed(){return homePageSearchBar.isDisplayed();}
    public boolean isHomePageSearchButtonDisplayed(){return homePageSearchButton.isDisplayed();}
    public boolean isHomePageUserAccountButtonDisplayed(){return homePageUserAccountIconButtonDropdownMenu.isDisplayed();}
    public boolean isHomePageShoppingCartIconButtonDisplayed() {return homePageShoppingCartIconButton.isDisplayed();}
    public boolean isHomePageNavLinkDisplayed() {return homePageNavLink.isDisplayed();}
    public boolean isHomePageClothingLinkDisplayed() {return homePageClothingLink.isDisplayed();}
    public boolean isHomePageFreeTimeElectronicsLinkDisplayed() {return homePageFreeTimeElectronicsLink.isDisplayed();}
    public boolean isHomePageLogoImageDisplayed() {return homePageLogoImage.isDisplayed();}
    public boolean isHomePageShopServiceTitleDisplayed() {return shopServiceHotlineTitle.isDisplayed();}
    public boolean isHomePageShopServiceDescriptionDisplayed(){return shopServiceHotlineDescription.isDisplayed();}
    public boolean isHomePageShopServiceNumberLinkDisplayed(){return shopServiceHotlineNumberLink.isDisplayed();}
    public boolean isHomePageShopServiceContactFormLinkDisplayed(){return shopServiceHotlineContactFormLink.isDisplayed();}
    public boolean isFooterVATDescriptionDisplayed() {return footerVATDescription.isDisplayed();}
    public boolean isFooterVATLinkDisplayed() {return footerVATLink.isDisplayed();}
    public boolean isFooterDesignTextDisplayed() {return footerDesignText.isDisplayed();}
}
