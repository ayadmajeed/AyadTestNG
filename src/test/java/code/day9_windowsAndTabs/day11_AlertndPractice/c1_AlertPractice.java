package code.day9_windowsAndTabs.day11_AlertndPractice;

import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_AlertPractice extends TestBase2 {
    /*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */
    @Test
    public void AlertPractice() throws InterruptedException {
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']")).click();
        DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        Thread.sleep(10000);
        alert.sendKeys("Hello World");
        alert.accept();
        //         Validate your text appearing on the page
        WebElement actualText = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));





    }
}
