package stepdefinition;

import Pages.Guru99Login;
import base.BasePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Guru99LoginSD {
    Guru99Login guru = new Guru99Login();

    @Given("^I am on Guru99Login page$")
    public void onLoginPage() {
        Assert.assertEquals(BasePage.get().getCurrentUrl(),"http://www.demo.guru99.com/V4/");
    }

    @When("^I enter (.+) into (username|password) field$")
    public void enterCredentials(String text, String fieldType) {
      switch (fieldType){
          case "username":
              guru.enterUserId(text);
              break;
          case "password":
              guru.enterPassword(text);
              break;
      }

    }


    @When("^I click on login button$")
    public void clickOnLoginBtn() {
        guru.clickOnLoginButton();

    }

    @Then("^I verify that login is successful$")
    public void i_verify_that_login_is_successful() {
        Assert.assertEquals(BasePage.get().getTitle(),"Guru99 Bank Manager HomePage");
    }


}
