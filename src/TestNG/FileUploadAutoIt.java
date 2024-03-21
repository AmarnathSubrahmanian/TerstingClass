package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoIt {
	WebDriver driver;
	
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void main() throws InterruptedException, IOException
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Software Testing Class Docs\\AutoIt\\ManualQuestions.exe");
		Thread.sleep(3000);
		
	}

}
