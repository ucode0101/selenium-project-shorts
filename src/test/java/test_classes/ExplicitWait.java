package test_classes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait  {

    //	Explicit Wait (Synchronization)
    //	- Explicit wait is applied using WebDriverWait class object.
    //	- WebDriverWait comes from Selenium
    //	- Using WebDriverWait, we can wait until given ExpectedConditions
    //	Syntax: WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //  wait.until(ExpectedConditions.visibilityOf());

    // ExpectedConditions is the class that comes from selenium which has static methods
    // that we use to set the condition such as:
    //visibilityOfElementLocated(By.xpath("xpath")))


    @Test
    public void explicitWait(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().window().maximize();

        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));

        startButton.click();

       // String text = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       String text =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4"))).getText();

        System.out.println(text);




        driver.quit();
    }


}
