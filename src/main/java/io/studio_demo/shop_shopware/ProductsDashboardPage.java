package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;

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
    @FindBy(xpath = "//button[@title='Add to shopping cart']")
    private WebElement singleProductAddToCartButton;
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

    protected List<WebElement> productAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='row cms-listing-row js-listing-wrapper']/div//button[@title='Add to shopping cart']"));

    //aside shopping cart elements(after the product has been added)
    @FindBy(xpath = "//div[@role='dialog']/div[@class='offcanvas-header']/button")
    private WebElement asideShoppingCartContinueShoppingLink;
    @FindBy(xpath = "//div[@class='row align-items-center h4 offcanvas-cart-header']/div[1]")
    private WebElement asideShoppingCartTitle;
    @FindBy(xpath = "//div[@class='row align-items-center h4 offcanvas-cart-header']/div[2]")
    private WebElement asideShoppingCartItemQuantity;
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement asideShoppingCartItemAdditionSuccessMessage;
    @FindBy(xpath = "//div[@class='offcanvas-cart']/div[@role='alert']")
    private WebElement asideShoppingCartItemRemovalSuccessMessage;
    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement singleProductRemoveFromCartButton;
    //list elements
    private List<WebElement> asideShoppingCartRemoveButtonElements = driver.findElements(By.xpath("//button[@title='Remove']"));

    @FindBy(xpath = "//div[@class='col-auto line-item-info-img']")
    private List<WebElement> asideShoppingCartProductImagePlaceholderElements;

    private List<WebElement> asideShoppingCartProductTitleLinkElements = driver.findElements(By.xpath("//div[@class='line-item-details-container']/a"));

    @FindBy(xpath = "//div[@class='line-item-details-container']")
    private List<WebElement> asideShoppingCartProductDescriptionElements;
    @FindBy(xpath = "//input[@name='quantity']")
    private List<WebElement> asideShoppingCartProductQuantityInputFieldElements;
    @FindBy(xpath = "//div[@class='line-item-total-price-value']")
    private List<WebElement> asideShoppingCartProductTotalPriceElements;
    //single elements
    @FindBy(xpath = "//div[@class='offcanvas-summary']/dl/dd")
    private WebElement asideShoppingCartProductSubtotalPrice;
    @FindBy(xpath = "//div[@class='row offcanvas-shipping-info']/span[2]")
    private WebElement asideShoppingCartShippingCosts;
    @FindBy(xpath = "//p[@class='offcanvas-cart-tax']")
    private WebElement asideShoppingCartPricesHint;
    @FindBy(xpath = "//input[@id='addPromotionOffcanvasCartInput']")
    private WebElement asideShoppingCartCouponCodeInputField;
    @FindBy(xpath = "//button[@id='addPromotionOffcanvasCart']")
    private WebElement asideShoppingCartAcceptCouponButton;
    @FindBy(xpath = "//a[@class='btn begin-checkout-btn btn-primary']")
    private WebElement asideShoppingCartGoToCheckoutButton;
    @FindBy(xpath = "//a[@class='btn btn-link']")
    private WebElement asideShoppingCartDisplayShoppingCartLink;

    public ProductsDashboardPage(WebDriver driver) {super(driver);}

    //product dashboard page title getter
    public String getProductDashboardPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(productsDashboardTitleLink));
        return productsDashboardTitleLink.getText();
    }


    public List<String> getProductTitle() {
        List<String> productTitle = new ArrayList<>();
        for (WebElement element : productTitleLinkElements) {
            productTitle.add(element.getText());
        }
        return productTitle;
    }
    public List<String> getProductDescription() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : productDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }

    //single product 'Add to Cart' button click
    public void clickSingleAddToCartButton() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", singleProductAddToCartButton);
        jsExecutor.executeScript("arguments[0].click();", singleProductAddToCartButton);//js click (common click fails throws ElementClickInterceptedException for some reason)
    }

    //initialize elements with wait
    private void initializeElements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='row cms-listing-row js-listing-wrapper']/div//button[@title='Add to shopping cart']")));
        productAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='row cms-listing-row js-listing-wrapper']/div//button[@title='Add to shopping cart']"));
        if (productAddToCartButtonElements.isEmpty()) {throw new NoSuchElementException("No 'Add to Cart' buttons found on the page");}
    }
    //multiple 'Add to Cart' button click index getter
    public void clickMultipleAddToCartButtons(int productIndex) {

        if (productAddToCartButtonElements == null || productAddToCartButtonElements.isEmpty()) {initializeElements();}

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButtonElements.get(productIndex)));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();",button);//js click (common click fails throws ElementClickInterceptedException for some reason)
    }
    public void clickAddToCart1Button(){clickMultipleAddToCartButtons(0);}
    public void clickAddToCart2Button(){clickMultipleAddToCartButtons(1);}
    public void clickAddToCart3Button(){clickMultipleAddToCartButtons(2);}


    //single 'Remove product from shopping cart' button method
    public void clickSingleRemoveProductFromAsideCartButton() {singleProductRemoveFromCartButton.click();}

    //click 'Display shopping cart' link method
    public void clickDisplayShoppingCartLink() {asideShoppingCartDisplayShoppingCartLink.click();}

    //aside shopping cart data getters

    //item quantity
    public String getItemQuantity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartItemQuantity));
        return asideShoppingCartItemQuantity.getText();
    }
    //product title
    public List<String> getProductTitleText() {
        List<String> productTitle = new ArrayList<>();
        for (WebElement element : asideShoppingCartProductTitleLinkElements) {
            productTitle.add(element.getText());
        }
        return productTitle;
    }
    public List<String> getProductDescriptionText() {
        List<String> productDescription = new ArrayList<>();
        for (WebElement element : asideShoppingCartProductDescriptionElements) {
            productDescription.add(element.getText());
        }
        return productDescription;
    }
    public List<String> getProductTotalPriceText() {
        List<String> productPrice = new ArrayList<>();
        for (WebElement element : asideShoppingCartProductTotalPriceElements) {
            productPrice.add(element.getText());
        }
        return productPrice;
    }
    //subtotal price
    public String getProductSubtotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartProductSubtotalPrice));
        return asideShoppingCartProductSubtotalPrice.getText();
    }
    //shipping costs
    public String getProductShippingCosts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartShippingCosts));
        return asideShoppingCartShippingCosts.getText();
    }


    //aside shopping cart title
    public String getAsideShoppingCartTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartTitle));
        return asideShoppingCartTitle.getText();
    }
    //item addition success message getter
    public String getProductAdditionSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartItemAdditionSuccessMessage));
        return asideShoppingCartItemAdditionSuccessMessage.getText();
    }
    //item removal success message getter
    public String getProductRemovalSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartItemRemovalSuccessMessage));
        return asideShoppingCartItemRemovalSuccessMessage.getText();
    }
    //aside shopping cart prices hint getter
    public String getAsideShoppingCartPricesHint() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartPricesHint));
        return asideShoppingCartPricesHint.getText();
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

    //aside shopping cart web element assert methods
    public boolean isAsideShoppingCartContinueShoppingLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(asideShoppingCartContinueShoppingLink));
        return asideShoppingCartContinueShoppingLink.isDisplayed();
    }
    public boolean isAsideShoppingCartTitleDisplayed() {return asideShoppingCartTitle.isDisplayed();}
    public boolean isAsideShoppingCartItemQuantityDisplayed() {return asideShoppingCartItemQuantity.isDisplayed();}

    public boolean isAsideShoppingCartRemoveButtonDisplayed() {
        for (WebElement element : asideShoppingCartRemoveButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideShoppingCartProductImagePlaceholderDisplayed() {
        for (WebElement element : asideShoppingCartProductImagePlaceholderElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideShoppingCartProductTitleLinkDisplayed() {
        for (WebElement element : asideShoppingCartProductTitleLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideShoppingCartProductDescriptionDisplayed() {
        for (WebElement element : asideShoppingCartProductDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideShoppingCartProductQtyInputFieldDisplayed() {
        for (WebElement element : asideShoppingCartProductQuantityInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideShoppingCartProductTotalPriceDisplayed() {
        for (WebElement element : asideShoppingCartProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isAsideShoppingCartProductSubtotalPriceDisplayed() {return asideShoppingCartProductSubtotalPrice.isDisplayed();}
    public boolean isAsideShoppingCartProductShippingPriceDisplayed() {return asideShoppingCartShippingCosts.isDisplayed();}
    public boolean isAsideShoppingCartProductPricesHintDisplayed() {return asideShoppingCartPricesHint.isDisplayed();}
    public boolean isAsideShoppingCartProductCouponCodeInputFieldDisplayed() {return asideShoppingCartCouponCodeInputField.isDisplayed();}
    public boolean isAsideShoppingCartAcceptCouponButtonDisplayed() {return asideShoppingCartAcceptCouponButton.isDisplayed();}
    public boolean isAsideShoppingCartGoToCheckoutButtonDisplayed() {return asideShoppingCartGoToCheckoutButton.isDisplayed();}
    public boolean isAsideShoppingCartDisplayShoppingCartLinkDisplayed() {return asideShoppingCartDisplayShoppingCartLink.isDisplayed();}
}
