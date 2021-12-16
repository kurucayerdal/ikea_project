package pages;

import myMethods.MyMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class _03_SnapDealPage extends MyMethods {

    private WebDriver driver;

    public _03_SnapDealPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Search products & brands']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[contains(@class,'searchformButton')]")
    private WebElement btnSearch;

    @FindBy(css = ".picture-elem")
    private List<WebElement> watchList;

    @FindBy(css = "#adroll_allow_all")
    private WebElement allowCookies;

    @FindBy(css = "#bx-slider-left-image-panel>li>img")
    private WebElement mainWatchPic;

    @FindBy(css = "div[class='cloudzoom-zoom']")
    private WebElement zoomedWatchPic;


    @Test
    public void SnapDealTest() {

        driver = Driver.getDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");

        String pageId = driver.getCurrentUrl();
        sendKeysFunction(inputSearch, "Casio Watch");
        clickFunction(btnSearch);
        randomClick(watchList);

        Set<String> pageIds = driver.getWindowHandles();

        for (String s : pageIds) {
            if (s != pageId) {
                driver.switchTo().window(s);
            }
        }
        clickFunction(allowCookies);
        walkAround(mainWatchPic);
        Assert.assertTrue(zoomedWatchPic.isDisplayed());
        Driver.quitDriver();
    }
}
