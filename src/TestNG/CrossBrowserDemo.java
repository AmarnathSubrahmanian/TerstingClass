package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUP(String browser)
	{
		if(browser.equalsIgnoreCase("chrometest"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
	}
	@Test
	public void test()
	{
		driver.get(baseurl);
	}

}
