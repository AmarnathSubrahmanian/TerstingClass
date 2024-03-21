package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		String baseurl = "https://www.sofascore.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.get(baseurl);
		
		String expectedTitle = "sofa score";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String sourcecode = driver.getPageSource();
		
		if(sourcecode.contains("Football"))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
		driver.quit();

	}

}
