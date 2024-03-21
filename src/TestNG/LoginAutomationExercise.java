package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAutomationExercise {
	ChromeDriver driver;
	
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void logIn()
	{
		driver.get("https://automationexercise.com/login");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		username.sendKeys("amarnathspirit@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
		password.sendKeys("Amarnath@1995");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		String expectedUrl ="https://automationexercise.com/";
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is Matching");
		}
		else
		{
			System.out.println("Url is not matching");
		}
		
	}

}
