package JUnitPackage;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerification {
	
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void logoVerification()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		
		if(logo.isDisplayed())
		{
			System.out.println("Logo is visible");
		}
		else
		{
			System.out.println("Not Visible");
		}

		WebElement male = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		//male.click();
		boolean value = male.isSelected();
		if(value)
		{
			System.out.println("Can be selected");
		}
		else
		{
			System.out.println("Can't be selected");
		}
		
}
	
	@After
	public void end()
	{
		driver.quit();
	}

}
