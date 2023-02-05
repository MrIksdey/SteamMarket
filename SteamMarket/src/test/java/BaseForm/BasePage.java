package BaseForm;

import BaseElement.ConditionalWait;
import BaseElement.Log;
import org.openqa.selenium.By;



public abstract class BasePage {
    private By uniqueFormLocator;
    private String formName;
    private ConditionalWait wait = new ConditionalWait();

    public BasePage(By locator, String name){
        uniqueFormLocator = locator;
        formName = name;
    }

    public boolean isPageOpen(){
        wait.waitForElementToBeVisible(uniqueFormLocator);
        return true;
    }

    public String getPageLabel() {
        String label = uniqueFormLocator.toString()+" " + formName + " unique locator";
        return label;
    }


}
