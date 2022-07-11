package com.felix.responsetoavacanciesonhh;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResponseToAVacanciesOnHhApplication {

    public static void main(String[] args) throws InterruptedException {
//        перед запуском сверь данные ОС в классе LoginProperties

//        для Linux
        System.setProperty("webdriver.chrome.driver", "/home/felix/IdeaProjects/chromedriver");
//        для Windows
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Felix\\IdeaProjects\\chromedriver.exe");

        ChromeWebDriver driver = new ChromeWebDriver();

        new LoginPage().authoriseInSite(driver);

//        после перехода открываем ссылку с поиском вакансий
        new SearchAndRequest().findAndSendRequest(driver);




    }

}
