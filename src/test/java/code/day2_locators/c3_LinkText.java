package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_LinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        // click to gmail on the top right
        // inorder to find linktext
        //WebElement linkText = driver.findElement(By.linkText("Gmail"));
        //linkText.click();

        // inorder  to find partial linktext
        //WebElement partialLinkText = driver.findElement(By.partialLinkText("Gm"));
        //partialLinkText.click();

        // find element by className
        WebElement className = driver.findElement(By.className("gb_m"));
        className.click();

    }
}
