package com.coingatedemoshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //home page web elements
    //navbar elements
    @FindBy(xpath = "")
    private WebElement homePageNavLink;
    @FindBy(xpath = "")
    private WebElement homePageShopLink;
    @FindBy(xpath = "")
    private WebElement homePageAboutLink;
    @FindBy(xpath = "")
    private WebElement homePageShoppingCartIconButton;
    //main page elements
    @FindBy(xpath = "")
    private WebElement homePageLogoImage;
    @FindBy(xpath = "")
    private WebElement homePageShopSectionTitle;
    //product list elements
    @FindBy(xpath = "")
    private List<WebElement> homePageProductNameElements;
    @FindBy(xpath = "")
    private List<WebElement> homePageProductUnitPriceElements;

    private List<WebElement> homePageProductQuantityInputFieldElements = driver.findElements(By.xpath(""));
    private List<WebElement> homePageProductAddToCartIconButtonElements = driver.findElements(By.xpath(""));
    private List<WebElement> homePageProductAddToCartButtonElements = driver.findElements(By.xpath(""));

    @FindBy(xpath = "")
    private WebElement homePageAboutImage;
    //footer element
    @FindBy(xpath = "")
    private WebElement footerCopyrightText;

    public HomePage(WebDriver driver) {super(driver);}


    //home page shop section title getter
    public String getHomePageShopSectionTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(homePageShopSectionTitle));
        return homePageShopSectionTitle.getText();
    }

    //home page web element assert methods
    public boolean isHomePageNavLinkDisplayed() {return homePageNavLink.isDisplayed();}
    public boolean isHomePageShopLinkDisplayed() {return homePageShopLink.isDisplayed();}
    public boolean isHomePageAboutLinkDisplayed() {return homePageAboutLink.isDisplayed();}
    public boolean isHomePageShoppingCartIconButtonDisplayed() {return homePageShoppingCartIconButton.isDisplayed();}
    public boolean isHomePageLogoImageDisplayed() {return homePageLogoImage.isDisplayed();}
    public boolean isHomePageShopSectionTitleDisplayed() {return homePageShopSectionTitle.isDisplayed();}

    public boolean isHomePageProductNameDisplayed() {
        for (WebElement element : homePageProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isHomePageProductUnitPriceDisplayed() {
        for (WebElement element : homePageProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isHomePageProductQuantityInputFieldDisplayed() {
        for (WebElement element : homePageProductQuantityInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isHomePageProductAddToCartIconButtonDisplayed() {
        for (WebElement element : homePageProductAddToCartIconButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isHomePageProductAddToCartButtonDisplayed() {
        for (WebElement element : homePageProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isHomePageAboutImageDisplayed() {return homePageAboutImage.isDisplayed();}
    public boolean isFooterCopyrightTextDisplayed() {return footerCopyrightText.isDisplayed();}
}
