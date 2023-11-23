package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;
import utility.Waits;

public class TestNGDataProvider {
    // Data-Driven Testing allows us to run the same test with multiple data sets
    // TestNG provides built-in support for data-driven testing through the use of data provider


    @DataProvider(name = "testData")
    public Object[][] provideData(){

        return new Object[][] {
                {"Testing","testing"},
                {"Test1","Test1"},
                {"Tester","test"},
                {"Hello","testing"}

        };

    }




    @Test(dataProvider = "testData")
    public void testDataProvider(String username, String password){


        Driver.getDriver().get(ConfigReader.getProperty("smart"));

        WebElement usernameInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys(username);

        WebElement pwdInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_password"));
        pwdInput.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


        Waits.wait(3);

        Driver.quitDriver();


    }

}
