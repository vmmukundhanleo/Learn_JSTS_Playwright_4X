package com.salesforce.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.salesforce.constants.FrameworkConstants;

public final class ScreenshotUtil {
    private ScreenshotUtil() {
    }

    public static String capture(WebDriver driver, String testName) {
        Path path = Paths.get(FrameworkConstants.SCREENSHOT_PATH);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                throw new RuntimeException("Unable to create screenshot directory", e);
            }
        }

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String fileName = testName + "_" + timestamp + ".png";
        Path destination = path.resolve(fileName);

        try {
            Files.copy(source.toPath(), destination);
        } catch (IOException e) {
            throw new RuntimeException("Unable to save screenshot", e);
        }

        return destination.toString();
    }
}
