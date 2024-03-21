package JUnitPackage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkcountUsingTagname {
	
	String baseurl = "https://www.facebook.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
			
	}
	
	@Test
	public void linkCount()
	{
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = "+links.size());
		
		
		for (WebElement link : links) {
            System.out.println("Link text: " + link.getText());
            System.out.println("Link href: " + link.getAttribute("href"));
		}
	}
	
	@After
	public void quit()
	{
		driver.quit();
	}
	
   
}
