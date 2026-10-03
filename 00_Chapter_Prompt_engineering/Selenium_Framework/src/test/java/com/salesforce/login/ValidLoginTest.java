package com.salesforce.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;

public class ValidLoginTest extends BaseTest {

    @Test
    public void validLoginShouldSucceed() {
        openLoginPage();
        loginPage.login("demo.user@example.com", "demo-password");

        Assert.assertTrue(loginPage.isLoginSuccessful(), "Valid demo credentials should show the success status.");
    }
}
