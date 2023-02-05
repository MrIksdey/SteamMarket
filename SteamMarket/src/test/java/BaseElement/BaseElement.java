package BaseElement;

import BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

abstract class BaseElement {
    private By uniqueLocator;
    private String elementName;
    private ConditionalWait waits =new ConditionalWait();
    private WebDriver driver = Browser.getDriver();

    public BaseElement(By locator,String name){
        uniqueLocator = locator;
        elementName = name;
    }

    protected WebElement getElement() {
        return driver.findElement(uniqueLocator);
    }

    protected List<WebElement> getElements() {
        return driver.findElements(uniqueLocator);
    }


    public void click() {
        waits.waitForElementToBeVisible(uniqueLocator);
        waits.waitForElementToBeClickable(uniqueLocator);
        getElement().click();
    }

    public String getText() {
        waits.waitForElementToBeVisible(uniqueLocator);
        return getElement().getText();
    }



}
