package code.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c1_LocatorPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://apple.com");
        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();
        // child to parent
        //driver.findElement(By.xpath("//span[.='iPhone']/..")).click();
        // parent to child
        //driver.findElement(By.xpath("ul[@class='ac-gn-list']//following::li[5]"));
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int linkwithouttext=0;
        int linkwithtext=0;
        for (WebElement eachLink:allLinks) {
            String elementToText= eachLink.getText();

            System.out.println(elementToText);

            if(elementToText.isEmpty()) {
                linkwithtext++;
            }else {
                linkwithouttext++;
            }

        }
        System.out.println("link with text" + linkwithtext);
        System.out.println("link without text" + linkwithouttext);
        System.out.println("count list" + allLinks.size());




    }

}
