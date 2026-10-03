package com.salesforce.driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.constants.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.IMPLICIT_WAIT_TIMEOUT));
        driver.manage().window().maximize();
        return driver;
    }
}
