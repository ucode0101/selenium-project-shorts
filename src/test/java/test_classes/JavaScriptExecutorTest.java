package test_classes;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends TestBase {

    // JavaScriptExecutor interface comes from Selenium WebDriver
    // that allows us to execute JavaScript code from within our Selenium script
    // First we create a JavascriptExecutor instance by casting the WebDriver instance to JavascriptExecutor
    // Then, we use the executeScript method and pass JavaScript code as a String to run JavaScript code
    // One of the common use of JavascriptExecutor is to interact with hidden WebElements (one of many use cases)

    @Test
    public void javaScriptExecutor() throws InterruptedException {

       // driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.get("https://www.amazon.com/");

        //WebElement hiddenElement = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        //System.out.println(hiddenElement.getText());

        // First we create a JavascriptExecutor instance by casting the WebDriver instance to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // use the executeScript method and pass JavaScript code as a String to run JavaScript code
       // String text = js.executeScript("return arguments[0].innerHTML;",hiddenElement).toString();
       // System.out.println(text);

        // click on web element using JavascriptExecutor

       // WebElement startBtn = driver.findElement(By.cssSelector("div#start>button"));

        // This will click on web element including hidden web element
       // js.executeScript("arguments[0].click();",startBtn);

       // Thread.sleep(4000);

        WebElement elm = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
        // to scroll up/down to given element using JavascriptExecutor

        // To scroll to dow/up the page to the given web element
        js.executeScript("arguments[0].scrollIntoView(true)",elm);
        Thread.sleep(4000);


    }
}
