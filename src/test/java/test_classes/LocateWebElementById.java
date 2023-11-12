package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementById {
    public static void main(String[] args) throws InterruptedException {
        // Locating web element by ID

        WebDriver driver = new ChromeDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        Thread.sleep(2000);

        loginButton.click();
        Thread.sleep(7000);

        driver.quit();




    }
}
