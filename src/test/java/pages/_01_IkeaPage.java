package pages;

import myMethods.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class _01_IkeaPage {

    public _01_IkeaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement btnAcceptCookies;

    @FindBy(css = "a[data-cy='go-to-website']")
    private WebElement btnGoToWebsite;

    @FindBy(css = "button[class='selected svelte-xiw4pw']")
    private WebElement btnOtherIkeaWebsites;

    @FindBy(xpath = "(//button[@data-cy='select-region'])[1]")
    private WebElement ddIkeaFirstWebsite;

    @FindBy(id = "search-sites")
    private WebElement inputSearch;




    /*
    -------------------------   GETTERS    --------------------------------
     */

    public WebElement getBtnAcceptCookies() {
        return btnAcceptCookies;
    }

    public WebElement getBtnOtherIkeaWebsites() {
        return btnOtherIkeaWebsites;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getDdIkeaFirstWebsite() {
        return ddIkeaFirstWebsite;
    }

    public WebElement getBtnGoToWebsite() {
        return btnGoToWebsite;
    }


}
