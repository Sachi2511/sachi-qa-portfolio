
# 🧱 Page Object Model (POM)

The Page Object Model (POM) is a design pattern used in test automation to create an object repository for web UI elements.  
It improves **readability**, **maintainability**, and **reusability** of test scripts by separating page-specific logic from test logic.

This framework uses POM to keep the automation code clean, modular, and scalable.

---

# 📌 Why POM?

Using POM provides several benefits:

- **Separation of concerns**  
  Test logic stays in test classes, while UI locators and actions stay in page classes.

- **Reusability**  
  Common actions (login, navigation, form submission) can be reused across multiple tests.

- **Maintainability**  
  If a locator changes, you update it in one place only.

- **Cleaner test scripts**  
  Tests become readable and behave like business workflows.

---

# 📁 Folder Structure for POM
/automation/framework/src ├── main/java/Practice │       ├── DriverFactory1.java │       ├── CommonActions.java │       └── Login.java        ← Page Object │ └── test/java/Practice ├── BaseTest.java └── LoginTest.java    ← Test class using POM

---

# 🧩 How POM Works in This Framework

### ✔ Each page is represented as a **Java class**  
### ✔ Web elements are defined using **@FindBy**  
### ✔ Actions are written as **methods**  
### ✔ PageFactory initializes elements  
### ✔ Tests call page methods instead of interacting with locators directly  

This keeps tests clean and readable.

---

# 📄 Example: Login Page Object

Below is the actual `Login.java` used in this framework.

```java
package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

    CommonActions ac;

    public Login() {
        PageFactory.initElements(DriverFactory1.getDriver(), this);
        ac = new CommonActions();
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginbtn;

    @FindBy(tagName = "h2")
    public WebElement heading;

    @FindBy(css = "div[id='flash']")
    public WebElement errormsg;

    public void validLogin() {
        ac.visibilityExpilicitWait(username);
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        loginbtn.click();
        Assert.assertEquals(heading.getText(), "Secure Area");
    }

    public void invalidLogin() {
        ac.visibilityExpilicitWait(username);
        username.sendKeys("invalduser");
        password.sendKeys("invalidpassword");
        loginbtn.click();
        Assert.assertTrue(errormsg.getText().contains("Your username is invalid!"));
    }
}
