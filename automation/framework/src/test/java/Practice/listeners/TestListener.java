package Practice.listeners;

import Practice.reporting.ExtentManager;
import Practice.reporting.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
            // Log the failure in Extent
    ExtentTestManager.getTest().fail(result.getThrowable());

    // Get driver instance from BaseTest
    WebDriver driver = null;
    try {
        BaseTest baseTest = (BaseTest) result.getInstance();
        driver = baseTest.getDriver();
    } catch (Exception e) {
        ExtentTestManager.getTest().warning("Unable to access WebDriver for screenshot.");
        return;
    }

    // Take screenshot
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    // Build file path
    String testName = result.getMethod().getMethodName();
    String filePath = System.getProperty("user.dir") + "/reports/" + testName + ".png";
    File destFile = new File(filePath);

    try {
        FileUtils.copyFile(srcFile, destFile);
        ExtentTestManager.getTest().addScreenCaptureFromPath(filePath, "Screenshot on Failure");
    } catch (IOException e) {
        ExtentTestManager.getTest().warning("Failed to attach screenshot: " + e.getMessage());
    }

    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.getInstance().flush();
    }
}
