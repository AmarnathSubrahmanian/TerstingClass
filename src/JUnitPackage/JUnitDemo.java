package JUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitDemo {
	
	String baseurl = "https://www.cricbuzz.com/";
	ChromeDriver driver; 
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void titleVerification()
	{
		String expected = "Cricbuzz.com";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	@After
	public void tearDown() 
	{
		driver.quit();
	}

}
