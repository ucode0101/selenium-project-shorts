package test_classes;

import base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptAlert extends TestBase {
    /*
        Alert types:
        1) Warning/Information
        2) Prompt Alert.
        3) Confirmation Alert.

    	How to handle JavaScript Alert in Selenium WebDriver
        Alert provides the below few methods which are used in Selenium WebDriver.

        ex: Alert alert = driver.switchTo().alert();

        1) dismiss() --> To click on the 'Cancel' or 'Dismiss' button of the alert.
        2) accept() --> To click on 'Ok' or 'Accept' button of the alert.
        3) getText() --> To capture the alert message. To store it in String variable
        4) sendKeys("text") --> To send some text into alert input box.

     */

    @Test
    public void jsAlerts() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        jsAlert.click();

        // one way
        Alert alert = driver.switchTo().alert();

        //Thread.sleep(2000);

        System.out.println(alert.getText());
        alert.accept();

        // another way
        //driver.switchTo().alert().accept();

       // Thread.sleep(3000);

        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        //Thread.sleep(2000);
        alert.dismiss();

        //Thread.sleep(2000);

        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();
        //Thread.sleep(2000);

        alert.sendKeys("Test");
        alert.accept();

        //Thread.sleep(3000);

    }

}
