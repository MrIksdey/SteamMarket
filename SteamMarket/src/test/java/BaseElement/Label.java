package BaseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Label extends BaseElement{

    public Label(By locator, String name) {
        super(locator, name);
    }

    public List<WebElement> getElementsLabel() {
        return getElements();
    }
}
