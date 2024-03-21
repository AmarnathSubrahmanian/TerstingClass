package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoCheckIn {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void datePick()
	{
		driver.get("https://www.trivago.in/en-IN");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		
		WebElement checkin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]"));
		checkin.click();
		
		while(true)
		{
			WebElement month = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
			String monthtext = month.getText();
			
			if(monthtext.equals("May 2024"))
			{
				break;
			}
			else
			{
				WebElement next = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span"));
				next.click();
			}
		}
		
		List<WebElement>li = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement ele : li)
		{
			String date = ele.getText();
			
			if(date.equals("2"))
			{
				ele.click();
				break;
			}
		}
		
		List<WebElement> li2 = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement ele2 : li2)
		{
			String checkout = ele2.getText();
			
			if(checkout.equals("3"))
			{
				ele2.click();
				break;
			}
		}
	}

}
