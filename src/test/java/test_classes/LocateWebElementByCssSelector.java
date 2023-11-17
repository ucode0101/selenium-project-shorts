package test_classes;
import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWebElementByCssSelector extends TestBase {

    // CssSelector is one of the Locator in Selenium WebDriver
    // and has its own way of locating WebElements

    @Test
    public void cssLocator() throws InterruptedException {


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // locating web element with id(#) attribute values
        //WebElement usernameInput = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));


        // locating web element by className
        //WebElement usernameInput = driver.findElement(By.cssSelector(".txt"));

        // locating web element using tag and name attribute
        //WebElement usernameInput = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']"));

        // locating web element using tag name and id(#)
        //WebElement usernameInput = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));

        // locating web element by tag name and class name (.) means class attribute
       // WebElement usernameInput = driver.findElement(By.cssSelector("input.txt"));


        // locating web element using tag and any attribute
        WebElement usernameInput = driver.findElement(By.cssSelector("input[type='text']"));

        // To locate web elements using css selector

        // #idValue -> to locate web element by ID
        // .classValue -> to locate by web element className
        // tag[attribute='attributeValue'] -> to locate web element by any tag name and any attribute name & value
        // tag tag:nth-child(index) -> to locate specific web element when there > 1 web element

        Thread.sleep(2);

    }

}
