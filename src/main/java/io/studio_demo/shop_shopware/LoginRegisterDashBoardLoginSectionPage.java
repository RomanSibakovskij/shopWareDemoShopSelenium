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
    //invalid credentials error
    @FindBy(xpath = "")
    private WebElement invalidCredentialsError;

    //valid login data
    private String loginEmail;
    private String loginPassword;

    //no singular login input data
    private String noLoginEmail;
    private String noLoginPassword;

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

    //valid login data input getter
    public void getValidUserLoginInputData(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage) {
        loginEmail = loginRegisterDashboardRegisterSectionPage.getEmail();
        loginPassword = loginRegisterDashboardRegisterSectionPage.getPassword();

        System.out.println("Valid user login input data: " + "\n");

        logger.info("Valid user login email: " + loginEmail);
        logger.info("Valid user login password: " + loginPassword);

        System.out.println("\n");
    }

    //valid user login data input methods
    public void inputEmailIntoLoginEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(loginSectionEmailInputField));
        loginSectionEmailInputField.sendKeys(loginEmail);
    }
    public void inputPasswordIntoLoginPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(loginSectionPasswordInputField));
        loginSectionPasswordInputField.sendKeys(loginPassword);
    }

    //invalid login methods

    //no singular input

    //invalid login data input getter - no email
    public void getInvalidUserLoginNoEmailInputData(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage) {
        noLoginEmail = "";
        loginPassword = loginRegisterDashboardRegisterSectionPage.getPassword();

        System.out.println("Invalid user login input data (no email): " + "\n");

        logger.info("No login email: " + noLoginEmail);
        logger.info("Valid user login password (no email): " + loginPassword);

        System.out.println("\n");
    }

    //invalid user login data input method - no login email
    public void inputNoEmailIntoLoginEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(loginSectionEmailInputField));
        loginSectionEmailInputField.sendKeys(noLoginEmail);
    }

    //invalid login data input getter - no login password
    public void getInvalidUserLoginNoPasswordInputData(LoginRegisterDashboardRegisterSectionPage loginRegisterDashboardRegisterSectionPage) {
        loginEmail = loginRegisterDashboardRegisterSectionPage.getEmail();
        noLoginPassword = "";

        System.out.println("Invalid user login input data (no password): " + "\n");

        logger.info("Valid user login email (no password): " + loginEmail);
        logger.info("No login password: " + noLoginPassword);

        System.out.println("\n");
    }

    //invalid user login data input method - no login password
    public void inputNoPasswordIntoLoginPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.visibilityOf(loginSectionPasswordInputField));
        loginSectionPasswordInputField.sendKeys(noLoginPassword);
    }

    //click 'Login' button
    public void clickLoginButton(){loginSectionButton.click();}

    //invalid credentials error getter
    public String getInvalidCredentialsError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(invalidCredentialsError));
        return invalidCredentialsError.getText();
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
