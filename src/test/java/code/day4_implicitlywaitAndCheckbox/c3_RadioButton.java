package code.day4_implicitlywaitAndCheckbox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class c3_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        // navigate to https://courses.letskodeit.com/ptactice
        // click on BMW radio button
        // verify that is selected
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://courses.letskodeit.com/practice");
        WebElement radioButton = driver.findElement(By.id("bmwradio"));
        radioButton.click();
        if (radioButton.isSelected()){
            System.out.println("BMW selection has selected");
        }else {
            System.out.println("BMW selection has failed");
        }
        WebElement hondaSelection = driver.findElement(By.id("hondaradio"));
        if (!hondaSelection.isSelected()){
            System.out.println("Honda Verification has passed");
        }else {
            System.out.println("Honda verification has failed");
        }
        Thread.sleep(5000);
        driver.quit();


    }
}
