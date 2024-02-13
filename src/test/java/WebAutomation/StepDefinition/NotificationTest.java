package WebAutomation.StepDefinition;

import WebAutomation.AutomationBase.BaseTest;
import WebAutomation.PageObjectModel.HomePage;
import WebAutomation.PageObjectModel.LoginPage;
import WebAutomation.PageObjectModel.NotificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NotificationTest extends BaseTest{
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        NotificationPage notificationPage = new NotificationPage();

        @When("user click notification button")
        public void userClickNotificationButton() {
            notificationPage.clickNotification();
        }

        @Then("user is on notification page")
        public void userIsOnNotificationPage() {
            notificationPage.checkNotification();
        }


}
