package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass4 extends TestBase {

    @Test
    public void keyboardActions() throws InterruptedException {

        driver.get("https://www.google.com/");

        // Google search box
        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        Actions actions = new Actions(driver);

        // holding down the Shift key on our keyboard
        // directly hold the key down and sendKeys in one line
       // actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"hello").perform();

        // holding down the Shift key on our keyboard
        actions.keyDown(Keys.SHIFT).perform();

        // sending the text in to the search box
        searchBox.sendKeys("hello");

        // when you use keyDown(Keys.SHIFT) method
        // It recommended to use keyUp(Keys.SHIFT) to release the key that the actions is holding
        actions.keyUp(Keys.SHIFT).perform();

        actions.keyDown(Keys.SPACE).sendKeys("hello").perform();

        Thread.sleep(4000);


    }
}
