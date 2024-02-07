package WebAutomation.StepDefinition;

import WebAutomation.AutomationBase.BaseTest;
import WebAutomation.PageObjectModel.HomePage;
import WebAutomation.PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    public LoginTest() {
    }

    @And("user go to login page")
    public void userGoToLoginPage() {
        homePage.clickLoginButton();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.enterEmail(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.enterPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.isBannerDisplayed();
    }

    @Then("user is able to see error message")
    public void getErrorMesaage() {
        loginPage.isErrorDisplayed();
    }

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.isBannerDisplayed();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        homePage.isLoginDisplayed();
    }
}
