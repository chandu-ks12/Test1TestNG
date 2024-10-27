package ExtentReportDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener {

    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Configure the report before any tests start
        htmlReporter = new ExtentSparkReporter("ExtentReportDemoooo.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        // System information
        reports.setSystemInfo("Machine", "testpc1");
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("User", "pc1");
        reports.setSystemInfo("Browser", "Chrome");

        // Report configuration
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Functional Testing");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a new test entry in the report
        test = reports.createTest(result.getName());
        System.out.println("Test started: " + result.getName());
    }
  
    @Override
    public void onTestSuccess(ITestResult result) {
        // Log success in the report
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " passed", ExtentColor.GREEN));
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log failure in the report
        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " failed", ExtentColor.RED));
        test.fail(result.getThrowable()); // Log the exception that caused the failure
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Log skipped tests in the report
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " skipped", ExtentColor.ORANGE));
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Handle partial successes (not used often)
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the report when all tests are finished
        reports.flush();
        System.out.println("Test execution finished: " + context.getName());
    }
}
