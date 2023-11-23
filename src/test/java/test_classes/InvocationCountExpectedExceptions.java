package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;




public class InvocationCountExpectedExceptions {

    // expectedExceptions is used to tell/let testNG know if you are expecting any exception
    // so testNG can ignore it when it occurs/happens
    // expectedExceptions work only with unchecked/run-time Exception

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptions(){

      //  System.out.println(7 / 0);

        //System.out.println("Hello");

        Driver.getDriver().get(ConfigReader.getProperty("smart"));

        WebElement element = Driver.getDriver().findElement(By.xpath("invalidXpath"));

        Driver.quitDriver();

    }







    // invocationCount allows to run our test for certain amount of time
    // It is like for loop in java


    @Test(invocationCount = 100)
    public void testInvocationCount(){
        System.out.println("Hello");
    }







}
