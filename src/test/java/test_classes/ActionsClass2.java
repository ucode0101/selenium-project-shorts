package test_classes;

import base.TestBase;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass2 extends TestBase {

    // moveToElement(element).perform();
    // - This method takes 1 parameter(webElement), and perform hover (hover over the web element)

    // dragAndDrop(source, target).perform();
    // - This method takes 2 parameters(webElements), drag & drop first element into second element

    @Test
    public void moveToElement() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement user1 = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));

        WebElement user2 = driver.findElement(By.xpath("(//div[@class='figure'])[2]"));

        WebElement user3 = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(user1).perform();
        Thread.sleep(3000);

        actions.moveToElement(user2).perform();

        Thread.sleep(3000);


        actions.moveToElement(user3).perform();

        Thread.sleep(4000);

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement targetCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));

        WebElement sourceCircle = driver.findElement(By.xpath("//div[@id='draggable']"));
        targetCircle.sendKeys();


        Actions actions = new Actions(driver);

        actions.dragAndDrop(sourceCircle, targetCircle).perform();

        Thread.sleep(5000);


    }








}
