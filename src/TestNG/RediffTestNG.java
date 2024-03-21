package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffTestNG {
	
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loadUrl()
	{
		driver.get(baseurl);			
	}
	
	@Test(priority=1,groups= {"Smoke"})
	public void titleVerification()
	{
		String expectedtitle = "rediff.com";
		String actualtitle = driver.getTitle();
		System.out.println("Actual Title is : "+actualtitle);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test(priority=2,dependsOnMethods= {"titleVerification"},groups= {"Smoke","Sanity"})
	public void logoVerification()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		if(logo.isDisplayed())
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo not Displayed");
		}
	}
	
	@Test(priority=3,groups= {"Regression"})
	public void buttonEnabled()
	{
		WebElement createAC = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		if(createAC.isEnabled())
		{
			System.out.println("Create A/C button is enabled");
		}
		else
		{
			System.out.println("Create A/C button is not enabled");
		}
	}
	
	@Test(priority=4)
	public void fullnameLabel()
	{
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]"));
		String s1 = fullname.getText();
		if(s1.contains("Full Name"))
		{
			System.out.println("Contains Full Name");
		}
		else
		{
			System.out.println("Not Contains Full Name");
		}
//		if(fullname.isDisplayed())
//		{
//			System.out.println("Fullname is displayed");
//		}
//		else
//		{
//			System.out.println("Fullname not displayed");
//		}
	}
	
	@Test(priority=5)
	public void contentVerification()
	{
		String s = driver.getPageSource();
		if(s.contains("Create a Rediffmail account"))
		{
			System.out.println("Text is Present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	
	@Test(priority=6)
	public void buttonTextVerification()
	{
	    WebElement buttonName = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String s2 = buttonName.getAttribute("value");
		if(s2.equals("Create My Account"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}
	


}
