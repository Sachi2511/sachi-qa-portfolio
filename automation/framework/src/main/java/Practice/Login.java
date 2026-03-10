package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

    private CommonActions actions;

    public Login() {
        PageFactory.initElements(DriverFactory1.getDriver(), this);
        actions = new CommonActions();
    }

    // Locators
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement messageBanner;

    /**
     * Generic login method for Data-Driven Testing
     */
    public void login(String username, String password) {
        actions.type(usernameInput, username);
        actions.type(passwordInput, password);
        actions.click(loginButton);
        actions.visibilityExplicitWait(messageBanner);
    }

    /**
     * Verifies the login message based on expected text from DataProvider
     */
    public void verifyLoginMessage(String expectedMessage) {
        String actualMessage = messageBanner.getText();
        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                "Expected message: [" + expectedMessage + "] but found: [" + actualMessage + "]"
        );
    }
}
