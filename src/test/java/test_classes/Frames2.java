package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames2 extends TestBase {
    /*
    When dealing with nested frames in Selenium, you need to use the switchTo().frame()
    method to navigate through the frames. If frames are nested (i.e., one frame within another),
    you need to switch to each frame in the hierarchy to interact with elements inside those frames.

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
    public void nestedFrames(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // locating parent frame for nested frames
        WebElement parentFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));

        // switching to parent frame for nested frames
        driver.switchTo().frame(parentFrame);

        // locating left nested frame
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));

        // switching to left nested frame
        driver.switchTo().frame(leftFrame);

        String leftText = driver.findElement(By.xpath("//body")).getText();
        System.out.println(leftText);

        // Switch back to parent frame
        driver.switchTo().parentFrame();



        // locating middle nested frame
        WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));

        // switch to middle nested frame
        driver.switchTo().frame(middleFrame);

        String middleText = driver.findElement(By.id("content")).getText();
        System.out.println(middleText);

        // switching back to parent frame
        driver.switchTo().parentFrame();

        // locating nested right frame
        WebElement rightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));

        // switching to nested right frame
        driver.switchTo().frame(rightFrame);

        String rightText = driver.findElement(By.xpath("//body")).getText();
        System.out.println(rightText);


        // switching back to defaultContent/ Main/default frame
        driver.switchTo().defaultContent();

    }
}
