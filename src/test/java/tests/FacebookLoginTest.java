package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FacebookLoginPage;
import utulities.TestBase;

public class FacebookLoginTest extends TestBase {
    @Test
        public void facebookTest() {
            Faker faker=new Faker();
            driver.get("https://www.facebook.com/");
            FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);
            facebookLoginPage.email.sendKeys(faker.internet().emailAddress());
            facebookLoginPage.password.sendKeys(faker.internet().password());
            facebookLoginPage.loginButton.click();
    }

}
