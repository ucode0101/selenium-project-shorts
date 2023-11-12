package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) throws InterruptedException {

        // isEnabled()--> This method is used to check if button/input enabled on the page
        // Return type boolean, returns true if it is enabled else returns false
        // First we need to locate web element

        // isEnabled() vs isSelected() vs isDisplayed()

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        Thread.sleep(2000);

        WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));

        // true
        System.out.println(yesRadio.isEnabled());

        WebElement noRadio = driver.findElement(By.xpath("//input[@id='noRadio']"));

        // false
        System.out.println(noRadio.isEnabled());

        Thread.sleep(2000);

        driver.quit();

    }
}
