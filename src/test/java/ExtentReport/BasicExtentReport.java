package ExtentReport;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		// Add environment info
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("User", "pc1");
		reports.setSystemInfo("Browser", "Chrome");

		// Configuration
		htmlReporter.config().setDocumentTitle("Automation Report"); // Title of the report
		htmlReporter.config().setReportName("Functional Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD); // Theme of the report
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')' ");
	}

	@Test
	public void LaunchBrowser() {
		test = reports.createTest("Browser Launch and Open URL");
		Assert.assertTrue(true); // Pass condition
	}

	@Test
	public void LaunchBrowserAndOpenURL() {
		test = reports.createTest("Verify Title");
		Assert.assertTrue(false); // Fail condition
	}

	@Test
	public void VerifyLogo() {
		test = reports.createTest("Verify Logo");
		Assert.assertTrue(true); // Pass condition
	}

	@AfterMethod
	public void getTestResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Passed", ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Skipped", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void tearDown() {
		reports.flush(); // Write everything to the report
	}
}