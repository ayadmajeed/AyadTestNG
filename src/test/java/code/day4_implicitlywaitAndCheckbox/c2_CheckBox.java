package code.day4_implicitlywaitAndCheckbox;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c2_CheckBox {
    public static void main(String[] args) throws InterruptedException {
        // open chrome
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // open website
        driver.get("https://demo.guru99.com/test/radio.html");
        // verify checkbox1 not selected
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        if (!checkBox1.isSelected()){
            System.out.println("Check box 1 is not selected, verfication has passed");
        }else {
            System.out.println("Check box 1 is not selected, verfication has failed");

        }
        // click checkbox 2
        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();
        if (checkBox2.isSelected()){
            System.out.println("Check verification has passed");
        }else {
            System.out.println("Check verification has failed");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
