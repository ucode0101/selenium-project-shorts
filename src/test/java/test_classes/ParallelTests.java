package test_classes;

import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;
import utility.Waits;

public class ParallelTests {

    @Test(groups = "test1")
    public void test1()  {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Waits.wait(3);
        Driver.quitDriver();

    }

    @Test(groups = "test1")
    public void test2(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
        Waits.wait(3);
        Driver.quitDriver();

    }

    @Test(groups = "test1")
    public void test3(){
        Driver.getDriver().get(ConfigReader.getProperty("google"));
        Waits.wait(3);
        Driver.quitDriver();


    }


}
