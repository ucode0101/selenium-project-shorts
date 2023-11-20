package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import utility.Driver;

public class ActionsClass extends TestBase {

    // Actions class comes from Selenium WebDriver
    // Actions class allows us to do/perform advance mouse and keyboard actions:
    // Such as drag and drop, move to element, hover over, context(right) click, and more
    // Syntax: Actions actions = new Actions(driver);
    // After calling any method from Actions class, we have to call perform()
    // so it can perform the action

    @Test
    public void contextClick() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);

        // Every method must be followed by perform(), so the can perform its action
        actions.contextClick(box).perform();

        Thread.sleep(2000);

        // handle javascript alert
        driver.switchTo().alert().accept();

        Thread.sleep(4000);



    }

    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickBtn).perform();

        Thread.sleep(5000);
    }
}
