package test_classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailedReporter {

    @Test
    public void test1(){

        System.out.println("Test 1");
    }

    @Test
    public void test2(){
       // Assert.fail();
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }
}
