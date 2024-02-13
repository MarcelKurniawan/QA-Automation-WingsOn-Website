package WebAutomation.PageObjectModel;

import WebAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NotificationPage extends BaseTest {

        By notificationButton = By.id("notifikasi");
        By statusNotification = By.cssSelector("section.font-semibold");

        public void clickNotification() {
            driver.findElement(notificationButton).click();
        }
        public void checkNotification(){
            wait.until(ExpectedConditions.textToBePresentInElementLocated(statusNotification, "Pembayaran Berhasil"));
        }


}
