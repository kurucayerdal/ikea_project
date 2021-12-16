package test;

import myMethods.MyMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages._01_IkeaPage;
import utilities.Driver;

import java.time.Duration;


public class TC_01_IkeaPage extends MyMethods {

    private WebDriver driver;
    private final _01_IkeaPage ikeaPage = new _01_IkeaPage();

    @BeforeClass
    public void beforeClass() {
        driver = Driver.getDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ikea.com");
    }

    @AfterClass
    public void afterClass() {
        Driver.quitDriver();
    }

    @Test
    public void TC_01() {

        chooseWebsiteIkea("france");
    }

    public void chooseWebsiteIkea(String countryName) {

        clickFunction(ikeaPage.getBtnAcceptCookies());
        clickFunction(ikeaPage.getBtnOtherIkeaWebsites());
        sendKeysFunction(ikeaPage.getInputSearch(), countryName);
        clickFunction(ikeaPage.getDdIkeaFirstWebsite());
        clickFunction(ikeaPage.getBtnGoToWebsite());
        clickFunction(ikeaPage.getBtnAcceptCookies());
    }
}
