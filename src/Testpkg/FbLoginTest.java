package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.FbLoginPage;

public class FbLoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest()
	{
		FbLoginPage fbl = new FbLoginPage(driver);
		fbl.setValues("abc@gmail.com", "0123456");
		fbl.loginButton();
	}

}
