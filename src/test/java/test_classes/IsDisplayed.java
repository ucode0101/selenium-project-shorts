package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {

        // isDisplayed(); --> This method returns Boolean if web element is visible/displayed
        //isDisplayed() method is used to check if a web element is visible on the page
        // If it is visible, it returns true else it returns false
        // Before using isDisplayed(), we have to locate the web element using any of locators

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);

        WebElement addButton = driver.findElement(By.xpath("//div[@class='example']"));

        boolean isButtonDisplayed = addButton.isDisplayed();

        if (isButtonDisplayed){
            System.out.println("Button is displayed");
            addButton.click();
        } else {
            System.out.println("Button is not displayed");
        }


        Thread.sleep(5000);

        driver.quit();


    }
}
