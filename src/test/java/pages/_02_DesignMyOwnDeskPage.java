package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class _02_DesignMyOwnDeskPage {

    public _02_DesignMyOwnDeskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Design your own desk']")
    private WebElement designYourOwnDesk;

    @FindBy(css = "iframe[class='planner-iframe']")
    private WebElement frame;

    @FindBy(xpath = "(//img[@class='swiper-slide-image'])[13]")
    private WebElement topOfTheDesk;

    @FindBy(css = "i[class='byox-configuration-menu-icons menu-icons-tops']")
    private WebElement dimensions;

    @FindBy(css = "i[title='Large']")
    private WebElement dimensionsLarge;

    @FindBy(css = "i[class='byox-configuration-menu-icons menu-icons-bottoms']")
    private WebElement legs;

    @FindBy(css = "i[title='Trestles']")
    private WebElement trestles;

    @FindBy(xpath = "(//img[@class='swiper-slide-image'])[9]")
    private WebElement trestlesThird;


     /*
    -------------------------   GETTERS    --------------------------------
     */

    public WebElement getDesignYourOwnDesk() {
        return designYourOwnDesk;
    }

    public WebElement getFrame() {
        return frame;
    }

    public WebElement getTopOfTheDesk() {
        return topOfTheDesk;
    }

    public WebElement getDimensions() {
        return dimensions;
    }

    public WebElement getDimensionsLarge() {
        return dimensionsLarge;
    }

    public WebElement getLegs() {
        return legs;
    }

    public WebElement getTrestles() {
        return trestles;
    }

    public WebElement getTrestlesThird() {
        return trestlesThird;
    }
}
