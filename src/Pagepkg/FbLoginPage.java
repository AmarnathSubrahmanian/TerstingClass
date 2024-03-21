package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
	WebDriver driver;
	
	By fbemail = By.id("email");
	By fbpassword = By.name("pass");
	By fblogin = By.name("login");

	public FbLoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void setValues(String username, String password)
	{
		driver.findElement(fbemail).sendKeys(username);
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void loginButton()
	{
		driver.findElement(fblogin).click();
	}
}
