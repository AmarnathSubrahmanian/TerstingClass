package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	
	@Parameters({"Tool"})
	@Test
	public void test(String Tool)
	{
		System.out.println("Valus is : "+Tool);
	}

}
