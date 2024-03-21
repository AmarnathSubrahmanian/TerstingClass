package Pagepkg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbCreatePage {
	WebDriver driver;
	
	By createpage = By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signup = By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public FbCreatePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickCreatePage()
	{
		driver.findElement(createpage).click();
		
	}
	public String titleverification()
	{
	String actualtitle = driver.getTitle();
	return actualtitle;
	
	}

	
	public void signUpClick()
	{
		driver.findElement(signup).click();
	}

}
