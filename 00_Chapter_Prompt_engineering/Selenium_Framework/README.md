# Demo Login Automation

This Selenium + Java + TestNG project validates a local demo login page. The fixture is bundled with the test resources, so the suite runs without a Salesforce account or network access to a login service.

## Project structure

- src/test/java/com/salesforce/constants/FrameworkConstants.java
- src/test/java/com/salesforce/driver/DriverFactory.java
- src/test/java/com/salesforce/base/BaseTest.java
- src/test/java/com/salesforce/login/LoginPage.java
- src/test/java/com/salesforce/login/ValidLoginTest.java
- src/test/java/com/salesforce/login/InvalidLoginTest.java
- src/test/java/com/salesforce/util/ConfigReader.java
- src/test/java/com/salesforce/util/WaitUtils.java
- src/test/java/com/salesforce/util/ScreenshotUtil.java
- src/test/java/com/salesforce/listeners/TestListener.java
- src/test/resources/config.properties
- src/test/resources/demo-login.html
- src/test/resources/testng.xml

## Prerequisites

- Java 17+
- Maven 3.9+
- Chrome browser installed

## Run tests

Run the suite from this directory:

```sh
mvn test
```

The local fixture accepts `demo.user@example.com` / `demo-password`. Invalid or empty credentials display an error message.

## Notes

- The framework uses Page Object Model with PageFactory.
- Stable ID-based CSS selectors are used for the demo form.
- WebDriverWait is used instead of Thread.sleep().
- Invalid login test cases are supplied in a data-driven pattern, including missing fields.
- Screenshots are captured on test failure.
