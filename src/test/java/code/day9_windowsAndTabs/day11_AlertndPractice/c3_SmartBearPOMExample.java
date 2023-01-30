package code.day9_windowsAndTabs.day11_AlertndPractice;

import code.base.TestBase2;
import code.pages.SmartBearLoginPage;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c3_SmartBearPOMExample extends TestBase2 {
    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_URL"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),PropertiesReadingUtil.getProperties("SmartBer_password"));

    }
}
