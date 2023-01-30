package code.day10_properties;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearLoginUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c1_properties_practice extends TestBase {
    // open Chrome
    // go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    // click on box which belongs "charles Dodgeson"
    // click delete button
    // verify if charles deleted from the list
    @Test
    public void TC1_charlesDeleteVerification(){
        // go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // login smartBear
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_URL"));
        SmartBearLoginUtils.loginForSmartBear(driver);
        // click on box which belongs "charles Dodgeson"
        WebElement clickBox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        clickBox.click();
        BrowserUtils.StateWait(3);

        WebElement delet = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        delet.click();

        // verify if charles deleted from the list
        List<WebElement> listOfAllNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_btnDelete']/tbody/tr/td[2]"));
        for (WebElement eachName:listOfAllNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"), "Assertion failes");
        }



    }
}
