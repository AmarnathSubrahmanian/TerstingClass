package JUnitPackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	String baseurl = "https://www.amazon.in";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();  //maximize window
	}
	
	@Test
	public void amazonSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Mobiles");
		search.submit();
		
		WebElement amazonpay=driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]"));
		amazonpay.click();
		
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));   
		cart.click();
		
		WebElement menu = driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']"));
		menu.click();
		
	}
	

	
	
	
}
