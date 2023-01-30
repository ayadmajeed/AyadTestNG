package code.day7_WebTable_Alerts;

import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_WebTable {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        SmartBearLoginUtils.loginForSmartBear(driver);

    }
    @Test
    public void TC1_VerifyMarkStreetName(){
        // verify mark street name as" 9, Maple Valley"
        WebElement markStreet = driver.findElement(By.xpath("//td[.='9, Maple Valley']"));

        //System.out.println("Mark street is "+ markStreet.getText());
        Assert.assertEquals(markStreet.getText(), "9, Maple Valley");

        }

}
