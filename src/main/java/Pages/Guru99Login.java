package Pages;

import Utils.ElementUtil;
import org.openqa.selenium.By;

public class Guru99Login extends ElementUtil {
    //locators
    By userID = By.name("uid");
    By password = By.name("password");
    By loginBtn = By.name("btnLogin");

    //actions
    public void enterUserId(String text){
        sendValue(userID,text);
    }
    public void enterPassword(String text){
        sendValue(password,text);
    }
    public void clickOnLoginButton(){
        clickOn(loginBtn);
    }

}
