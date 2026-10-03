package com.salesforce.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.util.ConfigReader;

public class ValidLoginTest extends BaseTest {

    @Test
    public void validLoginShouldSucceed() {
        String username = System.getProperty("salesforce.username", ConfigReader.get("salesforce.username"));
        String password = System.getProperty("salesforce.password", ConfigReader.get("salesforce.password"));

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new SkipException("Set -Dsalesforce.username and -Dsalesforce.password or update config.properties to run the valid login test.");
        }

        openLoginPage();
        loginPage.login(username, password);

        Assert.assertFalse(loginPage.isErrorMessageDisplayed(), "Valid login should not show an error message.");
    }
}
