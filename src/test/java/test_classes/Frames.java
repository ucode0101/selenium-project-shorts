package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames extends TestBase {
    /*
    Frames in Selenium are segments of an HTML document, also known as iframes,
    that contain individual HTML documents, frequently used when a webpage has
    several sections or pages that must be displayed or interacted with independently.

    There are 3 ways we can locate and switch driver to iframe.

    1.Locating as WebElement and then using that WebElement to switch.
    WebElement iframe = driver.findElement(By.xpath("xpath"));
	1. driver.switchTo().frame("iframe") -> Locate it as any other WebElement
	2. driver.switchTo().frame(0) -> Switching to iframe by index
	3. driver.switchTo().frame("id") -> Switching to iframe by id value if it has id

	- driver.switchTo().parentFrame() -> Whenever  we need to switch back to the parent Frame
	- driver.switchTo().defaultContent(); Whenever we need to go back to main Frame parent
     */

    @Test
    public void frames(){
        driver.get("https://the-internet.herokuapp.com/iframe");

        // locating iframe by xpath
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iframe); // switching to frame by iframe xpath

        //driver.switchTo().frame("mce_0_ifr"); // switching to frame by id

        // switching to iframe by index
        driver.switchTo().frame(0); // 0 is the first iframe when switching by index

        WebElement element = driver.findElement(By.xpath("//*[@id='tinymce']//p"));

        System.out.println(element.getText());

        // It is always good practice to switch back to parent/defaultContent frame
        // when you are done

        // switch to parent frame (Not the default content or main frame
        //driver.switchTo().parentFrame();



        // switch to default content/the main frame
        driver.switchTo().defaultContent();

        String text = driver.findElement(By.xpath("//div/a[@target='_blank']")).getText();
        System.out.println(text);

    }
}
