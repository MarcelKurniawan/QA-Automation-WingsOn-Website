package WebAutomation.StepDefinition;
import WebAutomation.AutomationBase.BaseTest;
import WebAutomation.PageObjectModel.HomePage;
import WebAutomation.PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LogoutTest extends BaseTest{
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @And("user click the account button")
    public void userClickAccountButton() {
        homePage.clickAccountButton();
    }

    @When("user click the logout button")
    public void userClickOnLoginButton() {
        homePage.clickLogoutButton();
    }

    @And("user is able to see Alert popup : Apakah anda yakin ingin logout?")
    public void userAbleToSeeAlertPopup() {
        homePage.alertLogout();
    }
    @And("user click ok on the Alert popup")
    public void userClickOk() {
        homePage.acceptLogout();
    }

    @Then("user able to see login button")
    public void loginButtonDisplayed() {
        homePage.isLoginDisplayed();
    }

}