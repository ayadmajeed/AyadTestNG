package code.day12_POM;

import code.base.TestBase2;
import code.pages.SeleniumPracticeHomePage;
import code.pages.SmartBearLoginPage;
import code.utilities.DriverUtil;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_explicitlyWaitExample extends TestBase2 {
    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    // click on timer
     // verify "WebDriver" text present

    @Test
    public void explicitlyWaitWithPOM(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage = new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        // verify that webDriver text present
        String actualText = seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(actualText,"WebDriver", "WebDriver verification has failed");
    }
}
