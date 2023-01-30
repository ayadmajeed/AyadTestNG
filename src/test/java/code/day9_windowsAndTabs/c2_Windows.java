package code.day9_windowsAndTabs;

import code.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c2_Windows  extends TestBase {

    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        WebElement clickElement = driver.findElement(By.id("selenium-Elements"));
        clickElement.click();

        WebElement clickWindows = driver.findElement(By.id("WindowsII"));
        clickWindows.click();

        String currentWindows = driver.getWindowHandle();
        String currentTitle = driver.getTitle();
        System.out.println("current window is= "+ currentWindows);
        System.out.println(" current Title is= "+ currentTitle);

        WebElement openWindows = driver.findElement(By.id("open-window"));
        openWindows.click();
        // in order to work on second windows
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>();
        for (String NewWindow: allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("The current Title is = "+driver.getTitle());
        }
        // another method to switch windows
        driver.switchTo().window(windowList.get(0));
        System.out.println("the current title is =" + driver.getTitle());



    }
}