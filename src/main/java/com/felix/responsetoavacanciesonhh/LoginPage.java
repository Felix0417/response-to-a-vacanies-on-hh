package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.By;

public class LoginPage{

    public void authoriseInSite(ChromeWebDriver driver) throws InterruptedException {
//         переходим на сайт ХХ
        driver.getWebDriver().get("https://hh.ru/account/login?backurl=%2F&hhtmFrom=main");

//        убираем всплывающее окошко
        driver.waitingPageAndClick(By.xpath("/html/body/div[8]/div/div/div/div[2]/div[2]/span"));

//        открываем форму для ввода логина и пароля и вводим туда данные
        driver.waitingPageAndClick(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/form/div[4]/button[2]"));
        driver.waitingPageAndFillForm(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[1]/input"), "username");
        driver.waitingPageAndFillForm(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[2]/span/input"), "password");
        driver.waitingPageAndClick(By.xpath("//*[@id=\"HH-React-Root\"]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/form/div[4]/div/button[1]"));
    }
}
