package code.day8_IframAndNegativeTest;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_SmartBearNegativeTest {
    // open a chrome browser
    // gi to : "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx"
    // enter incorrect username
    // enter wrong password
    //click login button
    // verify error message displayed :Invalid Login or Password

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @AfterMethod
    public void closing(){
        BrowserUtils.StateWait(2);
        driver.close();
    }
    @Test(dataProvider = "LoginCredentials")
    public void TC1_negativeTest(String userID, String passwordID){
        SmartBearLoginUtils.negativeLoginForSmartBear(driver, userID, passwordID);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
        Assert.assertEquals(actualTitle,expectedTitle);





    }
    // We create a dataprovider to have a small data library
    @DataProvider(name="LoginCredentials")
    public static Object[][] invalidUserCredentials(){
        return new Object[][]{
                {"Serdar","Kocan12"},
                {"Arion", "kocer99"},
                {"Yaseen" , "alsakkaf_34"},
                {"hasan", "raman90"},
                {"Seray", "bestStudent.11"},
                {"Tester", "test"},
        };
    }
}
