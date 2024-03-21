package TestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IphoneTest {
    WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void search() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String home = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		String expectedtitle = "Amazon.in:iphones";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not matched");
		}
		
		Set<String> multiplewindow = driver.getWindowHandles();
		for(String secondtab : multiplewindow)
		{
			if(!secondtab.equalsIgnoreCase(home))
			{
				driver.switchTo().window(secondtab);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span")).click();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form")).click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"))).click();
			}
		}
	}


}
