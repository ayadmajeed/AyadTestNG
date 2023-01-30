package code.day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c2_TestNGExample1 {
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

    }

    @Test(priority = 3)
    public void TC1() {
        System.out.println("Test case 1 is running");
    }

    @Test(priority = 1)
    public void TC3() {
        System.out.println("Test case 3 is running");
        String actualName = "Sardar";
        String expectedName = "Jason";
        Assert.assertEquals(actualName, expectedName);
        System.out.println("print actual name" +actualName);
    }
    @Test(priority = 2)
    public void TC2(){
        String actualCountry = "USA";
        String expectedCountry = "USA";
        Assert.assertEquals(actualCountry,expectedCountry);
        System.out.println("actual country is "+ expectedCountry  );
    }


}