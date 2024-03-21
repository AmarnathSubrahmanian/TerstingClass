package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBtestNG {
	String baseurl ="https://www.facebook.com/";
	ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	
	@Parameters({"username","password"})
	@Test
	public void test(String username, String password)
	{
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@name='login']")).click();
	}

}
