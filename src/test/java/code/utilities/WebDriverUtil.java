package code.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {
    // create autil that get abrowser and creat an action bitween browser and selenium
    // WebDriverUtil will set Up the browser for us

    public static WebDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            // Chrome browser needs to be setup
            WebDriverManager.chromedriver().setup();
            return  new ChromeDriver();
        }else if (browser.equalsIgnoreCase("fairfox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Browser tha you provide is not exist");
            System.out.println("browser that provided= "+ browser);
            return null;
        }
    }

}
