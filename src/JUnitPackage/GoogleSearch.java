package JUnitPackage;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	String baseurl = "https://www.google.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void googleSearch()
	{
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("football");        //OR         //search.sendKeys("football",Keys.ENTER);
		search.submit();
		
		
		//driver.findElement(By.name("q")).sendKeys("football");
		//driver.findElement(By.xpath("//form[@role='search']/div/div/style/div/div[2]/span/svg/path")).click();
	}
}
