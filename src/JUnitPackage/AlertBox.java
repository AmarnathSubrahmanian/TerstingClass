package JUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	
	ChromeDriver driver;
	String baseurl = "file:///C:/Users/AMARNATH/Desktop/alertbox.html";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Operations()
	{
		WebElement alertbox = driver.findElement(By.xpath("/html/body/input[1]"));
		alertbox.click();
		
		
		Alert a = driver.switchTo().alert();
		String alerttext = a.getText();
		System.out.println("alert text is : "+alerttext);
		a.accept();
		
		
		
		
		WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
		firstname.sendKeys("Amar");
		
		
		WebElement lastname = driver.findElement(By.xpath("/html/body/input[3]"));
		lastname.sendKeys("Nath");
		
		
		WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
		submit.click();
	}
	
	@After
	public void terminate()
	{
		//driver.quit();
	}
}
