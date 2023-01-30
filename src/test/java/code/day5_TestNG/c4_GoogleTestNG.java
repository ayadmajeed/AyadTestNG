package code.day5_TestNG;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_GoogleTestNG {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // go to google home page
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }

    // verify google title
    // Search for red wine
    @Test
    public void TC1_GoogleTitleVerification() {
        WebElement reWine = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        reWine.sendKeys("red wine", Keys.ENTER);
        // WebElement clickSearch = driver.findElement(By.xpath("//input[@name='btnK']"));
       // clickSearch.click();
        // Verify that title contains wine
        String actualTitle = driver.getTitle();
        String expectedTitle = "wine";
        boolean googleTitle = actualTitle.contains(expectedTitle);
        Assert.assertTrue(googleTitle, "assertion is failed, title does not contains wine");





    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }


}
