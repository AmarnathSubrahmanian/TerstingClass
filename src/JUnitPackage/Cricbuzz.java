package JUnitPackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	
	String baseurl = "https://www.cricbuzz.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void myAccount()
	{
		//driver.findElement(By.className("cb-plus-ico cb-user-icon")).click();
		//driver.findElement(By.id("cb-user-email-input")).sendKeys("abcd");
		//driver.findElement(By.id("cb-login-continue-button")).click();
		
		List<WebElement> linkcount =driver.findElements(By.tagName("a"));
		System.out.println(linkcount.size());
	}
}
