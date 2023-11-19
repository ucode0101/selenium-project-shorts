package test_classes;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass3 extends TestBase {


    @Test
    public void scrollPageUpAndDown() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(4000);

    }

}
