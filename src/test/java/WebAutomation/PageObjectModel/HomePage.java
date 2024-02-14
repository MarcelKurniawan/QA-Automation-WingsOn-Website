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

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseTest{
    public static void waitFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    By bannerHome = By.cssSelector("div.w-full");
    By loginButton = By.cssSelector("a.pl-4");
    By accountButton = By.xpath("/html/body/div/div/div[1]/nav/div/div");
    By profileButton = By.id("headlessui-menu-item-:r5:");
    By changePassButton = By.id("headlessui-menu-item-:r6:");
    By logoutButton = By.cssSelector("span.cursor-pointer");
    By alertLogout = By.cssSelector("div.px-6");
    By acceptLogout = By.id("navLogoutYa");

    public void isBannerDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(bannerHome));
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickAccountButton() {
        driver.findElement(accountButton).click();
        waitFor(2);
    }

    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
    public void clickChangePassButton() {
        driver.findElement(changePassButton).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
        waitFor(2);
    }
   public void isLoginDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void alertLogout() {
        wait.until(ExpectedConditions.presenceOfElementLocated(alertLogout));
    }

    public void acceptLogout() {
        driver.findElement(acceptLogout).click();
    }

}
