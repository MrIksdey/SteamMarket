package TestProject;

import BaseElement.Log;
import BrowserFactory.Browser;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SteamMarketCheckPrice extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void alerts() {
        SignInPage signInPage = new SignInPage();

        signInPage.sendUsernameKeys("login");
        signInPage.sendPasswordKeys("password");
        signInPage.clickSignInButton();

        MarketPage marketPage = new MarketPage();

        marketPage.isPageOpen();

        // petla. (get>click>>newpage>soft assert>click market>new marketpage )

        for (int i = 0; i<marketPage.getOfertySize(); i++) {
            marketPage.clickOferty(i);

            ItemPage itemPage =new ItemPage();
            itemPage.isPageOpen();

            String a = itemPage.getTextYourOferta();
            String b = itemPage.getTextBiggestOferta();
            softAssert.assertEquals(a,b, Browser.getCurrentUrl() +" "+ itemPage.getNameOfItem());

            Browser.goToUrl("https://steamcommunity.com/market/");
            marketPage = new MarketPage();
        }
        softAssert.assertAll();
    }
}
