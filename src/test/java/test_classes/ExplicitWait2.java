package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait2 extends TestBase {

    // titleIs("text"); -> waits until title is equal to specified text

    // titleContains("text"); ->  waits until title contains specified text

    // urlContains("text"); ->  waits until URL contains specified text


   @Test
    public void titleIsTitleContains(){
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys("java" + Keys.ENTER);

       // titleIs()
       wait.until(ExpectedConditions.titleIs("java - Google Search"));
       System.out.println(driver.getTitle());

       // refresh the page
       driver.navigate().refresh();

       // titleContains()
       wait.until(ExpectedConditions.titleContains("java"));
       System.out.println(driver.getTitle());

       // refresh the page
       driver.navigate().refresh();

       wait.until(ExpectedConditions.urlContains("java"));

       System.out.println(driver.getCurrentUrl());



   }

}
