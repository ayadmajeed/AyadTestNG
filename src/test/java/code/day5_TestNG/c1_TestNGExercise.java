package code.day5_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c1_TestNGExercise {
    @BeforeMethod
    public void setupClass(){
        System.out.println("Before class is running ");
    }
    @AfterMethod
    public void setupAfterClass(){
        System.out.println("Before class is running ");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method is running ");
    }

    @AfterMethod
    public void closing(){
        System.out.println("After method is running ");

    }

    @Test
    public void TC1(){

        System.out.println("Test1 is running");
    }
    @Test
    public void TC2(){
        System.out.println("Test 2  is running ");

    }

}
