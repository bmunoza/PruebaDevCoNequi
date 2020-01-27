package com.automationpractice.www.utils;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void withTheName(String path) {
        File file = ((TakesScreenshot) ThucydidesWebDriverSupport.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(path));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
