package JUnitPackage;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	String baseurl = "https://www.facebook.com/";
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void screenShot() throws IOException
	{
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("./ScreenShot/fbscreenshot.png"));
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		File ss1 = loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss1, new File("./ScreenShot/Loginbutton.png"));
	}
	
	@After
	public void quit()
	{
		driver.quit();
	}
}
