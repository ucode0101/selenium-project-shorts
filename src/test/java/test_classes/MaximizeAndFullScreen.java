package test_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MaximizeAndFullScreen {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        // maximize() -> this method is used to maximize your window/browser window
        // The browser window becomes as large as possible while still retaning the standard
        // window frame and control (close, minimize, maximize button)

        driver.manage().window().maximize();

        // fullscreen() this method is used to full screen your browser window
        // it put  the browser in full-screen mode
        // using fullscreen() the browser takes up the entire screen, including
        // the entire monitor or display area

       // driver.manage().window().fullscreen();


        // Most probably we will be using driver.manage().window().maximize();
        // but it's good to know the difference

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
