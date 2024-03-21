package JUnitPackage;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	String baseurl = "https://www.instagram.com/accounts/login/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		
		
	}
	
	@Test
	public void logIn()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abcde");
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("123456");
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement uname = driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input"));
		uname.sendKeys("abcde");
		WebElement pword = driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		pword.sendKeys("123456");
		pword.submit();
		
		
		
	}
}
