package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utulities.ConfigReader;
import utulities.TestBase;

/*
    positiveLoginTest()
    http://qa-environment.koalaresorthotels.com
    Click to login
    username: manager ,
    password : Manager1!
    Test the Log in is Success
 */
public class KoalaResortPositiveTest extends TestBase {

    @Test
        public void positiveTest() {
            driver.get("https://qa-environment.koalaresorthotels.com/");
                KoalaResortPage koalaResortPage=new KoalaResortPage(driver);
                koalaResortPage.gelismis.click();       //For Security Page
                koalaResortPage.addressLink.click();    //For Security Page
                koalaResortPage.Login.click();
                koalaResortPage.usurname.sendKeys(ConfigReader.getproperty("kr_valid_username"));
                koalaResortPage.password.sendKeys(ConfigReader.getproperty("kr_valid_password"));
                koalaResortPage.LoginButton.click();

            String expectedTitle="Admin";
            String actualTitle= driver.getTitle();
                Assert.assertTrue(actualTitle.contains(expectedTitle));
            System.out.println("Loggin Success");
    }
    @Test
        public void negativeTest() {
            driver.get("https://qa-environment.koalaresorthotels.com/");
            KoalaResortPage koalaResortPage=new KoalaResortPage(driver);
            koalaResortPage.gelismis.click();       //For Security Page
            koalaResortPage.addressLink.click();    //For Security Page
            koalaResortPage.Login.click();
            koalaResortPage.usurname.sendKeys(ConfigReader.getproperty("kr_wrongusername"));
            koalaResortPage.password.sendKeys(ConfigReader.getproperty("kr_wrongPassword"));
            koalaResortPage.LoginButton.click();
                Assert.assertTrue(koalaResortPage.wrongLogin.isDisplayed());

    }
    }

