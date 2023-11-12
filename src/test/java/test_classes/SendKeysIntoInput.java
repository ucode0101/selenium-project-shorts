package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysIntoInput {

    public static void main(String[] args) throws InterruptedException {
        // sendKeys("string"); --> this method is used to type text into input box/ text field
        // This method comes from WebElement interface

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        usernameInput.sendKeys("Tester");
        Thread.sleep(2000);

        passwordInput.sendKeys("test");

        Thread.sleep(2000);

        loginButton.click();

        Thread.sleep(6000);

        WebElement logoutButton = driver.findElement(By.xpath("//a[@id='ctl00_logout']"));

        logoutButton.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
