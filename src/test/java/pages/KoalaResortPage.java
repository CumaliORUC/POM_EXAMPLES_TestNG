package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoalaResortPage {
    //1 Create driver
    WebDriver driver;
    //2 create parameter which is driver constructor
        public KoalaResortPage(WebDriver driver) {
    //3 assign the driver to constructor driver
            this.driver=driver;
    // initialize driver with PageFactory
            PageFactory.initElements(driver,this);
        }
@FindBy (linkText ="Log in")
    public WebElement Login;

@FindBy (css="#UserName")
    public WebElement usurname;

@FindBy (css="#Password")
    public WebElement password;

@FindBy (css="#btnSubmit")
    public WebElement LoginButton;

@FindBy (css="button#details-button")
    public WebElement gelismis;

@FindBy (css="#proceed-link")
    public WebElement addressLink;

@FindBy (xpath = "//span[text()='Try again please']")
    public WebElement wrongLogin;
}