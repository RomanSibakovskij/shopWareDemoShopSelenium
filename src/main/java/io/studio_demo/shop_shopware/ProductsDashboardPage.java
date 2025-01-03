package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class ProductsDashboardPage extends BasePage{

    //products dashboard page web elements
    @FindBy(xpath = "//div[@class='cms-breadcrumb container']//ol/li")
    private WebElement productsDashboardTitleLink;
    //dropdown menu elements (each dashboard page has different elements)
    @FindBy(xpath = "//div[@class='filter-panel-items-container']//button[@aria-label='Filter by manufacturer']")
    private WebElement productsDashboardManufacturerDropdownMenu;
    @FindBy(xpath = "//div[@class='filter-panel-items-container']//button[@aria-label='Filter by Material']")
    private WebElement productsDashboardMaterialsDropdownMenu;
    @FindBy(xpath = "//div[@class='filter-panel-items-container']//button[@aria-label='Filter by Target group']")
    private WebElement productsDashboardTargetGroupDropdownMenu;
    @FindBy(xpath = "//div[@class='filter-panel-items-container']//button[@aria-label='Filter by price']")
    private WebElement productsDashboardPriceDropdownMenu;
    @FindBy(xpath = "//div[@class='filter-panel-items-container']//input[@id='shipping-free']")
    private WebElement productsDashboardFreeShippingCheckbox;
    //main page content web elements
    @FindBy(xpath = "//select[@class='sorting form-select']")
    private WebElement productsDashboardSortByDropdownMenu;
    //list elements
    @FindBy(xpath = "//div[@class='card product-box box-standard']")
    private List<WebElement> productCardElements;
    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    private List<WebElement> productCardImagePlaceholderElements;
    @FindBy(xpath = "//div[@class='product-info']/a")
    private List<WebElement> productTitleLinkElements;
    @FindBy(xpath = "//div[@class='product-description']")
    private List<WebElement> productDescriptionElements;
    @FindBy(xpath = "//div[@class='product-price-wrapper']")
    private List<WebElement> productUnitPriceElements;
    private List<WebElement> productAddToCartButtonElements = driver.findElements(By.xpath("//button[@title='Add to shopping cart']"));


    public ProductsDashboardPage(WebDriver driver) {super(driver);}

    //product dashboard page title getter
    public String getProjectDashboardPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(productsDashboardTitleLink));
        return productsDashboardTitleLink.getText();
    }

    //products dashboard page web element assert methods
    public boolean isProductsDashboardTitleLinkDisplayed() {return productsDashboardTitleLink.isDisplayed();}
    public boolean isProductsDashboardManufacturerDropdownMenuDisplayed() {return productsDashboardManufacturerDropdownMenu.isDisplayed();}
    public boolean isProductsDashboardMaterialsDropdownMenuDisplayed() {return productsDashboardMaterialsDropdownMenu.isDisplayed();}
    public boolean isProductsDashboardTargetGroupDropdownMenuDisplayed() {return productsDashboardTargetGroupDropdownMenu.isDisplayed();}
    public boolean isProductsDashboardPriceDropdownMenuDisplayed() {return productsDashboardPriceDropdownMenu.isDisplayed();}
    public boolean isProductsDashboardFreeShippingCheckboxDisplayed() {return productsDashboardFreeShippingCheckbox.isDisplayed();}
    public boolean isProductsDashboardSortByDropdownMenuDisplayed() {return productsDashboardSortByDropdownMenu.isDisplayed();}

    public boolean isProductCardDisplayed() {
        for (WebElement element : productCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardImagePlaceholderDisplayed() {
        for (WebElement element : productCardImagePlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductTitleLinkDisplayed() {
        for (WebElement element : productTitleLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductDescriptionDisplayed() {
        for (WebElement element : productDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardAddToCartButtonDisplayed() {
        for (WebElement element : productAddToCartButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}
