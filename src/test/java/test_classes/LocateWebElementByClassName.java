package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementByClassName {

    public static void main(String[] args) throws InterruptedException {
        // Locate Web element by Class name

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.className("button"));

        loginButton.click();

        Thread.sleep(7000);

        driver.quit();


    }
}
