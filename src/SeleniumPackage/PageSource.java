package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		
		String baseurl = "https://www.cricbuzz.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.get(baseurl);
		
		String s = driver.getPageSource();  //To get page source code
		if(s.contains("Live Score"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("No Such Words");
		}
		
		driver.quit();

	}

}
