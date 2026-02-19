# 🧪 Sample Tests (TestNG + Page Object Model)

This document explains how automated tests are written in this framework using:

- TestNG  
- Page Object Model (POM)  
- BaseTest for setup/teardown  
- DriverFactory1 for browser management  
- Reusable Page Objects  

The goal is to keep tests clean, readable, and maintainable, while separating test logic from page logic.

---

# 📁 Test Class Location

All test classes are stored under:
# 🧪 Sample Tests (TestNG + Page Object Model)

This document explains how automated tests are written in this framework using:

- TestNG  
- Page Object Model (POM)  
- BaseTest for setup/teardown  
- DriverFactory1 for browser management  
- Reusable Page Objects  

The goal is to keep tests clean, readable, and maintainable, while separating test logic from page logic.

---

# 📁 Test Class Location

All test classes are stored under:


/automation/framework/src/test/java/Practice

Example:
LoginTest.java

Each test class extends `BaseTest`, which handles:

- Browser setup  
- Browser teardown  
- WebDriver lifecycle  

---

# 🧩 How Tests Work in This Framework

### ✔ Tests extend `BaseTest`
This ensures every test automatically gets:

- A WebDriver instance  
- Browser maximization  
- Clean teardown after execution  

### ✔ Tests use Page Objects
Instead of writing locators or WebDriver code inside tests, we use:

```java
Login login = new Login();

This keeps tests readable and business‑focused.
✔ Tests follow a simple pattern
- Open the URL
- Create the page object
- Call the page method (validLogin, invalidLogin, etc.)
- Assertions happen inside the page object

~~Example Test Class: LoginTest.java
package Practice;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        DriverFactory1.getDriver().get("https://the-internet.herokuapp.com/login");
        Login login = new Login();
        login.validLogin();
    }

    @Test
    public void invalidLoginTest() {
        DriverFactory1.getDriver().get("https://the-internet.herokuapp.com/login");
        Login login = new Login();
        login.invalidLogin();
    }
}

## 🧠 Key Concepts Demonstrated

### ✔ Extends BaseTest
No need to write setup or teardown in every test. The BaseTest class handles browser initialization and cleanup automatically.

### ✔ Uses Page Object Model (POM)
Tests interact with clean page objects such as:

```java
Login login = new Login();
This avoids raw WebDriver code inside test classes and keeps tests readable.
✔ Readable Test Flow
Each test method contains only the essential steps, usually 3–4 lines long, making the test easy to understand and maintain.
✔ Assertions Inside Page Object
Assertions are placed inside page methods (e.g., validLogin, invalidLogin), keeping tests focused on behaviour rather than UI details.

🏆 Best Practices Followed
- No locators inside test classes
- No WebDriver code inside test classes
- One test method represents one scenario
- Page Objects handle all UI interactions
- BaseTest manages browser lifecycle
- DriverFactory1 manages browser creation and screenshots

📌 Summary
This framework uses TestNG and the Page Object Model (POM) to create clean, modular, and scalable automated tests.
The LoginTest example demonstrates how simple and readable tests become when using:
- DriverFactory1
- BaseTest
- Page Objects
- CommonActions
This structure reflects real‑world automation frameworks
