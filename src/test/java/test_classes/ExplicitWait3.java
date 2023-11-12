package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait3 extends TestBase {

    // visibilityOf(Web element); -> waits for visibility of element (element that is present, but hidden/not visible)

    // invisibilityOf(Web element); -> wait for invisibility of element

    @Test
    public void visibilityOfInvisibilityOf(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement start = driver.findElement(By.xpath("//div[@id='start']/button"));
        start.click();

        //WebElement element = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        //String text = wait.until(ExpectedConditions.visibilityOf(element)).getText();


        //System.out.println(text);

        WebElement loading = driver.findElement(By.xpath("//div[@id='loading']"));

       wait.until(ExpectedConditions.invisibilityOf(loading));

       String text2 = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();

        System.out.println(text2);

    }
}
