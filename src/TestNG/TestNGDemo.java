package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Run URL");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Open Web Site");
	}
	
	@Test(priority=3,invocationCount=3)
	public void test()
	{
		System.out.println("Test");
	}
	
	@Test(priority=2,enabled=false)
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Close Window");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Close URL");
	}

}
