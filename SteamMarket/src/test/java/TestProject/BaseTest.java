package TestProject;

import BaseElement.Log;
import BrowserFactory.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUpEnvironment()
    {
        Browser.createInstance();
        Log.info("Setting up environment");
        Browser.goToUrl("https://steamcommunity.com/login/home/?goto=market%2F");
    }


    @AfterMethod
    public void after () {
        Log.info("Quiting browser");
        Browser.quitBrowser();
    }
}