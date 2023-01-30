package code.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement gmailButton = driver.findElement(By.xpath("//a[@class='gb_m']"));
        System.out.println("Gmail button text is "+ gmailButton.getText());
        System.out.println("gmail button, href attribute value= "+gmailButton.getAttribute("href"));
    }
}
