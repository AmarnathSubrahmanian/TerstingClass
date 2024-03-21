package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	WebDriver driver;
	String baseurl = "https://www.facebook.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void titleVerification()
	{
		driver.get(baseurl);
		String expectedtitle = "Facebook";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle,expectedtitle);
		
		System.out.println("test1"); //execution terminated
	}

}
