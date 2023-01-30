package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        // open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // navigate back
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        // navigate amazon
        driver.navigate().to("https://amazon.com");
        // Verify that title contains "Smile"
        String actualTitle=driver.getTitle();
        String expectedTitle="less";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon title has passed");

        }else {
            System.out.println("Amazon title has failed");
        }
        System.out.println("Actual title is: " +driver.getTitle());
        driver.close();




    }
}
