package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_GoogleTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Google Verification Title has passed");
        }else {
            System.out.println("Google Verification title has failed");
        }
        System.out.println("Actual title is: "+ driver.getTitle());
        driver.close();



    }
}
