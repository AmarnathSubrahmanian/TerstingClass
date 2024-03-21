package JUnitPackage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskJanasya {
	
	String baseurl = "https://janasya.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Operations() throws InterruptedException
	{
		Thread.sleep(3000);
		
		String expectedtitle = "janasya";
		String actualtitle = driver.getTitle();
		System.out.println("ACTUAL TITLE IS : " +actualtitle);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		WebElement NewArrivals = driver.findElement(By.xpath("//*[@id=\'HeaderNavigation\']/nav/ul/li[1]/a/span"));
		NewArrivals.click();
		
		WebElement Categories = driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3"));
		Categories.click();
		
		WebElement Kurta = driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span"));
		Kurta.click();
		
		WebElement Search = driver.findElement(By.xpath("//*[@id=\'Search-In-Modal\']"));
		Search.sendKeys("Kurta");
		Search.submit();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = "+links.size());
	}
	@After
	public void close()
	{
		driver.quit();
	}
	

}
