package JUnitPackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFb {

	String baseurl = "https://www.facebook.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		
		
	}
	
	@Test
	public void ligIn()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
