package test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;
import utility.Waits;

public class TestDataProvider {
                                    // calling dataProvider from TestNGDataProvider.class
    @Test(dataProvider = "testData", dataProviderClass = TestNGDataProvider.class)
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
