package com.salesforce.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesforce.constants.FrameworkConstants;

public final class WaitUtils {
    private WaitUtils() {
    }

    public static WebDriverWait getWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.EXPLICIT_WAIT_TIMEOUT));
    }

    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
        return getWait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickable(WebDriver driver, WebElement element) {
        return getWait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }
}
