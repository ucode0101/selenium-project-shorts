package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait4 extends TestBase {

    // elementToBeClickable(Web element); -> waits for specified web element to be clickable

    @Test
    public void toBeClickable() throws InterruptedException {
        driver.get("https://only-testing-blog.blogspot.com/2013/11/new-test.html?");


        WebElement submitBtn = driver.findElement(By.id("submitButton"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));

        submitBtn.click();

        WebElement submitBtn2 = driver.findElement(By.id("submitButton"));

        wait.until(ExpectedConditions.elementToBeClickable(submitBtn2)).click();





    }
}
