package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }



    protected boolean isElementpresent (WebElement element) throws Exception
    {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }


    protected boolean isListpresent (List<WebElement> elements) throws Exception
    {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            return (elements.size() > 0);
         }
        catch (Exception e)
        {
            return false;
        }
    }

    protected void scrollToWebElement(WebElement webElement) throws Exception {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected boolean clickonElement(WebElement element) throws Exception
    {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            scrollToWebElement(element);
            element.click();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    protected boolean enterText(WebElement element,String text) throws Exception {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            scrollToWebElement(element);
            element.clear();
            element.sendKeys(text);
            element.sendKeys(Keys.ENTER);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
