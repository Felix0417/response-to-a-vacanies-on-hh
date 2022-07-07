package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//*[contains(@class, 'bloko-form-item')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@class, 'bloko-link bloko-link_pseudo')]")
    private WebElement clickToOpenPassField;


    @FindBy(xpath = "//*[contains(@class, 'bloko-input_password')]")
    private WebElement passField;


    @FindBy(xpath = "//*[contains(@class, 'bloko-button_kind-primary')]")
    private WebElement authWithLoginAndPassword;

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }

    public void clickToOpenPasswordField(){
        clickToOpenPassField.click();
    }

    public void inputPassword(String password){
        passField.sendKeys(password);
    }

    public void authoriseBtn(){
        authWithLoginAndPassword.click();
    }
}
