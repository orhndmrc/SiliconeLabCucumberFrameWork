package Pages;

import Utils.ElementUtil;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99LoginPage extends ElementUtil {
    //locators
    By userID = By.name("uid");
    By pass = By.name("password");
    By loginBtn = By.name("btnLogin");
    By title = By.xpath("//title[contains(text(),'Guru99 Bank')]");


    //actions
    public void enterUserID(String text){
        sendValue(userID,text);
    }

    public void enterPassword(String text){
        sendValue(pass,text);
    }
    public void clickOnLoginBtn(){
        clickOn(loginBtn);
    }
    public void waitForTitle(){
        WebDriverWait wait = new WebDriverWait(BasePage.get(),20);
        wait.until(ExpectedConditions.presenceOfElementLocated(title));
    }

}
