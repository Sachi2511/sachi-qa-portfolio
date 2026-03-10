package Practice;
import Practice.utils.DataProviders;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
public void loginDDT(String username, String password, String expectedMessage) {
    DriverFactory1.getDriver().get("https://www.saucedemo.com/");

    Login login = new Login();
    login.login(username, password);
    login.verifyLoginMessage(expectedMessage);
}
}
