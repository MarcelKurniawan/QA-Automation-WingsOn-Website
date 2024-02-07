package WebAutomation.StepDefinition;

import WebAutomation.AutomationBase.BaseTest;
import WebAutomation.PageObjectModel.HomePage;
import WebAutomation.PageObjectModel.LoginPage;
import WebAutomation.PageObjectModel.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    @When("user click the accounts button")
    public void userClickAccountsButton() {
        homePage.clickAccountButton();
    }

    @And("user click change password button")
    public void userClickChangePassButton() {
        homePage.clickChangePassButton();
    }

    @And("user fill password form with {string}, {string}, {string}")
    public void userInputPassword(String currPass, String newPass,String confPass) {
        profilePage.inputPasswords(currPass, newPass, confPass);

    }
    @Then("user password should be updated")
    public void userPassUpdated() {
        profilePage.isHeadingPassDisplayed();
    }
}
