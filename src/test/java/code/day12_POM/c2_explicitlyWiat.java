package code.day12_POM;

import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_explicitlyWiat {
    @Test
    public void TC1_ExplicitlyWiat(){
              /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception
         */

/*
        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */
        WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
        DriverUtil.getDriver().get("https://google.com");
        //verify google title
        driverWait.until(ExpectedConditions.titleIs("Google"));
        //send "iphone 14 pro
        WebElement googleSearch = DriverUtil.getDriver().findElement(By.name("q"));
        driverWait.until(ExpectedConditions.elementToBeClickable(googleSearch));
        driverWait.until(ExpectedConditions.visibilityOf(googleSearch));
        googleSearch.sendKeys("iphone 14 pro"+ Keys.ENTER);
    }

}
