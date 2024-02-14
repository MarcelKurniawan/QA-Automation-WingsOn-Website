package WebAutomation.PageObjectModel;
import WebAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class SearchPage extends BaseTest{
    By inputDep = By.cssSelector("div.css-19bb58m");
    By inputArr = By.cssSelector("div.css-1jqq78o-placeholder");
    By calendarAkhir = By.cssSelector("departure-date-end");
    By calendarAwal = By.id("departure-date-start");
    By calendar = By.cssSelector("div.!bg-white");



}
