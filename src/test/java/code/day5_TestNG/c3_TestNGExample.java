package code.day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class c3_TestNGExample {
    @BeforeMethod
    public void setupClass() {
        System.out.println("Before class is running ");
    }

    @AfterMethod
    public void setupAfterClass() {
        System.out.println("Before class is running ");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Before method is running ");
    }

    @AfterMethod
    public void closing() {
        System.out.println("After method is running ");
    // TC1 is depends on TC3, so if TC3 fails, TC1 will be skipped
    }
    @Test(priority = 3, dependsOnMethods = "TC3")
    public void TC1(){
        System.out.println("Test case 1 is running");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("Test case 3 is running");
        int actualAge = 20;
        int expectedAge= 25;
        Assert.assertEquals(actualAge,expectedAge);
        System.out.println("Assertion for age is passed");
    }
    @Test(priority = 2 )
    public void TC2(){
        System.out.println("Test case 2 is running");
        String color = "red";
        String expectedColor = "red";
        Assert.assertEquals(color,expectedColor);
        System.out.println("Assertion for color is passed");
    }

    @Test @Ignore
    public void TC4(){
        System.out.println("Test case 4 is running");

    }
}
