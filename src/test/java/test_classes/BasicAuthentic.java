package test_classes;

import base.TestBase;
import org.testng.annotations.Test;

public class BasicAuthentic extends TestBase {
    // Basic Authentication:
    // To test a website which is protected by basic auth
    // You can pass your username and password in the URL to authenticate yourself

    @Test
    public void basicAuthentication() throws InterruptedException {


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        Thread.sleep(5000);

    }

}
