package com.salesforce.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.salesforce.driver.DriverFactory;
import com.salesforce.login.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = DriverFactory.createDriver();
        loginPage = new LoginPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void openLoginPage() {
        loginPage.open();
    }
}
