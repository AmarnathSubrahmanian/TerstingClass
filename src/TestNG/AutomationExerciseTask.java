package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTask {
	WebDriver driver;
	String baseurl = "https://automationexercise.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	
	}
	
	@Test
	public void operations()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		name.sendKeys("Amarnath");
		WebElement mailid = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		mailid.sendKeys("subrahmanian1.amar@gmail.com");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		login.click();
		
		WebElement MrorMrs = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		MrorMrs.click();
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Amarnath@1995");
		
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails = new Select(day);
		daydetails.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails = new Select(month);
		monthdetails.selectByVisibleText("July");
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails = new Select(year);
		yeardetails.selectByValue("1995");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		checkbox2.click();
		
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstname.sendKeys("Amarnath");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lastname.sendKeys("Subrahmanian");
		
		WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		company.sendKeys("Nil");
		
		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address1.sendKeys("abcdef");
		
		WebElement address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		address2.sendKeys("hijk123");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select selectcountry = new Select(country);
		selectcountry.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		state.sendKeys("Kerala");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Kochi");
		
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		zipcode.sendKeys("683574");
		
		WebElement mobno = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		mobno.sendKeys("9876543210");
		
		WebElement createaccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		createaccount.click();
		
	}
	

}
