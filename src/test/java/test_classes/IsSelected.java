package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {
        // isSelected() --> To check if checkbox / Radio button is selected
        // Return type boolean, if checked/selected returns true else returns false
        // First we need to locate checkbox/radio button

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        Thread.sleep(3000);

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        if (!checkbox1.isSelected()){
           checkbox1.click();
        } else{

            System.out.println("Checkbox 1 is already selected");
        }

        if (!checkbox2.isSelected()){
           checkbox2.click();
           System.out.println("Checked Checkbox 2");
        }
        else{

            System.out.println("Checkbox 2 is already selected");
        }

        Thread.sleep(5000);

        driver.quit();


    }
}
