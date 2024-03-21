package JUnitPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkValidation {
	
	String baseurl = "https://www.google.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void linkValidation()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links"+links.size());
		
		for(WebElement link : links)
		{
		String li	=link.getAttribute("href");
			
			verify(li);
		}
	}

	private void verify(String li) {
		try
		{
			URL u = new URL(li);
			HttpURLConnection con =(HttpsURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response code is 200 -- Successfull");
			}
			else
			{
				System.out.println("Other Response code");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	

}
