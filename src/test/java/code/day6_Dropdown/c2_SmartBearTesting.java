package code.day6_Dropdown;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_SmartBearTesting {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        // open a Chrome browser
        // go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // enter username---->Tester
        // enter password ----> test
        // click on login button
        // verify title equal : Web Orders
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test
    public void TC1_LoginVerification(){
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys("test");

        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
        Assert.assertEquals(actualTitle,expectedTitle,"Verification of Web Order title is failed");


    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}
