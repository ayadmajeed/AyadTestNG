package code.pages;

import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeHomePage extends BasePage{
    @FindBy(xpath = "//button[.='Click me to start timer']")
    public WebElement clickButton;

    @FindBy(id = "demo")
    public WebElement DefaultText;

    @FindBy(xpath = "//p[.='WebDriver']")
    public WebElement webDriverText;

    public void clickTimerButton (){
        driverWait.until(ExpectedConditions.elementToBeClickable(clickButton)).click();
   }
   public void getDefaultText(){
       System.out.println("The default text is "+ DefaultText.getText());
   }
   public WebElement getWebDriverText(){
        driverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        return webDriverText;
   }

}
