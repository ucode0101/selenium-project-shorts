package test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        // getPageSource() -> this is one of the WebDriver method that is used to get
        // the source of current page/the source of the last loaded page
        // Return Type is String

        String pageSource = driver.getPageSource();

        System.out.println(pageSource);



    }
}
