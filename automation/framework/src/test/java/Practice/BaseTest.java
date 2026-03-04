package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

@Listeners(Practice.listeners.TestListener.class)
public class BaseTest {

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {
        // Initialize browser using DriverFactory1
        DriverFactory1.initDriver(browser);
    }

    @AfterMethod
    public void tearDown() {
        // Quit browser after each test
        DriverFactory1.quitDriver();
    }
}
