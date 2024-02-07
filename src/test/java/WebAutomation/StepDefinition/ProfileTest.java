package WebAutomation.StepDefinition;
import WebAutomation.AutomationBase.BaseTest;
import WebAutomation.PageObjectModel.HomePage;
import WebAutomation.PageObjectModel.LoginPage;
import WebAutomation.PageObjectModel.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ProfileTest extends BaseTest{
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    @When("user click profile button")
    public void userGoToAccountPage() {
        homePage.clickAccountButton();
        homePage.clickProfileButton();
    }

    @And("user click edit profile button")
    public void userClickEditButton() {
        profilePage.clickEditButton();
    }

    @And("user fill fullname with {string}")
    public void userInputFullnameWith(String username) {
        profilePage.enterName(username);
    }

    @And("user fill number phone with {string}")
    public void userInputPhoneNumberWith(String password) {
        profilePage.enterPhoneNumber(password);
    }

    @And("user click send button")
    public void userClickSendButton() {
        profilePage.clickSendButton();
    }

    @Then("user profile should be updated")
    public void userProfileUpdated() {
        profilePage.isProfileDisplayed();
    }
}
