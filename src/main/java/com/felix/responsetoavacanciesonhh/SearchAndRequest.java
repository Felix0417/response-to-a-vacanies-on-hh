package com.felix.responsetoavacanciesonhh;

import org.openqa.selenium.WebDriver;

public class SearchAndRequest extends Thread {

    public void findAndSendRequest(ChromeWebDriver driver) throws InterruptedException {
        this.wait(10000);

//        переходим по ссылке с поиском и настроенными фильтрами
        driver.getWebDriver().get("https://hh.ru/search/vacancy?area=1&clusters=true&enable_snippets=true&experience=between1And3&items_on_page=100&no_magic=true&ored_clusters=true&search_field=name&search_field=description&text=Java&order_by=publication_time&hhtmFrom=vacancy_search_list");
    }
}
