package com.salesforce.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.salesforce.util.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting test: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();
        if (testInstance instanceof com.salesforce.base.BaseTest) {
            com.salesforce.base.BaseTest baseTest = (com.salesforce.base.BaseTest) testInstance;
            ScreenshotUtil.capture(baseTest.getDriver(), result.getName());
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Suite started: " + context.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Suite finished: " + context.getSuite().getName());
    }
}
