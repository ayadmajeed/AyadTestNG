package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) {
    // setup driver
        WebDriverManager.chromedriver().setup();
    //  create a driver instance
        WebDriver driver = new ChromeDriver();
        // navigate to chrome driver
        driver.get("https://www.amazon.com/");
        // go to apple
        driver.get("https://www.apple.com");



    }
}
