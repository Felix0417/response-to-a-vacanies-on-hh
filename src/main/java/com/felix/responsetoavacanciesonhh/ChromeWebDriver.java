package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeWebDriver extends ChromeDriver{

    static WebDriver webDriver = new ChromeDriver();
    static WebDriverWait waiting = new WebDriverWait(webDriver, Duration.ofSeconds(10));



    public static void waitingPageAndClick(By by){
        waiting.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public static void waitingPageAndFillForm(By by, String text){
        waiting.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(LoginProperties.getProperty(text));
    }
}
