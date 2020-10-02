package Pages;

import Utils.ElementUtil;
import org.openqa.selenium.By;

public class LoginPage extends ElementUtil {
    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("pass");
    private By loginButton = By.id("u_0_b");
    private By errorMessage = By.xpath("//*[text()='Log Into Facebook']");

    public void enterEmail(String enterEmail){
        sendValue(emailTextField,enterEmail);
    }

    public void enterPassword(String enterPassword){
        sendValue(passwordTextField,enterPassword);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}

