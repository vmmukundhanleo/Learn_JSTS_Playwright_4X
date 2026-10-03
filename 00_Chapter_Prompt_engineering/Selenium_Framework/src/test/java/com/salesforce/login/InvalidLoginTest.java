package com.salesforce.login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;

public class InvalidLoginTest extends BaseTest {

    @DataProvider(name = "invalidLoginData")
    public Object[][] invalidLoginData() {
        return new Object[][] {
            {"invalid.user@example.com", "wrongpassword"},
            {"invalid.user@example.com", ""},
            {"", "wrongpassword"}
        };
    }

    @Test(dataProvider = "invalidLoginData")
    public void invalidLoginShouldShowError(String username, String password) {
        openLoginPage();
        loginPage.login(username, password);

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Invalid login should display an error message.");
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "User should remain on the login page after invalid credentials.");
    }
}
