package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;
import java.io.IOException;


public class DriverFactory1 {

    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    // Launch browser
    public static WebDriver initDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            tlDriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("edge")) {
            tlDriver.set(new EdgeDriver());
        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        getDriver().manage().window().maximize();
        return getDriver();
    }

    // Get driver instance
    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    // Quit driver
    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            tlDriver.remove();
        }
    }

    // Screenshot utility
    public static String takeScreenshot(String testName) {
        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+File.separator+"reports"+File.separator+"screenshots"+File.separator+System.currentTimeMillis()+".png";
        try {
		       File dest= new File(path);
		       FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}
