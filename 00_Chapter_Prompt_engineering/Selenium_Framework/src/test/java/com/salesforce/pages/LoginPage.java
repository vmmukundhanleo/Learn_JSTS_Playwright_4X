package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.constants.FrameworkConstants;
import com.salesforce.util.WaitUtils;

public class LoginPage {
    private final WebDriver driver;

    @FindBy(xpath = "//*[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='rememberUn']")
    private WebElement rememberMe;

    @FindBy(xpath = "//*[contains(@class,'error') or @id='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(FrameworkConstants.LOGIN_URL);
    }

    public void enterUsername(String value) {
        WaitUtils.waitForVisibility(driver, username).clear();
        username.sendKeys(value);
    }

    public void enterPassword(String value) {
        WaitUtils.waitForVisibility(driver, password).clear();
        password.sendKeys(value);
    }

    public void clickLogin() {
        WaitUtils.waitForClickable(driver, loginButton).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public boolean isRememberMeSelected() {
        return rememberMe.isSelected();
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return WaitUtils.waitForVisibility(driver, errorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginPageDisplayed() {
        try {
            return WaitUtils.waitForVisibility(driver, username).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
