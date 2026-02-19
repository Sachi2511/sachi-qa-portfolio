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

    // Valid login method
    public void validLogin() {
        actions.type(usernameInput, "tomsmith");
        actions.type(passwordInput, "SuperSecretPassword!");
        actions.click(loginButton);

        actions.visibilityExplicitWait(messageBanner);
        String msg = messageBanner.getText();

        Assert.assertTrue(msg.contains("You logged into a secure area!"),
                "Expected success message not found. Actual: " + msg);
    }

    // Invalid login method
    public void invalidLogin() {
        actions.type(usernameInput, "wrongUser");
        actions.type(passwordInput, "wrongPass");
        actions.click(loginButton);

        actions.visibilityExplicitWait(messageBanner);
        String msg = messageBanner.getText();

        Assert.assertTrue(msg.contains("Your username is invalid!") ||
                          msg.contains("Your password is invalid!"),
                "Expected error message not found. Actual: " + msg);
    }
}
