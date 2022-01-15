package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
    WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (css="#email")
    public WebElement email;

    @FindBy(css="#pass")
    public WebElement password;

    @FindBy (xpath = "//button[@value='1']")
    public  WebElement loginButton;
}
