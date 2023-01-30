package code.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        //WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        //searchBox.sendKeys("wallet");
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("flower");
    }
}
