package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowHandler {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void testing()
	{
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		//System.out.println("Window Title is - "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String secondtab : allwindowhandles)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(secondtab);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
		
		}
		
		
	}


}
