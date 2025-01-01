package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

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

    //login section web element assert methods
    public boolean isLoginSectionTitleDisplayed(){return loginSectionTitle.isDisplayed();}
    public boolean isLoginSectionDescriptionDisplayed(){return loginSectionDescription.isDisplayed();}
    public boolean isLoginSectionEmailInputFieldDisplayed(){return loginSectionEmailInputField.isDisplayed();}
    public boolean isLoginSectionPasswordInputFieldDisplayed(){return loginSectionPasswordInputField.isDisplayed();}
    public boolean isLoginSectionForgotPasswordLinkDisplayed(){return loginSectionForgotPasswordLink.isDisplayed();}
    public boolean isLoginSectionButtonDisplayed(){return loginSectionButton.isDisplayed();}
    public boolean isLoginAdvantagesDescriptionDisplayed(){return loginAdvantagesDescription.isDisplayed();}
}
