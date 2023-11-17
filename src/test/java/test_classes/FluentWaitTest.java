package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitTest extends TestBase  {

    // The fluent wait is similar to explicit wait in Selenium with one additional argument of
    // frequency (also known as polling time). The frequency number tells the WebDriver to keep checking
    // for the element at regular intervals and wait till the maximum of "Duration.ofSeconds".
    // If the element becomes available earlier, we can proceed with our execution (like implicit/explicit wait)
    // Let’s say you have an element which sometimes appears in just 1 second, and sometimes it takes longer to appear.


    @Test
    public void fluentWait(){

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));

        startButton.click();


        WebElement textElement = driver.findElement(By.cssSelector("div#finish>h4"));


        // Fluent wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10)) // this is the wait time
                .pollingEvery(Duration.ofSeconds(3)) // WebDriver keeps checking for the element every 3 second
                .ignoring(NoSuchElementException.class); // Ignore NoSuchElementException



        String text = wait.until(ExpectedConditions.visibilityOf(textElement)).getText();

        System.out.println(text);
        //String text2 = textElement.getText();

    }
}
