package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;

@SpringBootApplication
public class ResponseToAVacanciesOnHhApplication {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/felix/IdeaProjects/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        webDriver.get("https://hh.ru/account/login?backurl=%2F&hhtmFrom=main");


//        wait.wait(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div/div[2]/div[2]/span"))).click();

//        webDriver.findElement(By.className("bloko-icon bloko-icon_cancel bloko-icon_initial-default")).click();
//        нажимаем на кнопку "Войти с паролем", чтобы разблокировать функцию входа
//        используя логин и пароль
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/form/div[4]/button[2]"))).click();



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[1]/input"))).sendKeys(LoginProperties.getProperty("username"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[2]/span/input"))).sendKeys(LoginProperties.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[7]/div/button[1]"))).click();



//        SpringApplication.run(ResponseToAVacanciesOnHhApplication.class, args);
    }

}
