package code.day9_windowsAndTabs;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c1_Tabs extends TestBase {
    // oop concept, inheritance method
    // navigate to https://renas-practice.herokuapp.com/home
    //click Element
    // click windows
    // click on new tab "click me" button
    @Test
    public void TC1_handlingTabs() {
        driver.get("https://renas-practice.herokuapp.com/home");
        WebElement clickElement = driver.findElement(By.id("selenium-Elements"));
        clickElement.click();

        WebElement clickWindows = driver.findElement(By.id("WindowsII"));
        clickWindows.click();

        String currentWindows = driver.getWindowHandle();
        String currentTitle = driver.getTitle();
        System.out.println("current window is= "+ currentWindows);
        System.out.println(" current Title is= "+ currentTitle);

        WebElement ClickNewTabButton = driver.findElement(By.id("open-tab"));
        ClickNewTabButton.click();
        System.out.println("The current title "+ driver.getTitle());

        // to store all tabs
        Set<String> allTabs = driver.getWindowHandles();
        for (String tabs: allTabs){
            driver.switchTo().window(tabs);
            System.out.println("the current title is= "+ driver.getTitle());
        }
    }
}
