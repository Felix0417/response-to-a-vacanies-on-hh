package com.felix.responsetoavacanciesonhh;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ChromeWebDriver{

    @Getter
    private final WebDriver webDriver;

    @Getter
    private final WebDriverWait waiting;

    public ChromeWebDriver() {
        this.webDriver = new ChromeDriver();
        this.waiting = setWaiting();
    }

    public WebDriverWait setWaiting() {
        return new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
    }

    public void waitingPageAndClick(By by) {
        waiting.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public void waitingPageAndFillForm(By by, String text) {
        waiting.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(LoginProperties.getProperty(text));
    }
}
