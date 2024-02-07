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

public class HomePage extends BaseTest{
    By bannerHome = By.cssSelector(".container");
    By loginButton = By.cssSelector("a.pl-4");
    By accountButton = By.id("headlessui-menu-button-:r0:");
    By profileButton = By.id("headlessui-menu-item-:r2:");
    By changePassButton = By.id("headlessui-menu-item-:r3:");
    By logoutButton = By.cssSelector("span.block");

    public void isBannerDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(bannerHome));
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickAccountButton() {
        driver.findElement(accountButton).click();
    }

    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
    public void clickChangePassButton() {
        driver.findElement(changePassButton).click();
    }
    public void isLoginDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void alertMessages() {
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(alertMessage == alertMessage);
    }

    public void acceptLogout() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
