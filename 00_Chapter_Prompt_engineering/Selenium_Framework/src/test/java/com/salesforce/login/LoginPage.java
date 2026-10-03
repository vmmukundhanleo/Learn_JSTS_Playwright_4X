package com.salesforce.login;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(css = "#username")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#Login")
    private WebElement loginButton;

    @FindBy(css = "#rememberUn")
    private WebElement rememberMe;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void open() {
        java.net.URL demoLoginPage = getClass().getClassLoader().getResource("demo-login.html");
        if (demoLoginPage == null) {
            throw new IllegalStateException("Demo login page resource was not found.");
        }
        driver.get(demoLoginPage.toExternalForm());
    }

    public void enterUsername(String value) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#username")));
        usernameField.clear();
        usernameField.sendKeys(value);
    }

    public void enterPassword(String value) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        passwordField.clear();
        passwordField.sendKeys(value);
    }

    public void clickLogin() {
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Login")));
        loginButtonElement.click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public boolean isRememberMeSelected() {
        return driver.findElement(By.cssSelector("#rememberUn")).isSelected();
    }

    public boolean isErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.cssSelector("#error"));
            return errorMessage.isDisplayed() && !errorMessage.getText().trim().isEmpty();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginSuccessful() {
        try {
            return driver.findElement(By.cssSelector("#success")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginPageDisplayed() {
        try {
            return driver.findElements(By.cssSelector("#username")).stream().anyMatch(WebElement::isDisplayed)
                    || driver.findElements(By.cssSelector("#password")).stream().anyMatch(WebElement::isDisplayed);
        } catch (Exception e) {
            return false;
        }
    }
}
