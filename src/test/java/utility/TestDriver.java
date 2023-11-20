package utility;

import org.testng.annotations.Test;

public class TestDriver {

    @Test
    public void simpleTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        Thread.sleep(4000);
        Driver.quitDriver();
    }
}
