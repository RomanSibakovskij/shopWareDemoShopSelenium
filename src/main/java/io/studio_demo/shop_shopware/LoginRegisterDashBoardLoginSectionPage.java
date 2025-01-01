package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginRegisterDashBoardLoginSectionPage extends BasePage{

    //login section web elements
    @FindBy(xpath = "//div[@class='card login-card mb-3']//h1")
    private WebElement loginSectionTitle;
    @FindBy(xpath = "//div[@class='card login-card mb-3']//p")
    private WebElement loginSectionDescription;
    @FindBy(xpath = "//div[@class='card login-card mb-3']//input[@id='loginMail']")
    private WebElement loginSectionEmailInputField;
    @FindBy(xpath = "//div[@class='card login-card mb-3']//input[@id='loginPassword']")
    private WebElement loginSectionPasswordInputField;
    @FindBy(xpath = "//div[@class='card login-card mb-3']//a")
    private WebElement loginSectionForgotPasswordLink;
    @FindBy(xpath = "//div[@class='card login-card mb-3']//button")
    private WebElement loginSectionButton;
    @FindBy(xpath = "//div[@class='login-advantages d-none d-lg-block']")
    private WebElement loginAdvantagesDescription;

    public LoginRegisterDashBoardLoginSectionPage(WebDriver driver) {super(driver);}

    //login section title getter
    public String getLoginTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginSectionTitle));
        return loginSectionTitle.getText();
    }
    //login section description getter
    public String getLoginDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginSectionDescription));
        return loginSectionDescription.getText();
    }
    //login section login advantages description getter
    public String getLoginAdvantagesDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(loginAdvantagesDescription));
        return loginAdvantagesDescription.getText();
    }

    //login section web element assert methods
    public boolean isLoginSectionTitleDisplayed(){return loginSectionTitle.isDisplayed();}
    public boolean isLoginSectionDescriptionDisplayed(){return loginSectionDescription.isDisplayed();}
    public boolean isLoginSectionEmailInputFieldDisplayed(){return loginSectionEmailInputField.isDisplayed();}
    public boolean isLoginSectionPasswordInputFieldDisplayed(){return loginSectionPasswordInputField.isDisplayed();}
    public boolean isLoginSectionForgotPasswordLinkDisplayed(){return loginSectionForgotPasswordLink.isDisplayed();}
    public boolean isLoginSectionButtonDisplayed(){return loginSectionButton.isDisplayed();}
    public boolean isLoginAdvantagesDescriptionDisplayed(){return loginAdvantagesDescription.isDisplayed();}
}
