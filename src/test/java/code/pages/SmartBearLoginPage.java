package code.pages;

import code.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement passwordBox;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;

    public void loginSmartBear(String username, String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
    public String getStatusMessage(){
        return statusMessage.getText();

    }

}
