package code.day6_Dropdown;

import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_SmartBearUtilPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // open a Chrome browser
        // go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // enter username---->Tester
        // enter password ----> test
        // click on login button
        // verify title equal : Web Orders
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Test
    public void TC1_loginSmartBearUtil(){
        SmartBearLoginUtils.loginForSmartBear(driver);
        // verify title equal : Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"));



    }

}
