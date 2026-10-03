# Salesforce Login Automation

This project contains an enterprise-style Selenium + Java + TestNG framework for validating the Salesforce login page with XPath-based selectors and reusable utilities.

## Project structure

- src/test/java/com/salesforce/constants/FrameworkConstants.java
- src/test/java/com/salesforce/driver/DriverFactory.java
- src/test/java/com/salesforce/base/BaseTest.java
- src/test/java/com/salesforce/pages/LoginPage.java
- src/test/java/com/salesforce/tests/ValidLoginTest.java
- src/test/java/com/salesforce/tests/InvalidLoginTest.java
- src/test/java/com/salesforce/util/ConfigReader.java
- src/test/java/com/salesforce/util/WaitUtils.java
- src/test/java/com/salesforce/util/ScreenshotUtil.java
- src/test/java/com/salesforce/listeners/TestListener.java
- src/test/resources/config.properties
- src/test/resources/suite.xml

## Prerequisites

- Java 17+
- Maven 3.9+
- Chrome browser installed

## Run tests

1. Set valid credentials as JVM properties:
   mvn test -DsuiteXmlFile=src/test/resources/suite.xml -Dsalesforce.username="your-email@example.com" -Dsalesforce.password="your-password"

2. Or update config.properties before running:
   salesforce.username=
   salesforce.password=

3. Run the suite:
   mvn test -DsuiteXmlFile=src/test/resources/suite.xml

## Notes

- The framework uses Page Object Model with PageFactory.
- Only XPath selectors are used.
- WebDriverWait is used instead of Thread.sleep().
- Invalid login test cases are supplied in a data-driven pattern.
- Screenshots are captured on test failure.
