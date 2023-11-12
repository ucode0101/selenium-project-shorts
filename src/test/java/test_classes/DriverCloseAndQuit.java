package test_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // this code is used to open a new tab
        ((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");

        Thread.sleep(3000);

        // close() -> This method is used to close the current browser window or tab
        // while keeping the WebDriver session and the browser instance running
        // close() -> it closes the current window/tab
        //  If there are multiple tabs/windows opened, it only closes the one that the driver is in
        //driver.close();



        // quit() -> this method is used to terminate the WebDriver session entirely and close all
        // associated browser's windows or tabs.
        // quit() -> it closes all windows/tabs that were opened

        driver.quit();

        // most probably we will be using driver.quit(), because we want to close the driver session
        // once we are done

        // driver.close() vs driver.quit()
        // driver.close() -> closes the current window/tab, but doesn't end the driver session
        // driver.quit() -> closes all windows/tabs and ends the driver session




    }
}
