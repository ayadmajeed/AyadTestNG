package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_idLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
        id.sendKeys("NikeShoes");
        WebElement clicksearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        clicksearch.click();
    }
}
