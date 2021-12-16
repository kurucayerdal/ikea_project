package test;

import myMethods.MyMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages._02_DesignMyOwnDeskPage;
import utilities.Driver;

import java.time.Duration;

public class TC_02_IkeaDesignMyOwnDeskPage extends MyMethods {

    private WebDriver driver;
    private final _02_DesignMyOwnDeskPage designMyOwnDeskPage = new _02_DesignMyOwnDeskPage();

    @BeforeClass
    public void beforeClass() {
        driver = Driver.getDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ikea.com/us/en/planners/");
    }

    @AfterClass
    public void afterClass() {
        Driver.quitDriver();
    }

    @Test
    public void designMyOwnDesk() {

        clickFunction(designMyOwnDeskPage.getDesignYourOwnDesk());
        driver.switchTo().frame(designMyOwnDeskPage.getFrame());
        clickFunction(designMyOwnDeskPage.getTopOfTheDesk());
        clickFunction(designMyOwnDeskPage.getDimensions());
        clickFunction(designMyOwnDeskPage.getDimensionsLarge());
        clickFunction(designMyOwnDeskPage.getLegs());
        clickFunction(designMyOwnDeskPage.getTrestles());
        clickFunction(designMyOwnDeskPage.getTrestlesThird());
    }

}
