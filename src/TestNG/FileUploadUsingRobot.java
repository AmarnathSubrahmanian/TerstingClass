package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadUsingRobot {
	ChromeDriver driver;
	String baseurl = "https://www.ilovepdf.com/pdf_to_word";
	
	@BeforeTest
	public void loadURL()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void selectFile() throws AWTException
	{
		WebElement selectpdf = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		selectpdf.click();
		fileUpload("C:\\Software Testing Class Docs\\MANUAL TESTING INTERVIEW QUESTIONS.pdf");
	}
	
	public void fileUpload(String p) throws AWTException
	{
		StringSelection str = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
