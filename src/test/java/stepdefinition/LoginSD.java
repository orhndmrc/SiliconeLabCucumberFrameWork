package stepdefinition;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Pages.LoginPage;

public class LoginSD {
    private LoginPage loginPage = new LoginPage();

    @Given("^I am on LoginPage$")
    public void onHomePage(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(),"https://www.facebook.com/");
    }
    @When("^I enter (.+) into (username|password) text field on home screen$")
    public void enterDataUserandPassField(String text, String textField) {
        switch (textField) {
            case "username":
                loginPage.enterEmail(text);
                break;
            case "password":
                loginPage.enterPassword(text);

        }
    }
    @And("^I click on login button on home screen$")
    public void clickOnButton(){
            loginPage.clickOnLoginButton();
        }
        @Then("^I verify that I am on invalid login page$")
    public void invalidLoginVerify(){

        Assert.assertEquals(loginPage.getErrorMessage(),"Log Into Facebook");
        }


}
