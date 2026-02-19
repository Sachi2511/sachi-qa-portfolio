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
