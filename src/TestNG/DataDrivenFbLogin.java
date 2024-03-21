package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenFbLogin {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void dataDriven() throws IOException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FileInputStream fi = new FileInputStream("C:\\Software Testing Class Docs\\FbDataDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		System.out.println("Number of rows = "+rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username - "+username);
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password - "+password);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@name='login']")).click();
			driver.navigate().refresh();
			
		}
	}

}
