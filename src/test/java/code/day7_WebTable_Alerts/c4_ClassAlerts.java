package code.day7_WebTable_Alerts;

import code.utilities.SmartBearLoginUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_ClassAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");


    }

    @Test
    public void AlertPractice() throws InterruptedException {
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();
        // click on first alert
        WebElement firstAlert = driver.findElement(By.id("alert-demo"));
        firstAlert.click();
        Thread.sleep(3000);
        // handle alert , switch to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
