package code.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearLoginUtils {
    public static void loginForSmartBear(WebDriver driver){
        // enter username---->Tester
        // enter password ----> test
        // click on login button
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

    }
    public static void negativeLoginForSmartBear(WebDriver driver, String userID, String passwordID){
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys(userID);

        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys(passwordID);

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }
    public static void verifyStreet(WebDriver driver, String streetName){
        // to locate all table we are using //table[@id='ct100_MainContent_orderGrid']
        // to locate all table rows we are using //table[@id='ct100_MainContent_orderGrid']//tr
        // to locate (for example) 5 rows we are using //table[@id='ct100_MainContent_orderGrid']//tr[5]
        // to locate all street we are using //table[@id='ct100_MainContent_orderGrid']//tr//td[6]


        List<WebElement> streetList = driver.findElements(By.xpath("ctl00_MainContent_orderGrid"));
        for(WebElement eachStreet: streetList){
            if(eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }
        }
        Assert.fail("Street name:" +streetName+" is not present on the table");
    }
}
