package code.day9_windowsAndTabs.day11_AlertndPractice;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2_Action extends TestBase2 {
    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double-click button
    //then accept the alert that pops up
    @Test
    public void TC1_doubleClick() throws InterruptedException {
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClick = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        Actions actions = new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClick).perform();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();
    }
    @Test
    public void TC2_rightClick() throws InterruptedException {
        //go to http://demo.guru99.com/test/simple_context_menu.html
        // right click to right-click button
        //then click on edit button
        //then accept the alert that pops up

        //go to http://demo.guru99.com/test/simple_context_menu.html
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        // right click to right-click button
        WebElement rightClick = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        Actions actions = new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClick).perform();
        Thread.sleep(5000);
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        //then accept the alert that pops up
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.StateWait(3);
        alert.accept();

    }
    @Test
    public void TC3_DragAndDrop(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        WebElement source = DriverUtil.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement target = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));
        Actions actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(source,target).build().perform();

        WebElement source2 = DriverUtil.getDriver().findElement(By.xpath("//a[.=' 5000']"));
        WebElement Target2 = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));
        actions.dragAndDrop(source2,Target2).build().perform();


        WebElement source4 = DriverUtil.getDriver().findElement(By.xpath("//a[.=' SALES ']"));
        WebElement target4 = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='loan']/li"));
        actions.dragAndDrop(source4,target4).build().perform();

        WebElement source5 = DriverUtil.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement target5 = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt8']/li"));
        actions.dragAndDrop(source5,target5).build().perform();




    }


    }
