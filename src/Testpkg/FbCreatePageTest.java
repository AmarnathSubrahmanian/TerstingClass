package Testpkg;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.FbCreatePage;

public class FbCreatePageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void createPageTest()
	{
		
		FbCreatePage fbc = new FbCreatePage(driver);
		fbc.clickCreatePage();
		fbc.signUpClick();
		
		String expectedtitle = "create page";
		String title =fbc.titleverification();
		Assert.assertEquals(title, expectedtitle);
	}

}
