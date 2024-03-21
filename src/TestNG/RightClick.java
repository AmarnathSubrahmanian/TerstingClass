package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	
	ChromeDriver driver;
	String baseurl = "https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightClick()
	{
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		edit.click();
		
		
//		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul"));
//		alertbox.click();
		
     	Alert alertbox1 = driver.switchTo().alert();
		String alerttext = alertbox1.getText();
		alertbox1.accept();
		
		
		
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
		
		Alert alertbox2 = driver.switchTo().alert();
		String alerttext2 = alertbox2.getText();
		System.out.println("Alert Text is : "+alerttext2);
		alertbox2.accept();
	  	
	}

}
