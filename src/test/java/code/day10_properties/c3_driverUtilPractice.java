package code.day10_properties;

import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_driverUtilPractice extends TestBase2 {
    //go to google
    //search for monitor
    //verify title contains hello
    @Test
    public void TC1(){
        //go to google
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_URL"));
        //search for monitor
        WebElement searchBox = DriverUtil.getDriver().findElement(By.name("q"));
        String searchItem = PropertiesReadingUtil.getProperties("googleSearchData");
        searchBox.sendKeys(searchItem+ Keys.ENTER);
        //verify title contains monitor
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));



    }
}
