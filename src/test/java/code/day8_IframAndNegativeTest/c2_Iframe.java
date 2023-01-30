package code.day8_IframAndNegativeTest;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c2_Iframe {
    // open chrom
    // go to http://the-internet.herokuapp.com/iframe
    // switching by id or name attribute value
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void iframeTest(){
        // send"Hello world" to message box
        // switching by id or name attribute value
        // there are 3 ways to switch iframe;id/name, index and webElement


       driver.switchTo().frame("mce_0_ifr");
       WebElement frame = driver.findElement(By.id("tinymce"));
       frame.clear();
       frame.sendKeys("Hello world");

       // in order to do any action on mail HTML code we need to switch to main HTML.
        driver.switchTo().defaultContent();

        // in order to return to previous iframe
        //driver.switchTo().parentFrame();



    }


}
