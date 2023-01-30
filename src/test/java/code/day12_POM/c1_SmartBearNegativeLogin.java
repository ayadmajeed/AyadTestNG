package code.day12_POM;

import code.base.TestBase2;
import code.pages.SmartBearLoginPage;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_SmartBearNegativeLogin extends TestBase2 {
    @Test
    public void TC2_NegativeTest(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_URL"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("invalidUser"),PropertiesReadingUtil.getProperties("invalidPassword"));

        //verify that we get error message
        String actualErrorMessage = smartBearLoginPage.getStatusMessage();
        String expectedErrorMessage = "Invalid Login or Password.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"assertion failed, user was able to login");
    }

}
