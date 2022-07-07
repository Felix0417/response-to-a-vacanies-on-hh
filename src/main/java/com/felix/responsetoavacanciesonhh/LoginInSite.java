package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginInSite {


    public void setup() {

//        путь к драйверу
        System.setProperty("webdriver.chrome.driver", LoginProperties.getProperty("chromedriver"));
//        создание драйвера
        WebDriver webDriver = new ChromeDriver();
//        настройка - разворачивание на полный экран и задержка по времени
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        переход на страницу
        webDriver.get(LoginProperties.getProperty("loginpage"));
    }


}
