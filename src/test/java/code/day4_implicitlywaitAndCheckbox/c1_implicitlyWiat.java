package code.day4_implicitlywaitAndCheckbox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c1_implicitlyWiat {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        // it is going to wait a specific time until the page loaded
        // as soon as page loaded it will move on next step
        // if this was thread.sleep no matter it will wait for 20 seconds
        // implicit wait will back all code block where we use it
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement attendBottom = driver.findElement(By.xpath("//a[@href='/attend/']"));
        attendBottom.click();


    }

}
