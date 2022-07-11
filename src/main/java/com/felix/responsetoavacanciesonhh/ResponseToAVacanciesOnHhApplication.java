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


//        перед запуском сверь данные ОС в классе LoginProperties

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Felix\\IdeaProjects\\chromedriver.exe");
        // переходим на сайт ХХ
        ChromeWebDriver.webDriver.get("https://hh.ru/account/login?backurl=%2F&hhtmFrom=main");

//        убираем всплывающее окошко
        ChromeWebDriver.waitingPageAndClick(By.xpath("/html/body/div[8]/div/div/div/div[2]/div[2]/span"));

//        открываем форму для ввода логина и пароля и вводим туда данные
        ChromeWebDriver.waitingPageAndClick(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/form/div[4]/button[2]"));
        ChromeWebDriver.waitingPageAndFillForm(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[1]/input"), "username");
        ChromeWebDriver.waitingPageAndFillForm(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[2]/span/input"), "password");
        ChromeWebDriver.waitingPageAndClick(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[4]/div/button[1]"));

//        для Linux
//        System.setProperty("webdriver.chrome.driver", "/home/felix/IdeaProjects/chromedriver");

//        для Windows
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Felix\\IdeaProjects\\chromedriver.exe");

    }

}
