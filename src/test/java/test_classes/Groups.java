package test_classes;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "smoke")
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(groups = "smoke")
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(groups = "smoke")
    public void test3(){

    }
}
