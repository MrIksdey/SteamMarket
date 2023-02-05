package TestProject;

import BaseElement.Label;
import BaseForm.BasePage;
import org.openqa.selenium.By;

public class ItemPage extends BasePage {

    Label yourOferta = new Label(By.xpath("*//div[@id='tabContentsMyListings']//span[@class='market_listing_price']"),"Your oferta");
    Label biggestOferta = new Label(By.xpath("*//div[@id='market_commodity_buyrequests']//span[2]"),"Biggest oferta");
    Label nameOfItem = new Label(By.id("largeiteminfo_item_name"),"Name of item");


    public ItemPage() {
        super(By.id("largeiteminfo_item_name"), "Item page");
    }

    public String getTextYourOferta () {
        return yourOferta.getText();
    }
    public String getTextBiggestOferta () {
        return biggestOferta.getText();
    }

    public String getNameOfItem () {
        return nameOfItem.getText();
    }


}
