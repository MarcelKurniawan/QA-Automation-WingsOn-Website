package WebAutomation.PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import WebAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class LoginPage extends BaseTest{

    By emailField = By.id("email");
    By passwordField = By.id("password");

    By loginButton = By.cssSelector("button.flex");
    By errorMessage = By.id("headlessui-portal-root");


    public void enterEmail(String emails) {
        driver.findElement(emailField).sendKeys(emails);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void isErrorDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage));
    }




}
