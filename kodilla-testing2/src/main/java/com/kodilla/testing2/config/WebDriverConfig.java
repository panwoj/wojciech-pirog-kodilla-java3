package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else if(driver.equals(CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", Arrays.asList("ignore-certificate-errors"));
            return new ChromeDriver(options);
        } else {
            return null;
        }
    }
}
