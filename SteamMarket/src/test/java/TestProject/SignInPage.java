package TestProject;

import BaseElement.Button;
import BaseElement.TextBox;
import BaseForm.BasePage;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    TextBox username = new TextBox(By.xpath("//input[@type='text']"),"Username box");
    TextBox password = new TextBox(By.xpath("//input[@type='password']"),"Password box");
    Button signInButton = new Button(By.className("newlogindialog_SubmitButton_2QgFE"),"Sign in button");

    public SignInPage() {
        super(By.id("loginModals"), "Sign in page");
    }

    public void sendUsernameKeys (String login){
        username.sendKeys(login);
    }

    public void sendPasswordKeys (String password1){
        password.sendKeys(password1);
    }

    public void clickSignInButton () {
        signInButton.click();
    }

}
