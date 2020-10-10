package stepdefinition;

import Pages.Guru99LoginPage;
import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Guru99LoginSD {
    Guru99LoginPage guru = new Guru99LoginPage();

    @Given("^I am on Guru99LoginPage$")
    public void onLoginPage() {
        Assert.assertEquals(BasePage.get().getCurrentUrl(),"http://www.demo.guru99.com/V4/");
    }

    @When("^I enter (.+) into (username|password) section$")
    public void enterUsernameAndPassword(String text, String textField) {
        switch (textField){
            case "username":
                guru.enterUserID(text);
                break;
            case "password":
                guru.enterPassword(text);
                break;
        }

    }

    @And("^I click on login button$")
    public void clickOnLoginButton() {
         guru.clickOnLoginBtn();

    }

    @Then("^I verify the title of HomePage$")
    public void verifyTitle() throws InterruptedException {
        guru.waitForTitle();
        Assert.assertEquals(BasePage.get().getTitle(),"Guru99 Bank Manager HomePage");

    }
}
