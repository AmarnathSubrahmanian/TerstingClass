package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.script.ResultOwnership;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerate {
	
	WebDriver driver;
	ExtentHtmlReporter report;
	ExtentReports extentreport;
	ExtentTest test;
	
	String baseurl = "https://www.facebook.com/";
	
	@BeforeTest
	public void setUptest()
	{
		report = new ExtentHtmlReporter("./Reports/testreport.html");
		report.config().setDocumentTitle("AutomationReport");
		report.config().setReportName("Functional Test");
		report.config().setTheme(Theme.STANDARD);
		
		extentreport = new ExtentReports();
		extentreport.attachReporter(report);
		extentreport.setSystemInfo("Host Name", "LocalHost");
		extentreport.setSystemInfo("OS", "Windows 11");
		extentreport.setSystemInfo("TesterName", "Amar");
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void setUp()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void fbTitleVerification()
	{
		test=extentreport.createTest("fbtitleverification");
		String expectedtitle = "Facebook";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	
	
	@AfterMethod
	public void browserClose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case failed is " +result.getName());
			test.log(Status.FAIL, "Test case failed is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case passed is "+result.getName());
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		extentreport.flush();
	}
	


}
