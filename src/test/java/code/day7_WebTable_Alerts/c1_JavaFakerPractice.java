package code.day7_WebTable_Alerts;

import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
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

public class c1_JavaFakerPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUP(){
        // open a Chrome browser
        // go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // login
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearLoginUtils.loginForSmartBear(driver);

    }
    @AfterMethod
    public void closing() throws InterruptedException {
       Thread.sleep(4000);
       driver.close();
    }
    @Test
    public void TC1_Order() throws InterruptedException {
        // click on order
        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();
        // select familyAlbum from product, set quantity 5
        Select familyAlbum = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        familyAlbum.selectByVisibleText("FamilyAlbum");
        //click on calculate button
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();
        quantity.sendKeys("5");
        // fill adress, city, zipcode, state with JavaFaker
        driver.findElement(By.xpath("//input[@class='btn_dark']")).click();
        Faker faker = new Faker();
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerName.sendKeys(faker.name().fullName());

        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetName());

        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());

        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().streetName());

        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zip.sendKeys(faker.address().zipCode().replaceAll("-" , ""));

        // click on visa radio button
        WebElement visaButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        // generate card number by using Java Faker
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-" , ""));
        // generate expiry by using Java Faker
        WebElement expire = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expire.sendKeys("09/23");

        // click on "process"
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        // verify sucess message " New order has been successfuly
        WebElement successMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertEquals(successMessage.getText(),"New order has been successfully added.");


    }
}
