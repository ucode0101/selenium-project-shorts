package test_classes;

import base.TestBase;
import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class MultiBrowserWindowsTabs extends TestBase {
    /*
     WebDriver can focus & control one browser window/tab at a time
     How to handle Multiple browser Windows/Tabs in Selenium
     Each browser window has a unique id known as "window handle"
     We can use that id to switch to that specific window
     getWindowHandle() --> it gets the unique id "window handle" of the current window/tab as String

     getWindowHandles() --> it returns set of all "window Handles" that currently open
                            return type Set of strings, we can store them into Set String

     */

    @Test
    public void multiBrowserWindowsTabs() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");

        // get current window id "window handle"
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        // This just some Javascript code to open
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://amazon.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");

        // get all IDs "window handles" for all open windows
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);

        // Loop and switch to each tab/window one by one


        for (String eachWindow : allWindow){
            Thread.sleep(3000);
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle());
            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }

        System.out.println(driver.getCurrentUrl());
        // How do you switch to specific tab when you are working with multiple tabs?
        // Get all winodw handles loop through and swith to each window, and use some condition break
        // so the driver statys in the windows

        // it's always good practice to switch back to the main window
        driver.switchTo().window(mainWindow);
        System.out.println(driver.getCurrentUrl());
    }
}
