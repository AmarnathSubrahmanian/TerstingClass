package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void datePick()
	{
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]/span")).click();
		
		while(true)
		{
			WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
			String monthtext = month.getText();
			
			if(monthtext.equals("June 2024"))
			{
				break;
			}
			else
			{
				WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
				next.click();
			}
		}
		
		 List<WebElement> li =  driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
		 for(WebElement ele : li)
		 {
			 String date = ele.getText();
			 
			 if(date.equals("12"))
			 {
				 ele.click();
			 }
		 }
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
		 
		 
	}

}
