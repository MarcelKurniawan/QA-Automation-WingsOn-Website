package WebAutomation.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import WebAutomation.AutomationBase.BaseTest;
import org.testng.Assert;
import org.openqa.selenium.Alert;

public class ProfilePage extends BaseTest{

    By editButton = By.cssSelector("button.flex.items-center.gap-2");
    By headingsProfile = By.cssSelector("h1.text-xl");
    By headingsPass = By.cssSelector("h1.mb-8");
    By inputName = By.cssSelector("input#fullName");
    By chooseGender = By.cssSelector("select#gender");
    By inputNoHP = By.cssSelector("input#noHp");
    By sendButton = By.cssSelector("button.flex.items-center.gap-2");
    By currentPassword = By.id("currentPassword");
    By newPassword = By.id("newPassword");
    By confirmPassword = By.id("confirmPassword");

    public void isProfileDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(headingsProfile));
    }

    public void isHeadingPassDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(headingsPass));
    }

    public void clickEditButton() {
        driver.findElement(editButton).click();
    }

    public void enterName(String fullName) {
        driver.findElement(inputName).clear();
        driver.findElement(inputName).sendKeys(fullName);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(inputNoHP).clear();;
        driver.findElement(inputNoHP).sendKeys(phoneNumber);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void inputPasswords(String currPass, String newPass, String confPass) {
        driver.findElement(currentPassword).sendKeys(currPass);
        driver.findElement(newPassword).sendKeys(newPass);
        driver.findElement(confirmPassword).sendKeys(confPass);
    }


}
