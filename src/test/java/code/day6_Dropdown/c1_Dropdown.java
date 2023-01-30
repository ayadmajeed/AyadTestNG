package code.day6_Dropdown;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_Dropdown {
    WebDriver driver;
    // open Chrome browser
    // go to https://www.the-internet.herokuapp.com/
    // click on dropdown
    /// confirm default selected dropdown is " please select an option
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");

    }
    @Test
    public void TC1_DropDown(){
        // click on dropdown
        WebElement dropDown = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        dropDown.click();
        // confirm default selected dropdown is " please select an option
        //WebElement DropDownBox = driver.findElement(By.id("dropdown"));
        Select DropDownOption = new Select(driver.findElement(By.id("dropdown")));
        String actualOption = DropDownOption.getFirstSelectedOption().getText();
        String expectedOption = "Please select an option";
        Assert.assertEquals(actualOption,expectedOption,"Dropdown verification has failed");

    }
    @Test
    public void TC2_VerifyOptionFromDropDown() throws InterruptedException {

        // click on dropdown
        // chose option 2 from dropdown
        // chose option 1 from dropdown
        // chose option 2 from drop down
        // click on dropdown
        WebElement dropDown = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        dropDown.click();

        // chose option 1 from dropdown
        // select dropdown is created by using (Select) tageName in HTML
        Select DropDownOption = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(4000);
        DropDownOption.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        // chose option 1 from dropdown
        DropDownOption.selectByValue("1");
        Thread.sleep(3000);
        DropDownOption.selectByIndex(2);

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
