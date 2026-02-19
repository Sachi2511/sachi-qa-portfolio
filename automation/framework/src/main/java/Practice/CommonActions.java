package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonActions {

    private WebDriver driver;
    private WebDriverWait wait;

    public CommonActions() {
        this.driver = DriverFactory1.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Wait for element to be visible
    public void visibilityExplicitWait(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Click with wait
    public void click(WebElement element) {
        visibilityExplicitWait(element);
        element.click();
    }

    // Send keys with wait
    public void type(WebElement element, String text) {
        visibilityExplicitWait(element);
        element.clear();
        element.sendKeys(text);
    }

    // Wait for element to be clickable
    public void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Get text with wait
    public String getText(WebElement element) {
        visibilityExplicitWait(element);
        return element.getText();
    }
}
