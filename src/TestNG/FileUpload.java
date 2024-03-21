package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	
	ChromeDriver driver;
	String baseurl = "https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void selectFile()
	{
		WebElement choosefile = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		choosefile.sendKeys("C:\\Users\\AMARNATH\\Desktop\\MANUAL TESTING INTERVIEW QUESTIONS.pdf");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("Terms of service is ticked");
		}
		else 
		{	 
		      System.out.println("Terms of service is not ticked.");
		}
	
		
		WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")); 
		submitbutton.click();
		String s = submitbutton.getText();
		System.out.println("Button name is "+s);
		
		
	}
	
	

}
