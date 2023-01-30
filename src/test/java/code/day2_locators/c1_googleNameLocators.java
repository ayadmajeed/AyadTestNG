package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_googleNameLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("orange");
        Thread.sleep(4000);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "orange";
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("orange title verification has passed");
        }else {
            System.out.println("orane verification title has failed");
        }

        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("banana");
        Thread.sleep(4000);
        WebElement searchButton1 = driver.findElement(By.name("btnK"));
        searchButton1.click();

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "banana";
        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("banana verification title haas passed");
        }else {
            System.out.println("banana verification has failed");
        }
        driver.quit();

    }
}
