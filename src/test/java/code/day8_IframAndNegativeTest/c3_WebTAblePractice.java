package code.day8_IframAndNegativeTest;

import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_WebTAblePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test(dataProvider ="TestDataForStreetName")
    public void TC1_StreetVerification(String streetName){
        SmartBearLoginUtils.loginForSmartBear(driver);
        SmartBearLoginUtils.verifyStreet(driver, streetName );


    }
    @DataProvider(name = "TestDataForStreetName")
    public static Object[][] test(){
        return new Object[][]{
                {"167 sands street 11201 Brooklyn NY"},
                {"20 jmaes madison"},
                {" 1222 old windmill cir"},
                {"1923 washgonton street"},
                {"14, North av"}

        };
    }
}
