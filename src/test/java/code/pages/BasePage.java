package code.pages;

import code.utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(20));
    /*IN POM Design you need to have some structure for each page :
            1.PageFactory.initElements(driver, this);
            -> It creates connection in between driver and object of the class.
            2. @FindBy annotation to locate webElements.
            -> Using this FindBy annotation, help us to locate web elements.
            3. Create methods related web-elements
     */

    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

}
