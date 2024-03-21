package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); //To launch chrome browser
		
		driver.get("https://www.cricbuzz.com/"); //site url
		String expectedTitle = "cricbuzz";       //title comparison
		String actualTitle = driver.getTitle();
		//System.out.println(expectedTitle.equals(actualTitle));
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();  //close entire browser
		

	}

}
