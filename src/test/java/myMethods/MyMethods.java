package myMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class MyMethods {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
    private  Actions actions= new Actions(Driver.getDriver());

    public void clickFunction(WebElement element) {
        waitUntilClickableFunction(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisibleFunction(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisibleFunction(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickableFunction(WebElement element) {
        waitUntilVisibleFunction(element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void randomClick(List<WebElement> elementList) {
        clickFunction(elementList.get((int) (Math.random() + 1) * 19));
    }

    public void walkAround(WebElement element){
        moveToElement(element);
        actions.moveToElement(element).moveByOffset(80,0).build().perform();
        actions.moveToElement(element).moveByOffset(-80,0).build().perform();
        actions.moveToElement(element).moveByOffset(0,80).build().perform();
        actions.moveToElement(element).moveByOffset(0,-80).build().perform();
    }

    public void moveToElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
