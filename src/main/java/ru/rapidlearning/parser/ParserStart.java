package ru.rapidlearning.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

public class ParserStart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eugenia\\IdeaProjects\\ru.rapid-learning\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://medium.com/topic/politics/");
        Document doc = Jsoup.parse(driver.getPageSource());
        Elements elements = doc.body().select(".fe.ff.d .z.fp.ac");
        for (Element element : elements) {
            System.out.println(element);
        }
        driver.quit();


    }
}
