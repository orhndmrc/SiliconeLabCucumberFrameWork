package Pages;

import Utils.ElementUtil;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MessengerPage extends ElementUtil {
    private By messengerLink = By.linkText("Messenger");
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By signInBtn = By.id("loginbutton");
    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect Email')]");

    public void clickOnMessenger(){
        clickOn(messengerLink);
    }
    public void enterEmail(String email){
        sendValue(emailField,email);
    }
    public void enterPassword(String password){
        sendValue(passwordField,password);
    }
    public void clickOnSignInButton(){
        clickOn(signInBtn);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
