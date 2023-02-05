package TestProject;

import BaseElement.Button;
import BaseElement.Label;
import BaseForm.BasePage;
import org.openqa.selenium.By;

public class MarketPage extends BasePage {

    Button loginButton = new Button(By.xpath("//*[contains(text(), 'login')]"), "Login button");
    Label oferty = new Label(By.className("market_listing_item_name_link"),"Oferty");

    public MarketPage() {
        super(By.className("market_title_text"), "Market page");
    }

    public void clickOferty(int i){
        oferty.getElementsLabel().get(i).click();
    }

    public int getOfertySize(){
        return oferty.getElementsLabel().size();
    }



}
