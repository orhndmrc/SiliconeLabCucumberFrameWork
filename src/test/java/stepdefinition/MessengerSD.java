package stepdefinition;

import base.BasePage;
import io.cucumber.java.en.*;
import org.testng.Assert;
import Pages.MessengerPage;

public class MessengerSD {
    private MessengerPage messengerPage = new MessengerPage();

    @Given("^I am on messenger page$")
    public void setMessengerPage(){
        messengerPage.clickOnMessenger();
        Assert.assertEquals(BasePage.get().getCurrentUrl(),"https://www.messenger.com/");
    }
    @When("^I enter (.+) into (username|password) field on the messenger page$")
    public void enterDataIntoTextField(String value, String textField){
        switch(textField){
            case "username":
                messengerPage.enterEmail(value);
                break;
            case "password":
                messengerPage.enterPassword(value);
        }
    }
    @And("^I click on login button on messenger page$")
    public void clickOnLoginButton(){
        messengerPage.clickOnSignInButton();
    }
    @Then("^I verify invalid login on sign in page$")
    public void verifySignInErrorMessage(){
        Assert.assertEquals(messengerPage.getErrorMessage(),"Incorrect Email");
    }
}
